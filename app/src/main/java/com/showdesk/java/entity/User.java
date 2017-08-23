package com.showdesk.java.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by ladmusician.kim on 01/08/2017.
 */
@Getter
@Setter
public class User extends Entity {

    private String name;
    private int followerCount;
    private int followingCount;
}
