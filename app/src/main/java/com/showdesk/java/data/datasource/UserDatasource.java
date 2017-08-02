package com.showdesk.java.data.datasource;

import com.showdesk.java.data.entity.UserJson;

import io.reactivex.Single;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public interface UserDatasource {

    Single<UserJson> getUser(int userId);
}
