package com.limingjian.testretrofit;

import com.limingjian.testretrofit.cookies.CookiesManager;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by lmj on 2018/7/8.
 */
public class OkHttpClientManger {

    private static OkHttpClient okHttpClient;

    public static OkHttpClient getOkHttpClient(){

        if (okHttpClient == null) {
            synchronized (OkHttpClientManger.class) {
                if (okHttpClient == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    if (BuildConfig.DEBUG) {
                        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
                        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
                        builder.addInterceptor(loggingInterceptor);
                    }
                    File cacheFile = new File(Constants.PATH_CACHE);
                    Cache cache = new Cache(cacheFile, 1024 * 1024 * 50);
                    Interceptor cacheInterceptor = chain -> {
                        Request request = chain.request();
                        if (!NetUtil.isNetworkAvailable(MyApplication.getInstance().getApplicationContext())) {
                            request = request.newBuilder()
                                    .cacheControl(CacheControl.FORCE_CACHE)
                                    .build();
                        }
                        Response response = chain.proceed(request);
                        if (NetUtil.isNetworkAvailable(MyApplication.getInstance().getApplicationContext())) {
                            int maxAge = 0;
                            // 有网络时, 不缓存, 最大保存时长为0
                            response.newBuilder()
                                    .header("Cache-Control", "public, max-age=" + maxAge)
                                    .removeHeader("Pragma")
                                    .build();
                        } else {
                            // 无网络时，设置超时为4周
                            int maxStale = 60 * 60 * 24 * 28;
                            response.newBuilder()
                                    .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                                    .removeHeader("Pragma")
                                    .build();
                        }
                        return response;
                    };
                    //设置缓存
                    builder.addNetworkInterceptor(cacheInterceptor);
                    builder.addInterceptor(cacheInterceptor);
                    builder.cache(cache);
                    //设置超时
                    builder.connectTimeout(10, TimeUnit.SECONDS);
                    builder.readTimeout(20, TimeUnit.SECONDS);
                    builder.writeTimeout(20, TimeUnit.SECONDS);
                    //错误重连
                    builder.retryOnConnectionFailure(true);
                    //cookie认证
                    builder.cookieJar(new CookiesManager());
                    okHttpClient = builder.build();
                    return okHttpClient;
                }
            }
        }

        return okHttpClient;
    }
}
