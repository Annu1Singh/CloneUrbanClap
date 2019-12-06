package com.sundram.urbanclapclone;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class About extends AppCompatActivity {

    private Toolbar toolbar;
    TextView aboutUs_tv, shareUrban_tv, privacyPolicy_tv, termsConditions_tv;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        toolbar = findViewById(R.id.custom_toolbar_wedget);
        setSupportActionBar(toolbar);
        toolbar.setTitle("About");

        toolbar.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_START);
        shareUrban_tv = findViewById(R.id.shareUrban);
        privacyPolicy_tv = findViewById(R.id.privacyPolicy);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        aboutUs_tv = findViewById(R.id.aboutUs);

        aboutUs_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(About.this,AboutUs.class);
                startActivity(i);
            }
        });

        shareUrban_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareUrbanMethod();
            }
        });

        privacyPolicy_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.google.com/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        termsConditions_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.google.com/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

    //share urban clap method
    public void shareUrbanMethod(){
        //making app to share with other app
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Your Message Here !";
        String shareSub = "Your subject here !";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareSub);
        startActivity(Intent.createChooser(myIntent, "Share Using"));
    }
}
