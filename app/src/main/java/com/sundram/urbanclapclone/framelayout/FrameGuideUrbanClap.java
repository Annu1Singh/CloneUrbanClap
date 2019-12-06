package com.sundram.urbanclapclone.framelayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sundram.urbanclapclone.R;

public class FrameGuideUrbanClap extends AppCompatActivity {

    private Toolbar toolbar;
    TextView urbanGuide0_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_guide_urban_clap);
        toolbar = findViewById(R.id.custom_toolbar_wedget);
        setSupportActionBar(toolbar);
        toolbar.setTitle("A guide to UrbanClap Clone");

        urbanGuide0_tv = findViewById(R.id.urbanGuide0);
        urbanGuide0_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guideIntent = new Intent(FrameGuideUrbanClap.this,FrameDemo.class);
                startActivity(guideIntent);
                finish();
            }
        });
    }
}
