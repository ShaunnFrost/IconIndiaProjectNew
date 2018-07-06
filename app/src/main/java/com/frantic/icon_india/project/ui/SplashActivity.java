package com.frantic.icon_india.project.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

import com.frantic.icon_india.project.R;
import com.frantic.icon_india.project.sharedprefrences.SharedPrefrences;

public class SplashActivity extends AppCompatActivity {

    private ProgressBar mProgress;
    private SharedPrefrences sharedPrefrences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sharedPrefrences = SharedPrefrences.getsharedprefInstance(this);
        //  getSupportActionBar().hide();
        mProgress = (ProgressBar) findViewById(R.id.splash_screen_progress_bar);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        // Start lengthy operation in a background thread
        new Thread(new Runnable() {
            public void run() {
                doWork();
                startApp();
                finish();
            }
        }).start();
    }
    @SuppressLint("ResourceAsColor")
    private void doWork() {
        for (int progress=0; progress<100; progress+=10) {
            try {
                Thread.sleep(700);
                mProgress.setProgress(progress);
                mProgress.getProgressDrawable().setColorFilter(
                        R.color.statusbar, android.graphics.PorterDuff.Mode.SRC_IN);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void startApp() {

        if (sharedPrefrences.isLoggedIn()) {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        } else {
            startActivity(new Intent(SplashActivity.this, WelcomeActivity.class));
            finish();
        }

    }

}
