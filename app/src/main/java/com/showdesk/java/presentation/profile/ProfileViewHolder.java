package com.showdesk.java.presentation.profile;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.showdesk.java.entity.Entity;
import com.showdesk.java.entity.UserEntity;
import com.showdesk.java.presentation.profile.viewholder.AbsProfileItemViewHolder;
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

    public ProfileViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bind(Entity item) {
        Observable.just(item)
                .filter(i -> i instanceof UserEntity)
                .cast(UserEntity.class)
                .subscribe(user -> mNameView.setText(user.getName()));
    }
}
