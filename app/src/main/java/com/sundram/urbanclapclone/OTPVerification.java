package com.sundram.urbanclapclone;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OTPVerification extends AppCompatActivity {

    private final int timeout=3000;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(OTPVerification.this,HomeScreenActivity.class);
                startActivity(i);
                finish();
            }
        },timeout);
    }
}
