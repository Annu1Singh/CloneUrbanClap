package com.sundram.urbanclapclone.framelayout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.sundram.urbanclapclone.R;

public class FrameBookingServe extends AppCompatActivity {

    private Toolbar toolbar;
    TextView bookSerice0_tv;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_booking_serve);
        toolbar = findViewById(R.id.custom_toolbar_wedget);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.booking_services);
        toolbar.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

        bookSerice0_tv = findViewById(R.id.bookSerice0);
        bookSerice0_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent demoIntent = new Intent(FrameBookingServe.this,FrameDemo.class);
                startActivity(demoIntent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
