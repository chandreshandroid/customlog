package com.chandresh.customlog;

import android.util.Log;


/**
 * Created by chandresh on 18/08/2017.
 */
public class customLog {

    public static final boolean ENABLE_LOG = BuildConfig.LOG;


    public static void d(String tag, String msg) {

        if(ENABLE_LOG)
            Log.d(tag, msg);
    }

    public static void i(String tag, String msg) {

        if(ENABLE_LOG)
            Log.i(tag, msg);
    }

    public static void w(String tag, String msg) {

        if(ENABLE_LOG)
            Log.w(tag, msg);
    }
 public static void e(String tag, String msg) {

        if(ENABLE_LOG)
            Log.w(tag, msg);
    }




/*    public static void d(String tag, String msg) {

        if(ENABLE_LOG)
            customLog.d(tag, msg);
    }

    public static void i(String tag, String msg) {

        if(ENABLE_LOG)
            Log.i(tag, msg);
    }

    public static void w(String tag, String msg) {

        if(ENABLE_LOG)
            Log.w(tag, msg);
    } public static void e(String tag, String msg) {

        if(ENABLE_LOG)
            Log.w(tag, msg);
    }public static void v(String tag, String msg) {

        if(ENABLE_LOG)
            Log.w(tag, msg);
    }*/
}