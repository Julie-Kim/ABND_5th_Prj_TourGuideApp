package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private static final int PAGE_COUNT = 5;

    private static final int TAB_TOP_ATTRACTIONS = 0;
    private static final int TAB_EVENT = 1;
    private static final int TAB_FESTIVAL = 2;
    private static final int TAB_RESTAURANTS = 3;
    private static final int TAB_UNIQUE_STAYS = 4;

    private Context mContext;

    private int[] mTabTitles = new int[]{
            R.string.top_attractions,
            R.string.event,
            R.string.festival,
            R.string.restaurants,
            R.string.unique_stays
    };

    CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case TAB_TOP_ATTRACTIONS:
                return new TopAttractionsFragment();
            case TAB_EVENT:
                return new EventFragment();
            case TAB_FESTIVAL:
                return new FestivalFragment();
            case TAB_RESTAURANTS:
                return new RestaurantsFragment();
            case TAB_UNIQUE_STAYS:
                return new UniqueStaysFragment();
        }
        return new TopAttractionsFragment();
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getString(mTabTitles[position]);
    }
}