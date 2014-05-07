package com.workspace.tabswipe.adapter;

import com.workspace.sidadiya.AboutMessage;
import com.workspace.sidadiya.SignUpMessage;
import com.workspace.sidadiya.WelcomeMessage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class TabsPagerAdapter extends FragmentPagerAdapter {
 
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Top Rated fragment activity
            return new WelcomeMessage();
        case 1:
            // Games fragment activity
            return new AboutMessage();
        case 2:
            // Movies fragment activity
            return new SignUpMessage();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
 
}