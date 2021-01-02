package com.riseinsteps.packbagbuddy_leisuretravelandtourism.tour_description;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class FragmentAdapter extends FragmentStateAdapter {

    ArrayList<Fragment> fragments;

    public FragmentAdapter(AppCompatActivity activity, ArrayList<Fragment> fragments){
        super(activity);

        this.fragments=fragments;
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
