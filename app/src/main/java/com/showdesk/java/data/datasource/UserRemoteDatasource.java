package com.showdesk.java.data.datasource;

import com.showdesk.java.data.api.UserApi;
import com.showdesk.java.data.entity.Response;
import com.showdesk.java.data.entity.UserJson;

import io.reactivex.Single;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public class UserRemoteDatasource extends RemoteDatasource implements UserDatasource {

    @Override
    public Single<UserJson> getUser(int userId) {
        return createRequest(UserApi.class).getUser(userId)
                .map(Response::getData);
    }
}
