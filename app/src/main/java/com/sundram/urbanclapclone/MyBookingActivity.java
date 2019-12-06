package com.sundram.urbanclapclone;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MyBookingActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_booking_layout);

    }

    public void bookService(View view) {
        Toast.makeText(this,"No booking found..",Toast.LENGTH_LONG).show();
    }
}
