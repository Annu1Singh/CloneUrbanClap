package com.sundram.urbanclapclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.sundram.urbanclapclone.viewallserviceactivity.salonathome.ViewAllServiceActivity;

public class ViewCartActivity extends AppCompatActivity {


    RecyclerView addCartRecyclerview;
    Toolbar viewCartToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_cart);
        init();
        setToolbar();
    }

    public void init(){
        viewCartToolbar = findViewById(R.id.viewCartToolbar);
    }

    public void setToolbar() {
        setSupportActionBar(viewCartToolbar);
        getSupportActionBar().setTitle("View Cart");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(ViewCartActivity.this, DashBoard.class));
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
