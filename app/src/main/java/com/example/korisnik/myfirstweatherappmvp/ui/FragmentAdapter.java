package com.example.korisnik.myfirstweatherappmvp.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.korisnik.myfirstweatherappmvp.Model.LocationWrapper;

import java.util.ArrayList;

public class FragmentAdapter extends FragmentPagerAdapter {

    private final ArrayList<LocationWrapper> mCitiesList = new ArrayList<>();

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return WeatherFragment.newInstance(mCitiesList.get(position).getLocation());
    }

    @Override
    public int getCount() {
        return mCitiesList.size();
    }

    public void setAdapterData(ArrayList<LocationWrapper> dataSource) {
        this.mCitiesList.clear();
        this.mCitiesList.addAll(dataSource);
        notifyDataSetChanged();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mCitiesList.get(position).getLocation();
    }
}
