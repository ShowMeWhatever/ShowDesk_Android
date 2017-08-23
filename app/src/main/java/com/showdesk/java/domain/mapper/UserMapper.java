package com.showdesk.java.domain.mapper;

import com.showdesk.java.data.entity.UserJson;
import com.showdesk.java.entity.User;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public class UserMapper {

    public static User fromJson(UserJson json) {
        User user = new User();
        user.setName(json.getUsername());
        user.setFollowerCount(json.getFollowerCount());
        user.setFollowingCount(json.getFollowingCount());
        return user;
    }
}
