package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class SofaCleaning extends AppCompatActivity implements View.OnClickListener{

    TextView login_button_text_tv, back_tv;
    CollapsingToolbarLayout collapsingToolbarLayout;
    ImageView collapseImage_bg;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sofa_cleaning);
        login_button_text_tv = findViewById(R.id.login_button_text);
        login_button_text_tv.setText("View all Cleaning services");
        //setting up the title of collapsableToolbarLayout
        collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
        collapsingToolbarLayout.setTitle("Sofa Cleaning Services");
        back_tv = findViewById(R.id.back_tv);
        back_tv.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent back = new Intent(SofaCleaning.this,ServiceListItem.class);
        startActivity(back);
        finish();
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
