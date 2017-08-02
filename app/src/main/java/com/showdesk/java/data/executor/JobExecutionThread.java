package com.showdesk.java.data.executor;

import com.showdesk.java.domain.executor.ExecutionThread;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public class JobExecutionThread implements ExecutionThread {

    @Override
    public Scheduler getScheduler() {
        return Schedulers.io();
    }
}
