package com.sundram.urbanclapclone;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.widget.IconTextView;

public class LocationOnBoarding extends AppCompatActivity {
    IconTextView iconTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_onboarding);
        iconTextView = findViewById(R.id.location_onboarding_back_back_btn);
        iconTextView.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LocationOnBoarding.this,OtpGeneratorActivity.class);
                startActivity(i);
                finishAffinity();
            }
        });
    }
}
