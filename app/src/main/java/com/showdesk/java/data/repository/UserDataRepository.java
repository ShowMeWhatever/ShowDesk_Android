package com.showdesk.java.data.repository;

import com.showdesk.java.data.datasource.UserDatasource;
import com.showdesk.java.data.datasource.UserRemoteDatasource;
import com.showdesk.java.domain.mapper.UserMapper;
import com.showdesk.java.domain.model.User;
import com.showdesk.java.domain.repository.UserRepository;

import io.reactivex.Single;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public class UserDataRepository implements UserRepository {

    private UserDataRepository() {
    }

    private static class UserDataRepositoryLazyHolder {
        static final UserDataRepository INSTANCE = new UserDataRepository();
    }

    public static UserDataRepository getInstance() {
        return UserDataRepositoryLazyHolder.INSTANCE;
    }

    @Override
    public Single<User> getUser(int userId) {
        UserDatasource datasource = new UserRemoteDatasource();

        return datasource.getUser(userId)
                .map(UserMapper::fromJson);
    }
}
