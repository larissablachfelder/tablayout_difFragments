package com.example.myapplication.ui.main;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.Classlist;
import com.example.myapplication.R;
import com.example.myapplication.Statistics;
import com.example.myapplication.Timeslots;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @SuppressLint("SupportAnnotationUsage")
    @StringRes
    //private static final int[] TAB_TITLES = new int[]{R.drawable.ic_baseline_access_time_24, R.drawable.ic_module, R.drawable.ic_list};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // show different fragments
        Fragment fragment = null;

        //TODO: change fragment = xxx to --> fragment = Timeslots.newInstance(parameter1, parameter2);
        //reference to method new Instance

        switch (position) {
            case 0:
                fragment = new Classlist();
                break;
            case 1:
                fragment = new Statistics();
                break;
            case 2:
                fragment = new Timeslots();
                break;
        }
        return fragment;
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        //return mContext.getResources().getString(TAB_TITLES[position]);
        //return (CharSequence) mContext.getResources().getDrawable(TAB_TITLES[position], null);
        switch (position) {
            case 0:
                return (CharSequence) mContext.getResources().getDrawable(R.drawable.ic_list, null);
            case 1:
                return (CharSequence) mContext.getResources().getDrawable(R.drawable.ic_module, null);

            case 2:
                return (CharSequence) mContext.getResources().getDrawable(R.drawable.ic_baseline_access_time_24, null);

        }
        return null;


    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}