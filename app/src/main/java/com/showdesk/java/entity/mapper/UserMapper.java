package com.showdesk.java.entity.mapper;

import com.showdesk.java.data.entity.UserJson;
import com.showdesk.java.entity.UserEntity;

/**
 * Created by ladmusician.kim on 03/08/2017.
 */

public class UserMapper {

    public static UserEntity fromJson(UserJson json) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(json.getName());
        return userEntity;
    }
}
