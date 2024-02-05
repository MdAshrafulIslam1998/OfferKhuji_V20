package com.example.offerkhuji_v20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DrawerActivity extends AppCompatActivity {
    ImageView drawerimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        drawerimage = findViewById(R.id.drawer_image);
        Glide.with(this).asGif().load(R.raw.splashscreenlogogif).into(drawerimage);

    }
}