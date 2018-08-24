package com.limingjian.testretrofit;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;

import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String s = composeRequestMessage(new RequestParamMerchantCode("JMT0703"), "queryMerchantStarPayRate");
        RequestBody body= RequestBody.create(okhttp3.MediaType.parse("application/json;charset=GBK"),s);

       RetrofitClient.getApiService().getImages(body)
               .map(new Function<ResponseBody, String>() {
                   @Override
                   public String apply(ResponseBody responseBody) throws Exception {
                       ResMessageBean resMessageBean = JSONObject.parseObject(responseBody.string(), ResMessageBean.class);
                       ResultBean resultBean =  JSONObject.parseObject(resMessageBean.getSvcContBean().getResult(), ResultBean.class);
                       return resultBean.getResultData();
                   }
               })
               .subscribeOn(Schedulers.io())
               .observeOn(AndroidSchedulers.mainThread())
               .subscribe(new Consumer<String>() {
                   @Override
                   public void accept(String s) throws Exception {
                       Log.d(TAG, s);
                   }
               });


}
    public static ObservableTransformer<ResponseBody,String> rxSchedulerHelper() {
        return new ObservableTransformer<ResponseBody, String>() {
            @Override
            public ObservableSource<String> apply(io.reactivex.Observable<ResponseBody> upstream) {
                return null;
            }
        };
    }


    public static String composeRequestMessage(Object obj, String setServiceCode) {
        TcpContBean tcpCont = new TcpContBean();
        tcpCont.setSrcSysID("1003");
        tcpCont.setServiceCode(setServiceCode);
        tcpCont.setSrcSysPassWord("1003");
        tcpCont.setSrcSysSign("123456");
        tcpCont.setTransactionID("1322017119413");
        List<SvcContBean> svContLst = new ArrayList<>();
        SvcContBean svcCont = new SvcContBean();
        svcCont.setParams(obj);
        svContLst.add(svcCont);
        Map<String, Object> map = new HashMap<>();
        map.put("SvcCont", svContLst);
        map.put("TcpCont", tcpCont);
        return JSONObject.toJSONString(map);
    }

}
