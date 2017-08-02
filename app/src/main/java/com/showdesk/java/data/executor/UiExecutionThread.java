package com.showdesk.java.data.executor;

import com.showdesk.java.domain.executor.PostExecutionThread;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public class UiExecutionThread implements PostExecutionThread {

    @Override
    public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }
}
