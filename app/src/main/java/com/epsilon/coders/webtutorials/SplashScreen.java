package com.epsilon.coders.webtutorials;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {



        private int SPLASH_TIME_OUT = 2000;
        private Context context;
        private TextView tv_splash_title;
    @Override
    protected void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_splash_screen);
        this.context = this;
        this.tv_splash_title = ((TextView)findViewById(R.id.tv_splash_title));
        SpannableString localSpannableString = new SpannableString("Learn Web Development");
        localSpannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FFFFFF")), 0, 21, 0);
        localSpannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FFFFFF")), 21, localSpannableString.length(), 0);
        this.tv_splash_title.setText(localSpannableString, TextView.BufferType.SPANNABLE);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                SplashScreen.this.startActivity(new Intent(SplashScreen.this.context, MainActivity.class));
                SplashScreen.this.finish();
                SplashScreen.this.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
            }
        }, this.SPLASH_TIME_OUT);
    }
}