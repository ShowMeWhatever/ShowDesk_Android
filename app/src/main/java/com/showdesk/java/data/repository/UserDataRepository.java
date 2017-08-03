package com.showdesk.java.data.repository;

import com.showdesk.java.data.datasource.UserDatasource;
import com.showdesk.java.data.datasource.UserRemoteDatasource;
import com.showdesk.java.domain.repository.UserRepository;
import com.showdesk.java.entity.UserEntity;
import com.showdesk.java.entity.mapper.UserMapper;

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
    public Single<UserEntity> getUser() {
        UserDatasource datasource = new UserRemoteDatasource();
        int testUserId = 1;
        return datasource.getUser(testUserId)
                .map(UserMapper::fromJson);
    }
}
