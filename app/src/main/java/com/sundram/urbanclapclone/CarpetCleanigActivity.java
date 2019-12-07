package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class CarpetCleanigActivity extends AppCompatActivity {
    TextView login_tv;


    ImageView collapseImage_bg;
    CollapsingToolbarLayout collapsingToolbarLayout;
    VideoView videoView;
    MediaController mediaController;

    Toolbar toolbar;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpet_cleanig);
        login_tv = findViewById(R.id.login_button_text);
        login_tv.setText("View all Cleaning Services");

        toolbar = findViewById(R.id.collpasableToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //setting up the mediaController and videoView
        videoView = findViewById(R.id.videoView);
        mediaController = new MediaController(this);
        //setting up the path of the video
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.confounding);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

        //setting up the collapsing toolbar

        //setting up the title of collapsableToolbarLayout
        collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
        collapsingToolbarLayout.setTitle("Pest Controll");
        collapsingToolbarLayout.setCollapsedTitleTextColor(ColorStateList.valueOf(R.color.white));
        collapsingToolbarLayout.setExpandedTitleTextColor(ColorStateList.valueOf(R.color.black));

        //setting collapsetoolbar bg
        collapseImage_bg = findViewById(R.id.collapse_iv);
        collapseImage_bg.setBackgroundResource(R.drawable.bathroom);


    }
}
