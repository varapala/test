package com.user.login_register;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by User on 9/18/2018.
 */

class PageAdpter extends FragmentStatePagerAdapter {

    Context context;

    public PageAdpter( FragmentManager fm, Context context ) {
        super(fm);
        this.context = context;
    }


    @Override
    public Fragment getItem( int position ) {
        if (position==0){

            return new Fragment1();
        }
        else {

            return new Fragment2();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle( int position ) {

        switch (position) {
            case 0:
                return "Login";
            case 1:
                return "SignUp";

            default:
                return null;
        }

    }
}
