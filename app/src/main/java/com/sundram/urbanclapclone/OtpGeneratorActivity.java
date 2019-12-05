package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OtpGeneratorActivity extends AppCompatActivity {

    private final int time_out=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp_generator_activity);
    }
}
