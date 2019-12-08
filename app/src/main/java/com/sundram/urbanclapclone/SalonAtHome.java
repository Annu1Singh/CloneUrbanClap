package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sundram.urbanclapclone.adapter.AutoFitGridLayoutManager;
import com.sundram.urbanclapclone.adapter.RecyclerViewAdapter;
import com.sundram.urbanclapclone.datamodel.DataModel;

import java.util.ArrayList;

public class SalonAtHome extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;
    RecyclerViewAdapter recyclerViewAdapter;
    DataModel dataModel;
    TextView login_tv, grid_heading_tv;
    ImageView collapseImage_bg;
    CollapsingToolbarLayout collapsingToolbarLayout;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon_at_home);
        login_tv = findViewById(R.id.login_button_text);
        login_tv.setText("View all Cleaning Services");
        grid_heading_tv = findViewById(R.id.grid_heading);

        //setting up the heading of grid view

        //grid_heading_tv.setText("Salon At Home");
        //end
        //setting up the title of collapsableToolbarLayout
        collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
        collapsingToolbarLayout.setTitle("Bathroom Cleaning Services");
        collapsingToolbarLayout.setCollapsedTitleTextColor(ColorStateList.valueOf(R.color.white));

        //setting collapsetoolbar bg
        collapseImage_bg = findViewById(R.id.collapse_iv);
        collapseImage_bg.setBackgroundResource(R.drawable.homesalon);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();
        AutoFitGridLayoutManager layoutManager = new AutoFitGridLayoutManager(this, 200);
        recyclerView.setLayoutManager(layoutManager);


        recyclerViewAdapter = new RecyclerViewAdapter(this, arrayList);
        recyclerView.setAdapter(recyclerViewAdapter);
        setGridSectionDetails();
        /**
         Simple GridLayoutManager that spans    two columns
         **/
        /*GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);*/
    }

    public void setGridSectionDetails(){
        arrayList.add(new DataModel("Facial Image",R.drawable.facial));
        arrayList.add(new DataModel("Facial Image",R.drawable.facial));
        arrayList.add(new DataModel("Facial Image",R.drawable.facial));
        arrayList.add(new DataModel("Facial Image",R.drawable.facial));
        arrayList.add(new DataModel("Facial Image",R.drawable.facial));
        arrayList.add(new DataModel("Facial Image",R.drawable.facial));
        arrayList.add(new DataModel("Facial Image",R.drawable.facial));
        arrayList.add(new DataModel("Facial Image",R.drawable.facial));
        arrayList.add(new DataModel("Facial Image",R.drawable.facial));
        arrayList.add(new DataModel("Facial Image",R.drawable.facial));
        recyclerViewAdapter.notifyDataSetChanged();

    }
}
