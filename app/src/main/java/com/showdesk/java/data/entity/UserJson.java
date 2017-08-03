package com.showdesk.java.data.entity;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

@Getter
@Setter
public class UserJson {

    @SerializedName("name")
    String name;
}
