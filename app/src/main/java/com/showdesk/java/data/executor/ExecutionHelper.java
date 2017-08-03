package com.showdesk.java.data.executor;

import com.showdesk.java.domain.executor.ExecutionThread;
import com.showdesk.java.domain.executor.PostExecutionThread;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public class ExecutionHelper {

    private static final JobExecutionThread JOB_EXECUTIONS_THREAD;
    private static final UiExecutionThread UI_EXECUTIONS_THREAD;

    static {
        JOB_EXECUTIONS_THREAD = new JobExecutionThread();
        UI_EXECUTIONS_THREAD = new UiExecutionThread();
    }

    public static ExecutionThread job() {
        return JOB_EXECUTIONS_THREAD;
    }

    public static PostExecutionThread ui() {
        return UI_EXECUTIONS_THREAD;
    }
}
