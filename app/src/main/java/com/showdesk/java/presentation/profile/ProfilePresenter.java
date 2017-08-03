package com.showdesk.java.presentation.profile;

import com.showdesk.java.domain.interaction.GetUserUsecase;
import com.showdesk.java.domain.repository.UserRepository;
import com.showdesk.java.entity.UserEntity;
import com.showdesk.java.presentation.profile.viewmodel.ProfileViewModel;

/**
 * Created by ladmusician.kim on 2017. 8. 3..
 */

public class ProfilePresenter implements ProfileContract.Presenter {

    private ProfileContract.View mView;
    private GetUserUsecase mGetUserUsecase;
    private UserRepository mUserRepository;

    public ProfilePresenter(
            ProfileContract.View view,
            GetUserUsecase usercase) {

        mView = view;
        mGetUserUsecase = usercase;
        mView.setPresenter(this);
    }

    @Override
    public void subscribe() {
        mGetUserUsecase.execute(user -> {
            ProfileViewModel profileViewModel = new ProfileViewModel();
            UserEntity mUser = new UserEntity();
            mUser.setName(user.getName());
            profileViewModel.setMUser(mUser);
            mView.setItem(profileViewModel);
            mView.refresh();
        });
    }

    @Override
    public void unsubscribe() {

    }
}
