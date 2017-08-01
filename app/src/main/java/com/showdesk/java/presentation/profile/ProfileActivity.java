package com.showdesk.java.presentation.profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;

import com.showdesk.java.presentation.common.BaseActivity;
import com.showdesk.showdesk.R;
import com.showdesk.util.common.ToastUtil;

/**
 * Created by ladmusician.kim on 01/08/2017.
 */

public class ProfileActivity extends BaseActivity implements ProfileContract.View {

    private ProfileContract.Presenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_profile;
    }

    @Override
    protected Integer getMenuLayoutId() {
        return R.menu.profile;
    }

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_setting:
                ToastUtil.show("setting");
                break;
        }
        return true;
    }
}
