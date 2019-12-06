package com.sundram.urbanclapclone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.snackbar.Snackbar;
import com.sundram.urbanclapclone.framelayout.FrameBookingServe;
import com.sundram.urbanclapclone.framelayout.FrameGuideUrbanClap;
import com.sundram.urbanclapclone.framelayout.FramePayingServe;

public class CustomerSupport extends AppCompatActivity {

    private Toolbar toolbar;
    TextView bookService,payingService,urbanGuide;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_support);
        toolbar = findViewById(R.id.custom_toolbar_wedget);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.customer_support);

        bookService = findViewById(R.id.bookSerice1);
        payingService = findViewById(R.id.payingService);
        urbanGuide = findViewById(R.id.urban_guide);

        bookService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bookService = new Intent(CustomerSupport.this, FrameBookingServe.class);
                startActivity(bookService);
                finish();
                Snackbar.make(v,"Booking Service..",Snackbar.LENGTH_LONG).show();
            }
        });

        payingService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bookService = new Intent(CustomerSupport.this, FramePayingServe.class);
                startActivity(bookService);
                finish();
                Snackbar.make(v,"Paying Service..",Snackbar.LENGTH_LONG).show();
            }
        });

        urbanGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bookService = new Intent(CustomerSupport.this, FrameGuideUrbanClap.class);
                startActivity(bookService);
                finish();
                Snackbar.make(v,"Urban guide..",Snackbar.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }

}
