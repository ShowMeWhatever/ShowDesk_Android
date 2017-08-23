package com.showdesk.java.domain.repository;

import com.showdesk.java.entity.User;

import io.reactivex.Single;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public interface UserRepository extends Repository {

    Single<User> getUser(int userId);
}
