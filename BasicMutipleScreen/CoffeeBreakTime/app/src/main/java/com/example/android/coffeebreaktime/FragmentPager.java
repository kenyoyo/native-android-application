package com.example.android.coffeebreaktime;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by KAZDO on 28/5/2560.
 */

public class FragmentPager extends FragmentPagerAdapter {

    public FragmentPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TitleOneFragment();
        } else if (position == 1) {
            return new TitleTwoFragment();
        } else {
            return new MenuFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
