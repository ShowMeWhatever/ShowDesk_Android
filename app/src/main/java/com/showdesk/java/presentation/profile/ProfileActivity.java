package com.showdesk.java.presentation.profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.showdesk.java.presentation.common.BaseActivity;
import com.showdesk.showdesk.R;
import com.showdesk.util.common.ToastUtil;

import butterknife.BindView;

/**
 * Created by ladmusician.kim on 01/08/2017.
 */

public class ProfileActivity extends BaseActivity implements ProfileContract.View {

    @BindView(R.id.profile_recyclerview)
    RecyclerView mRecyclerView;

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
    }

    @Override
    protected void onDestroy() {
        mAdapter = null;
        super.onDestroy();
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
