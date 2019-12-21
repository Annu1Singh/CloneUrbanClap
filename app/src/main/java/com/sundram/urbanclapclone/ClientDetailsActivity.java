package com.sundram.urbanclapclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class ClientDetailsActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView login_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_details);
        init();
        setToolbar();
        login_txt.setText("Submit Details");
    }

    public void init(){
        toolbar = findViewById(R.id.toolbar);
        login_txt = findViewById(R.id.login_button_text);
    }
    public void setToolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Vendor Details Form");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ClientDetailsActivity.this,OtpGeneratorActivity.class));
        finish();
    }
}
