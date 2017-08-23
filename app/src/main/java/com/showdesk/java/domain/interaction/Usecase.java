package com.showdesk.java.domain.interaction;

import com.showdesk.java.domain.executor.ExecutionThread;
import com.showdesk.java.domain.executor.PostExecutionThread;

import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public abstract class Usecase<T> {

    private final ExecutionThread executionThread;
    private final PostExecutionThread postExecutionThread;
    private Disposable disposable;

    public Usecase(ExecutionThread executionThread, PostExecutionThread postExecutionThread) {
        this.executionThread = executionThread;
        this.postExecutionThread = postExecutionThread;
    }

    protected abstract Single<T> buildUseCaseSingle();

    public void execute(Consumer<T> consumer, Consumer<Throwable> errorConsumer) {
        Single<T> single = buildUseCaseSingle();

        if (executionThread != null) {
            single = single.subscribeOn(executionThread.getScheduler());
        }
        if (postExecutionThread != null) {
            single = single.observeOn(postExecutionThread.getScheduler());
        }

        disposable = single.subscribe(consumer, errorConsumer);
    }

    public void dispose() {
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
    }
}
