package com.limingjian.testretrofit;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.SparseArray;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;

import org.reactivestreams.Publisher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;

import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
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

        HashMap<String, String> map = new HashMap<>();
        map.put("merchantCode", "JMT0628");
        String s = composeRequestMessage("queryTodayAmount", map);
        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json;charset=GBK"), s);

        /*RetrofitClient.getApiService().getImages(body)
                .compose(rxTranslateBean(HashMap.class))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<HashMap>() {
                    @Override
                    public void accept(HashMap percentBeans) throws Exception {

                    }
                });*/
        RetrofitClient.getApiService().getImages(body)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ResponseData>() {
                    @Override
                    public void accept(ResponseData responseData) throws Exception {

                    }
                });


    }

    public static <T> ObservableTransformer<ResponseBody, ArrayList<T>> rxTranslateToList(Class<T> tClass) {
        return new ObservableTransformer<ResponseBody, ArrayList<T>>() {
            @Override
            public ObservableSource<ArrayList<T>> apply(io.reactivex.Observable<ResponseBody> upstream) {
                return upstream.map(new Function<ResponseBody, ArrayList<T>>() {
                    @Override
                    public ArrayList<T> apply(ResponseBody responseBody) throws Exception {
                        ResMessageBean resMessageBean = JSONObject.parseObject(responseBody.string(), ResMessageBean.class);
                        ResultBean resultBean = JSONObject.parseObject(resMessageBean.getSvcContBean().getResult(), ResultBean.class);
                        return new ArrayList<>(JSONObject.parseArray(resultBean.getResultData(), tClass));
                    }
                });
            }
        };
    }



    public static <T> ObservableTransformer<ResponseBody, T> rxTranslateBean(Class<T> clazz) {
        return new ObservableTransformer<ResponseBody, T>() {
            @Override
            public ObservableSource<T> apply(io.reactivex.Observable<ResponseBody> upstream) {
                return upstream.map(new Function<ResponseBody, T>() {
                    @Override
                    public T apply(ResponseBody responseBody) throws Exception {
                        ResMessageBean resMessageBean = JSONObject.parseObject(responseBody.string(), ResMessageBean.class);
                        ResultBean resultBean = JSONObject.parseObject(resMessageBean.getSvcContBean().getResult(), ResultBean.class);
                        return JSONObject.parseObject(resultBean.getResultData(), clazz);
                    }
                });
            }
        };
       /*return new FlowableTransformer<ResponseBody, Object>() {
           @Override
           public Publisher<Object> apply(Flowable<ResponseBody> upstream) {
               return upstream.map(new Function<ResponseBody, Object>() {
                   @Override
                   public Object apply(ResponseBody responseBody) throws Exception {
                       ResMessageBean resMessageBean = JSONObject.parseObject(responseBody.string(), ResMessageBean.class);
                       ResultBean resultBean =  JSONObject.parseObject(resMessageBean.getSvcContBean().getResult(), ResultBean.class);
                       return JSONObject.parseObject(resultBean.getResultData(),Object.class);
                   }
               });
           }
       };*/
    }


    public static String composeRequestMessage(String setServiceCode, HashMap<String, String> params) {
        TcpContBean tcpCont = new TcpContBean();
        tcpCont.setSrcSysID("1003");
        tcpCont.setServiceCode(setServiceCode);
        tcpCont.setSrcSysPassWord("1003");
        tcpCont.setSrcSysSign("123456");
        tcpCont.setTransactionID("1322017119413");
        List<SvcContBean> svContLst = new ArrayList<>();
        SvcContBean svcCont = new SvcContBean();
        svcCont.setParams(params);
        svContLst.add(svcCont);
        Map<String, Object> map = new HashMap<>();
        map.put("SvcCont", svContLst);
        map.put("TcpCont", tcpCont);
        return JSONObject.toJSONString(map);
    }

    public static String composeRequestMessage(String setServiceCode, Object params) {
        TcpContBean tcpCont = new TcpContBean();
        tcpCont.setSrcSysID("1003");
        tcpCont.setServiceCode(setServiceCode);
        tcpCont.setSrcSysPassWord("1003");
        tcpCont.setSrcSysSign("123456");
        tcpCont.setTransactionID("1322017119413");
        List<SvcContBean> svContLst = new ArrayList<>();
        SvcContBean svcCont = new SvcContBean();
        svcCont.setParams(params);
        svContLst.add(svcCont);
        Map<String, Object> map = new HashMap<>();
        map.put("SvcCont", svContLst);
        map.put("TcpCont", tcpCont);
        return JSONObject.toJSONString(map);
    }

}
