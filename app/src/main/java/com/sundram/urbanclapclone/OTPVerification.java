package com.sundram.urbanclapclone;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class OTPVerification extends AppCompatActivity implements View.OnClickListener {


    TextView login_button_text_tv,otp_verify_appbar_tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
        login_button_text_tv = findViewById(R.id.login_button_text);
        otp_verify_appbar_tv = findViewById(R.id.otp_verify_appbar);
        login_button_text_tv.setText("Verify OTP");
        //setting up the onclick method
        otp_verify_appbar_tv.setOnClickListener(this);
        login_button_text_tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_button_text:
                Intent otp_Vierify = new Intent(OTPVerification.this,DashBoard.class);
                startActivity(otp_Vierify);
                finish();
                break;
            case R.id.otp_verify_appbar:
                onBackPressed();
                break;

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent ii = new Intent(OTPVerification.this,OtpGeneratorActivity.class);
        startActivity(ii);
        finish();
    }
}
