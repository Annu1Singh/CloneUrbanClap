package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

public class OtpGeneratorActivity extends AppCompatActivity implements View.OnClickListener {

    ViewDialog viewDialog;
    TextView otpDenerator_tv, tv_skip_now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp_generator_activity);
        otpDenerator_tv = findViewById(R.id.login_button_text);
        tv_skip_now = findViewById(R.id.tv_skip_now);
        otpDenerator_tv.setText("Generate OTP");
        viewDialog = new ViewDialog(this);
        otpDenerator_tv.setOnClickListener(this);
        tv_skip_now.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_skip_now:
                Intent ii = new Intent(OtpGeneratorActivity.this, LocationOnBoarding.class);
                startActivity(ii);
                finish();
                break;
            case R.id.login_button_text:
                otpSentBTN();
                break;
        }
    }
    public void otpSentBTN(){
        viewDialog.showDialog();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(OtpGeneratorActivity.this, OTPVerification.class);
                startActivity(i);
                Toast.makeText(OtpGeneratorActivity.this, "OTP sent on your mobile number", Toast.LENGTH_LONG).show();
                finish();
            }
        }, 5000);
    }
}
