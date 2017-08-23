package com.showdesk.java.presentation.profile.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.showdesk.java.entity.Entity;
import com.showdesk.java.entity.User;
import com.showdesk.showdesk.R;

import butterknife.BindView;
import io.reactivex.Observable;

/**
 * Created by ladmusician.kim on 01/08/2017.
 */

public class ProfileViewHolder extends AbsProfileItemViewHolder<Entity> {

    @BindView(R.id.profile_user_imageview)
    ImageView mProfileImageView;
    @BindView(R.id.profile_user_name_textview)
    TextView mNameView;
    @BindView(R.id.profile_user_info_textview)
    TextView mInfo;

    public ProfileViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bind(Entity item) {
        Observable.just(item)
                .filter(i -> i instanceof User)
                .cast(User.class)
                .subscribe(user -> {
                    mNameView.setText(user.getName());
                    mInfo.setText(
                            itemView.getContext().getString(R.string.profile_user_info_follower) +
                            user.getFollowerCount() +
                            itemView.getContext().getString(R.string.center_dot) +
                            itemView.getContext().getString(R.string.profile_user_info_follower) +
                            user.getFollowingCount());
                });
    }
}
