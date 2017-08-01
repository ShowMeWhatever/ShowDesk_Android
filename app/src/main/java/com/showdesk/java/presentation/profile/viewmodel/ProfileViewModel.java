package com.showdesk.java.presentation.profile.viewmodel;

import android.support.annotation.Nullable;

import com.showdesk.java.entity.Entity;
import com.showdesk.java.entity.FeedEntity;
import com.showdesk.java.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by ladmusician.kim on 01/08/2017.
 */

@Getter
@Setter
public class ProfileViewModel {

    private UserEntity mUser;
    private List<FeedEntity> mFeedItemList = new ArrayList<>();

    public ProfileViewModel() {
        mUser = new UserEntity();
        mUser.setName("Test Username");
    }

    public int count() {
        return mFeedItemList.size() + (mUser != null ? 1 : 0);
    }

    @Nullable
    public Entity get(int position) {
        if (mUser != null) {
            return position == 0 ? mUser :
                    position >= mFeedItemList.size() ? null :
                            mFeedItemList.get(position);
        }
        return null;
    }
}