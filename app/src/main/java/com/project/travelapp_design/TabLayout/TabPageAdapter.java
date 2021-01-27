package com.project.travelapp_design.TabLayout;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPageAdapter extends FragmentPagerAdapter {

    private int numeroftab;
    Context context;

    public TabPageAdapter(@NonNull FragmentManager fm, int behavior, Context context, int numberoftab) {
        super(fm, behavior);
        this.context = context;
        this.numeroftab = numberoftab;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Tab_Recommended();
            case 1:
                return new Tab_Popular();
            case 2:
                return new Tab_New_Destnation();
            case 3:
                return new Tab_Hidden_World();

            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return numeroftab;
    }


    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
