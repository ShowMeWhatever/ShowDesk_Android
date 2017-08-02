package com.showdesk.java;

import android.app.Application;
import android.content.Context;

import com.showdesk.util.net.ShowDeskRetrofit;

/**
 * Created by ladmusician.kim on 31/07/2017.
 */

public class ShowDeskApplication extends Application {

    private static Context sAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sAppContext = getApplicationContext();

        // init retrofit config
        ShowDeskRetrofit.getInstance().init();
    }

    public static Context getContext() {
        return sAppContext;
    }
}
