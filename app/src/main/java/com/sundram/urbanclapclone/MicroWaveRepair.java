package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class MicroWaveRepair extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayout;
    TextView back_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_micro_wave_repair);
        back_tv = findViewById(R.id.back_tv);
        back_tv.setOnClickListener(this);
        //setting up the title of collapsableToolbarLayout
        collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
        collapsingToolbarLayout.setTitle("Microwave Service and Repair");
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(MicroWaveRepair.this,ApplianceAndEcRepair.class);
        startActivity(back);
        finish();
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_tv:
                onBackPressed();
                break;
        }
    }
}
