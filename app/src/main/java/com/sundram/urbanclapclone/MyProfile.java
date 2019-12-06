package com.sundram.urbanclapclone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MyProfile extends AppCompatActivity {

    Toolbar toolbar ;
    Button loginBtn;
    TextView aboutUs_myProfile_tv, shareUrbanClap_tv, downloadUrbanClap_tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile);
        toolbar = findViewById(R.id.custom_toolbar_wedget);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.my_profile);
        loginBtn=findViewById(R.id.custome_toolbar_loginbtn);
        loginBtn.setVisibility(View.VISIBLE);

        aboutUs_myProfile_tv = findViewById(R.id.aboutUs_myProfile);
        shareUrbanClap_tv = findViewById(R.id.shareUrbanClap);
        downloadUrbanClap_tv = findViewById(R.id.downloadUrbanClap);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(MyProfile.this,LoginActivity.class);
                startActivity(login);
                finish();
            }
        });

        aboutUs_myProfile_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyProfile.this,About.class);
                startActivity(i);
                finish();
            }
        });

        shareUrbanClap_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Your Message Here !";
                String shareSub = "Your subject here !";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareSub);
                startActivity(Intent.createChooser(myIntent, "Share Using"));
            }
        });

        downloadUrbanClap_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.google.com/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
