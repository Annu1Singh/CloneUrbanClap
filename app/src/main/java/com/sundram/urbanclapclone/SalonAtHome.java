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
import android.widget.Toast;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sundram.urbanclapclone.adapter.AutoFitGridLayoutManager;
import com.sundram.urbanclapclone.adapter.RecyclerViewAdapter;
import com.sundram.urbanclapclone.datamodel.DataModel;

import java.util.ArrayList;

public class SalonAtHome extends AppCompatActivity implements View.OnClickListener {

    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;
    RecyclerViewAdapter recyclerViewAdapter;
    DataModel dataModel;
    TextView login_tv, grid_heading_tv,back_tv;
    ImageView collapseImage_bg;
    CollapsingToolbarLayout collapsingToolbarLayout;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon_at_home);
        //getting ids of all the views
        login_tv = findViewById(R.id.login_button_text);
        grid_heading_tv = findViewById(R.id.grid_heading);
        back_tv = findViewById(R.id.back_tv);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
        login_tv.setText("View all Cleaning Services Service");
        //setting up the heading of grid view
        //grid_heading_tv.setText("Salon At Home");
        //end
        //setting up the title of collapsableToolbarLayout
        collapsingToolbarLayout.setTitle("Salon at Home");
        //collapsingToolbarLayout.setCollapsedTitleTextColor(ColorStateList.valueOf(R.color.white));

        //setting collapsetoolbar bg
        //      collapseImage_bg = findViewById(R.id.collapse_iv);
        //collapseImage_bg.setBackgroundResource(R.drawable.homesalon);

        //setting up the listners
        back_tv.setOnClickListener(this);
        //end
        arrayList = new ArrayList<>();


/**
 Simple GridLayoutManager that spans    two columns
 **/
        GridLayoutManager manager = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerViewAdapter = new RecyclerViewAdapter(this, arrayList);
        recyclerView.setAdapter(recyclerViewAdapter);
        setGridSectionDetails();

    }

    public void setGridSectionDetails() {
        arrayList.add(new DataModel("Facial Image", R.drawable.facial));
        arrayList.add(new DataModel("Facial Image", R.drawable.facial));
        arrayList.add(new DataModel("Facial Image", R.drawable.facial));
        arrayList.add(new DataModel("Facial Image", R.drawable.facial));
        arrayList.add(new DataModel("Facial Image", R.drawable.facial));
        arrayList.add(new DataModel("Facial Image", R.drawable.facial));
        arrayList.add(new DataModel("Facial Image", R.drawable.facial));
        arrayList.add(new DataModel("Facial Image", R.drawable.facial));
        arrayList.add(new DataModel("Facial Image", R.drawable.facial));
        recyclerViewAdapter.notifyDataSetChanged();

    }

    @Override
    public void onBackPressed() {
        Intent ii = new Intent(SalonAtHome.this,DashBoard.class);
        startActivity(ii);
        finish();
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_tv:
                onBackPressed();
                break;

        }
    }
}
