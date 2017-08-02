package com.showdesk.java.data.entity;

import android.support.annotation.Nullable;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

@Getter
@Setter
public class Response<T> {

    @Nullable
    public T data;
}
