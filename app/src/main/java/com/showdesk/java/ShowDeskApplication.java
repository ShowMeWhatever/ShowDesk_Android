package com.showdesk.java;

import android.app.Application;
import android.content.Context;

/**
 * Created by ladmusician.kim on 31/07/2017.
 */

public class ShowDeskApplication extends Application {

    private static Context sAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sAppContext = getApplicationContext();
    }

    public static Context getContext() {
        return sAppContext;
    }
}
