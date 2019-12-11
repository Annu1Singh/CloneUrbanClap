package com.sundram.urbanclapclone;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ServiceListItem extends AppCompatActivity {

    Toolbar service_list_toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_list_item);
        service_list_toolbar = findViewById(R.id.service_list_toolbar);
        setSupportActionBar(service_list_toolbar);
}
}
