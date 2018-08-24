package com.limingjian.testretrofit;

import android.app.Application;

/**
 * Created by lmj on 2018/7/8.
 */
public class MyApplication extends Application {

    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static synchronized MyApplication getInstance() {
        return instance;
    }
}
