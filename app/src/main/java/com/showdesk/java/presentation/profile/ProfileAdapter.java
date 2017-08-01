package com.showdesk.java.presentation.profile;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.showdesk.java.presentation.profile.viewholder.AbsProfileItemViewHolder;
import com.showdesk.java.presentation.profile.viewmodel.ProfileViewModel;
import com.showdesk.showdesk.R;

/**
 * Created by ladmusician.kim on 01/08/2017.
 */

public class ProfileAdapter extends RecyclerView.Adapter<AbsProfileItemViewHolder> {

    private ProfileViewModel mData;

    public ProfileAdapter() {
        this.mData = new ProfileViewModel();
    }

    @Override
    public AbsProfileItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProfileViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profile_user, parent, false));
    }

    @Override
    public void onBindViewHolder(AbsProfileItemViewHolder holder, int position) {
        holder.bind(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.count();
    }
}
