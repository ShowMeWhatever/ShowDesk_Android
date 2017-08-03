package com.showdesk.java.presentation.profile;


import com.showdesk.java.presentation.common.BasePresenter;
import com.showdesk.java.presentation.common.BaseView;
import com.showdesk.java.presentation.profile.viewmodel.ProfileViewModel;

interface ProfileContract {

    interface View extends BaseView<Presenter> {

        void setItem(ProfileViewModel model);

        void refresh();
    }

    interface Presenter extends BasePresenter {

    }
}
