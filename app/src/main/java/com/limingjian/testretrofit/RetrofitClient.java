package com.limingjian.testretrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lmj on 2018/3/28.
 */

public class RetrofitClient {

    public static final String BASE_URL = "http://47.104.233.134:8093/";

    private RetrofitClient(){

    }

    private static Retrofit mRetrofit = null;

    private static Retrofit getRetrofitClient() {
        if (mRetrofit == null) {
            synchronized (RetrofitClient.class) {
                if (mRetrofit == null) {
                    mRetrofit = new Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .client(OkHttpClientManger.getOkHttpClient())
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .build();
                }
            }
        }
        return mRetrofit;
    }

    public static TestApi getApiService() {
        return getRetrofitClient().create(TestApi.class);
    }
}
