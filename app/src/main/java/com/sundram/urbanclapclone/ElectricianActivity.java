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
import com.sundram.urbanclapclone.adapter.AutoFitGridLayoutManager;
import com.sundram.urbanclapclone.adapter.RecyclerViewAdapter;
import com.sundram.urbanclapclone.datamodel.DataModel;

import java.util.ArrayList;

public class ElectricianActivity extends AppCompatActivity implements View.OnClickListener {
    
    private RecyclerView recyclerView;
    private ArrayList<DataModel> arrayList;
    private RecyclerViewAdapter recyclerViewAdapter;

    TextView login_tv, heading_why_tv,back_tv;
    ImageView collapseImage_bg;

    GridLayoutManager manager;
    CollapsingToolbarLayout collapsingToolbarLayout;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrician);
        login_tv = findViewById(R.id.login_button_text);
        login_tv.setText("View all Cleaning Services");
        heading_why_tv = findViewById(R.id.heading_why);
        back_tv = findViewById(R.id.back_tv);
        back_tv.setOnClickListener(this);
         heading_why_tv.setText("Please Note :-");
         collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
         collapsingToolbarLayout.setTitle("Electronics");

        //setting up the grid recyclerview
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();

        manager = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerViewAdapter = new RecyclerViewAdapter(this, arrayList);
        recyclerView.setAdapter(recyclerViewAdapter);
        setGridSectionDetails();

        //end
    }
    public void setGridSectionDetails(){
        arrayList.add(new DataModel("electronic Image",R.drawable.electronic));
        arrayList.add(new DataModel("electronic Image",R.drawable.electronic));
        arrayList.add(new DataModel("electronic Image",R.drawable.electronic));
        arrayList.add(new DataModel("electronic Image",R.drawable.electronic));
        arrayList.add(new DataModel("electronic Image",R.drawable.electronic));
        arrayList.add(new DataModel("electronic Image",R.drawable.electronic));
        arrayList.add(new DataModel("electronic Image",R.drawable.electronic));
        arrayList.add(new DataModel("electronic Image",R.drawable.electronic));
        recyclerViewAdapter.notifyDataSetChanged();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent back = new Intent(ElectricianActivity.this,PECActivity.class);
        startActivity(back);
        finish();
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
