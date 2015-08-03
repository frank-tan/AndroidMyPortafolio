package com.franktan.androidportfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Frank Tan on 22/07/2015.
 */
public class SlidePagerAdapter extends FragmentPagerAdapter {
    private static final int NUM_PAGES = 5;

    public SlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        SliderPageFragment fragment = new SliderPageFragment();
        Bundle args = new Bundle();
        args.putInt("num", position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}
