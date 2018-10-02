package com.user.login_register;

import android.media.Image;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ViewPager v;
    TabLayout t;
    PageAdpter adapter;
    ImageView img;



    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.activity_main);
        v=(ViewPager)findViewById(R.id.vp);
        img= (ImageView) findViewById(R.id.act_main_img);
        adapter=new PageAdpter(getSupportFragmentManager(), this);
        v.setAdapter(adapter);
        t=(TabLayout)findViewById(R.id.tl);
        t.setupWithViewPager(v);


        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragment_container, new Fragment1());
        ft.commit();

    }

    public void getfragment(){

        FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Fragment2());
        ft1.addToBackStack(null);
        ft1.commit();

    }

}
