package com.siddik.siddiksummer2017;

import android.app.Application;

import com.siddik.siddiksummer2017.util.UtilLog;

/**
 * Created by Sidleh on 6/19/2017.
 */

public class SiddikApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setIsLog(true);
    }
}
