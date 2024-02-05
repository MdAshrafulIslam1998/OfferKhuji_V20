package com.example.offerkhuji_v20;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;


public class SplashActivity extends AppCompatActivity {

    Handler h = new Handler(); // handler for time control splash screen

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // splash screen full screen view
        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.white));


        // glide image view for logo gif
        ImageView imageView = findViewById(R.id.logoGifView);
        Glide.with(this).asGif().load(R.raw.splashscreenlogogif).into(imageView);

        // glide image view for logo gif
        ImageView imageView2 = findViewById(R.id.onlyFlamegif);
        Glide.with(this).asGif().load(R.raw.onlyflame).into(imageView2);




        // handler code for time control of the splash screen
        h.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },5000); // 5 sec wait on splash screen



    }
}