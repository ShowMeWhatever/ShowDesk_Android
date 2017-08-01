package com.showdesk.java.presentation.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.showdesk.java.presentation.common.BaseActivity;
import com.showdesk.java.presentation.profile.ProfileActivity;
import com.showdesk.showdesk.R;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @OnClick(R.id.main_text)
    void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_text:
                startActivity(new Intent(this, ProfileActivity.class));
                break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
