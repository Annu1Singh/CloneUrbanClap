package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class PlumberActivity extends AppCompatActivity {
    TextView login_tv, grid_heading_tv;
    ImageView collapseImage_bg;
    CollapsingToolbarLayout collapsingToolbarLayout;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumber);
        login_tv = findViewById(R.id.login_button_text);
        login_tv.setText("View all Cleaning Services");
        grid_heading_tv = findViewById(R.id.grid_heading);

        //setting up the heading of grid view

        grid_heading_tv.setText("What do you want help with ?");
        //end
        //setting up the title of collapsableToolbarLayout
        collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
        collapsingToolbarLayout.setTitle("Plumber");
        collapsingToolbarLayout.setCollapsedTitleTextColor(ColorStateList.valueOf(R.color.white));

        //setting collapsetoolbar bg
        collapseImage_bg = findViewById(R.id.collapse_iv);
        collapseImage_bg.setBackgroundResource(R.drawable.electrician);
    }
}