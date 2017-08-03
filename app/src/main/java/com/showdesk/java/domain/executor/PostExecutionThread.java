package com.showdesk.java.domain.executor;

import io.reactivex.Scheduler;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public interface PostExecutionThread {

    Scheduler getScheduler();
}
