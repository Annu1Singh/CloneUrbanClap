package com.sundram.urbanclapclone;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class WashingmachineRepair extends AppCompatActivity implements View.OnClickListener {
    CollapsingToolbarLayout collapsingToolbarLayout;
    TextView back_tv,login_tv;
    Toolbar toolbar;
    private VideoView mVideoView;
    MediaController mediaController;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_washing_machine_service);
        toolbar = findViewById(R.id.collpasableToolbar);
        setSupportActionBar(toolbar);
        login_tv = findViewById(R.id.login_button_text);
        login_tv.setText("View all Cleaning Services");

        back_tv = findViewById(R.id.back_tv);
        back_tv.setOnClickListener(this);
        //setting up the mediaController and videoView
        mVideoView = findViewById(R.id.videoView);
        mediaController = new MediaController(this);
        //setting up the path of the video
        initializePlayer();
        mVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(WashingmachineRepair.this, "Thank you for watching..",
                        Toast.LENGTH_SHORT).show();
                mVideoView.start();
            }
        });


        //setting up the title of collapsableToolbarLayout
        collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
        collapsingToolbarLayout.setTitle("Washing Machine Service");
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_tv:
                onBackPressed();
                break;
        }
    }
    @Override
    public void onBackPressed() {
        Intent back = new Intent(WashingmachineRepair.this,ApplianceAndEcRepair.class);
        startActivity(back);
        finish();
        super.onBackPressed();
    }
    private void initializePlayer() {
        mVideoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.confounding);
        mediaController.setAnchorView(mVideoView);

        mediaController.setMediaPlayer(mVideoView);
        mediaController.setVisibility(View.GONE);
        mVideoView.setMediaController(mediaController);
        mVideoView.start();
    }

    private void releasePlayer() {
        mVideoView.stopPlayback();
    }

    @Override
    protected void onStart() {
        super.onStart();
        initializePlayer();
    }

    @Override
    protected void onStop() {
        super.onStop();
        releasePlayer();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            mVideoView.pause();
        }
    }
}
