package com.limingjian.testretrofit;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by lmj on 2018/7/8.
 */
public interface TestApi {

    @POST("unite/service")
    Observable<ResponseBody> getImages(@Body RequestBody param);
}
