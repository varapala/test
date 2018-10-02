package com.user.login_register;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 9/17/2018.
 */

public class SplashActivity extends AppCompatActivity{
    ImageView img;
    Handler handler;
    private final int length=2000;
    Button btn;
    TextView text;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.activity_splash);
        text = (TextView) findViewById(R.id.text);
        Thread timer = new Thread() {
            public void run() {
                try {
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    text.startAnimation(animation);
                    sleep(4500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(i);
                }
            }
        };
        timer.start();
    }

    @Override    protected void onPause() {
        super.onPause();
        finish();

    }

}
