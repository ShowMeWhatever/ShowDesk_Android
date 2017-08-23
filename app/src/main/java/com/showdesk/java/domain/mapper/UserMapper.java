package com.showdesk.java.domain.mapper;

import com.showdesk.java.data.entity.UserJson;
import com.showdesk.java.domain.model.User;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public class UserMapper {

    public static User fromJson(UserJson json) {
        User user = new User();
        user.setName(json.getName());
        return user;
    }
}