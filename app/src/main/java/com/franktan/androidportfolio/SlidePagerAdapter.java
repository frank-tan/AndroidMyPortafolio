package com.franktan.androidportfolio;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Frank Tan on 22/07/2015.
 */
public class SlidePagerAdapter extends FragmentStatePagerAdapter {
    private static final int NUM_PAGES = 5;

    public SlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new PageSlideFragment();
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}
