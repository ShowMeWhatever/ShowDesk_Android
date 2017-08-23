package com.showdesk.java.presentation.profile.viewmodel;

import android.support.annotation.Nullable;

import com.showdesk.java.entity.Entity;
import com.showdesk.java.entity.Feed;
import com.showdesk.java.entity.User;

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

    private User mUser;
    private List<Feed> mFeedItemList = new ArrayList<>();

    public ProfileViewModel() {
        for(int i = 0; i < 10; i ++) {
            Feed feed = new Feed();
            feed.setTitle("test" + i +1);
            feed.setContent("content" + i +1);
        }
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