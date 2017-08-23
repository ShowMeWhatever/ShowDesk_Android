package com.showdesk.java.presentation.profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.showdesk.java.data.executor.ExecutionHelper;
import com.showdesk.java.data.repository.UserDataRepository;
import com.showdesk.java.domain.interaction.GetUserUsecase;
import com.showdesk.java.presentation.common.BaseActivity;
import com.showdesk.java.presentation.profile.viewmodel.ProfileViewModel;
import com.showdesk.showdesk.R;
import com.showdesk.util.common.ToastUtil;

import butterknife.BindView;

/**
 * Created by ladmusician.kim on 01/08/2017.
 */

public class ProfileActivity extends BaseActivity implements ProfileContract.View {

    @BindView(R.id.profile_recyclerview)
    RecyclerView mRecyclerView;

    private int mUserId;
    private ProfileContract.Presenter mPresenter;
    private ProfileAdapter mAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_profile;
    }

    @Override
    protected Integer getMenuLayoutId() {
        return R.menu.profile;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAdapter = new ProfileAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

        // TODO: 2017. 8. 23. get userId outside logic
        mUserId = 1;

        GetUserUsecase getUserUsecase = new GetUserUsecase(
                mUserId,
                ExecutionHelper.job(),
                ExecutionHelper.ui(),
                UserDataRepository.getInstance());

        new ProfilePresenter(
                this, getUserUsecase);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.subscribe();
    }

    @Override
    protected void onPause() {
        mPresenter.unsubscribe();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        mAdapter = null;
        super.onDestroy();
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

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void setItem(ProfileViewModel model) {
        mAdapter.setItem(model);
    }

    @Override
    public void refresh() {
        mAdapter.refresh();
    }
}
