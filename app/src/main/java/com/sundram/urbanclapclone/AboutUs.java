package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class AboutUs extends AppCompatActivity {

    Toolbar aboutUsToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        aboutUsToolbar = findViewById(R.id.custom_toolbar_wedget);
        setSupportActionBar(aboutUsToolbar);
        if(getSupportActionBar()!=null) {
          getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        aboutUsToolbar.setTitle("AboutUs");
    }
}
