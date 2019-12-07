package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.mtp.MtpConstants;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class OtpGeneratorActivity extends AppCompatActivity {

    TextView otpDenerator_tv, tv_skip_now;
    private final int time_out = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp_generator_activity);
        otpDenerator_tv = findViewById(R.id.login_button_text);
        tv_skip_now = findViewById(R.id.tv_skip_now);
        otpDenerator_tv.setText("Generate OTP");

        final ProgressDialog progressDialog = new ProgressDialog(this);

        otpDenerator_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(OtpGeneratorActivity.this,OTPVerification.class);
                        startActivity(i);
                        finish();
                    }
                },time_out);
            }
        });

        tv_skip_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(OtpGeneratorActivity.this,LocationOnBoarding.class);
                startActivity(ii);
                finish();
            }
        });

    }
}
