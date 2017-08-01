package com.showdesk.java.presentation.common;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.MenuRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

import com.showdesk.showdesk.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ladmusician.kim on 31/07/2017.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Nullable
    @BindView(R.id.showdesk_toolbar)
    Toolbar mToolbar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);

        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
        }
    }

    @LayoutRes
    protected abstract int getLayoutId();

    @MenuRes
    protected Integer getMenuLayoutId() {
        return null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (mToolbar != null && getMenuLayoutId() != null) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(getMenuLayoutId(), menu);
            return true;
        }
        return false;
    }
}
