package com.showdesk.java.data.api;

import com.showdesk.java.data.entity.Response;
import com.showdesk.java.data.entity.UserJson;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public interface UserApi {

    @GET("users/{userId}")
    Single<Response<UserJson>> getUser(
            @Path("userId") int userId
    );
}
