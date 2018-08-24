package com.limingjian.testretrofit;

import java.io.File;

/**
 * Created by lmj on 2018/7/8.
 */
public class Constants {
    /**
     * Path
     */
    public static final String PATH_DATA = MyApplication.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/NetCache";
}
