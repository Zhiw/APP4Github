package com.zhiw.app4github.common.utils;

import com.orhanobut.logger.Logger;
import com.zhiw.app4github.BuildConfig;

/**
 * ClassName: LogUtil
 * Desc:
 * Created by zhiw on 16/9/18.
 */

public class LogUtil {
    private static final String TAG = "App4Github";


    public static void init() {
        Logger.init(TAG);
    }


    public static void i(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.i(msg);
        }
    }


    public static void d(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.d(msg);
        }
    }


    public static void w(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.w(msg);
        }
    }


    public static void e(String msg) {
        Logger.e(msg);
    }

    public static void e(Throwable e) {
        Logger.e(e, "");
    }
}
