package com.showdesk.java.domain.interaction;

import com.showdesk.java.domain.executor.ExecutionThread;
import com.showdesk.java.domain.executor.PostExecutionThread;
import com.showdesk.java.domain.model.User;
import com.showdesk.java.domain.repository.UserRepository;

import io.reactivex.Single;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public class GetUserUsecase extends Usecase<User> {

    int mUserId;
    UserRepository mUserRepository;

    public GetUserUsecase(
            int userId,
            ExecutionThread executionThread,
            PostExecutionThread postExecutionThread,
            UserRepository mProfileRepository) {
        super(executionThread, postExecutionThread);
        this.mUserRepository = mProfileRepository;
        this.mUserId = userId;
    }

    @Override
    protected Single<User> buildUseCaseSingle() {
        return mUserRepository.getUser(mUserId);
    }
}
