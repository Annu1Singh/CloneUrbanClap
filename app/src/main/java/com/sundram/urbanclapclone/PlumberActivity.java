package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sundram.urbanclapclone.adapter.RecyclerViewAdapter;
import com.sundram.urbanclapclone.datamodel.DataModel;

import java.util.ArrayList;

public class PlumberActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;
    RecyclerViewAdapter recyclerViewAdapter;
    TextView login_tv, grid_heading_tv, back_tv;
   // ImageView collapseImage_bg;
    CollapsingToolbarLayout collapsingToolbarLayout;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumber);
        login_tv = findViewById(R.id.login_button_text);
        login_tv.setText("View all Cleaning Services");

        back_tv = findViewById(R.id.back_tv);
        back_tv.setOnClickListener(this);


        //end
        //setting up the title of collapsableToolbarLayout
        collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
        collapsingToolbarLayout.setTitle("Plumber");
        //  collapsingToolbarLayout.setCollapsedTitleTextColor(ColorStateList.valueOf(R.color.white));

        //setting collapsetoolbar bg
        //collapseImage_bg = findViewById(R.id.collapse_iv);
        // collapseImage_bg.setBackgroundResource(R.drawable.electrician);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();


/**
 Simple GridLayoutManager that spans    two columns
 **/
        GridLayoutManager manager = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerViewAdapter = new RecyclerViewAdapter(this, arrayList);
        recyclerView.setAdapter(recyclerViewAdapter);
        setGridSectionDetailss();
    }

    public void setGridSectionDetailss() {
        arrayList.add(new DataModel("Plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        recyclerViewAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_tv:
                onBackPressed();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent back = new Intent(PlumberActivity.this,PECActivity.class);
        startActivity(back);
        finish();
    }
}
