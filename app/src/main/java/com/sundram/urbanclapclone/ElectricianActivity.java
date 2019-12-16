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

public class ElectricianActivity extends AppCompatActivity implements View.OnClickListener ,RecyclerViewAdapter.OnServiceItemClick {
    
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
        login_tv.setText("View all Electronics Services");
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
        recyclerViewAdapter = new RecyclerViewAdapter(this, arrayList,this);
        recyclerView.setAdapter(recyclerViewAdapter);
        setGridSectionDetails();

        //end
    }
    public void setGridSectionDetails(){
        arrayList.add(new DataModel("Quick Book",R.drawable.electronic));
        arrayList.add(new DataModel("Switch and Socket",R.drawable.electronic));
        arrayList.add(new DataModel("Fan",R.drawable.electronic));
        arrayList.add(new DataModel("Light",R.drawable.electronic));
        arrayList.add(new DataModel("Chandelier",R.drawable.electronic));
        arrayList.add(new DataModel("MCB & Fuse",R.drawable.electronic));
        arrayList.add(new DataModel("Inverter & Stabilizer",R.drawable.electronic));
        arrayList.add(new DataModel("Appliance",R.drawable.electronic));
        arrayList.add(new DataModel("Wiring",R.drawable.electronic));
        arrayList.add(new DataModel("Door Bell",R.drawable.electronic));
        arrayList.add(new DataModel("Room Heater",R.drawable.electronic));
        arrayList.add(new DataModel("Looking For Something else ?",R.drawable.electronic));
        recyclerViewAdapter.notifyDataSetChanged();

    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(ElectricianActivity.this,PECActivity.class);
        startActivity(back);
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

    @Override
    public void onClick(int position) {

    }
}
