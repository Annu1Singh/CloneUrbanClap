package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sundram.urbanclapclone.adapter.AutoFitGridLayoutManager;
import com.sundram.urbanclapclone.adapter.RecyclerViewAdapter;
import com.sundram.urbanclapclone.datamodel.DataModel;

import java.util.ArrayList;

public class ElectricianActivity extends AppCompatActivity {
    
    private RecyclerView recyclerView;
    private ArrayList<DataModel> arrayList;
    private RecyclerViewAdapter recyclerViewAdapter;
    private DataModel dataModel;
    TextView login_tv, grid_heading_tv,heading_why_tv;
    ImageView collapseImage_bg;
    CollapsingToolbarLayout collapsingToolbarLayout;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrician);
        login_tv = findViewById(R.id.login_button_text);
        login_tv.setText("View all Cleaning Services");
        grid_heading_tv = findViewById(R.id.grid_heading);
        heading_why_tv = findViewById(R.id.heading_why);
        //setting up the heading of grid view

        grid_heading_tv.setText("Please Select");
        heading_why_tv.setText("Please Note :-");
        //end
        //setting up the title of collapsableToolbarLayout
        collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
        collapsingToolbarLayout.setTitle("Bathroom Cleaning Services");
        collapsingToolbarLayout.setCollapsedTitleTextColor(ColorStateList.valueOf(R.color.white));

        //setting collapsetoolbar bg
        collapseImage_bg = findViewById(R.id.collapse_iv);
        collapseImage_bg.setBackgroundResource(R.drawable.homesalon);

        //setting up the grid recyclerview
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();

        AutoFitGridLayoutManager layoutManager = new AutoFitGridLayoutManager(this, 200);
        recyclerView.setLayoutManager(layoutManager);


        recyclerViewAdapter = new RecyclerViewAdapter(this, arrayList);
        recyclerView.setAdapter(recyclerViewAdapter);
        setGridSectionDetails();
        //end
    }
    public void setGridSectionDetails(){
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        arrayList.add(new DataModel("Electrician Image",R.drawable.facial));
        recyclerViewAdapter.notifyDataSetChanged();

    }
}
