package com.showdesk.java.presentation.profile.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by ladmusician.kim on 01/08/2017.
 */

public abstract class AbsProfileItemViewHolder<T> extends RecyclerView.ViewHolder {
    public AbsProfileItemViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public abstract void bind(T item);
}
