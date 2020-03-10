package com.android.train.esfand;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class PagerAdapter extends FragmentPagerAdapter {


    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                TestFragment fragment = new TestFragment();
                return fragment;
            case 1:
                TestFragment fragment1 = new TestFragment();
                return fragment1;
            case 2:
                TestFragment fragment2 = new TestFragment();
                return fragment2;
            default:
                TestFragment fragment3 = new TestFragment();
                return fragment3;
        }


    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Title1";
            case 1:
                return "Title2";
            case 2:
                return "Title3";
            default:
                return "Unknown Title";
        }
    }
}
