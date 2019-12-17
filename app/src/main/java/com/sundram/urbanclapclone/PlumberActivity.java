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
import com.sundram.urbanclapclone.viewallserviceactivity.pecservice.ViewAllPlumber;
import com.sundram.urbanclapclone.viewallserviceactivity.salonathome.ViewAllServiceActivity;

import java.util.ArrayList;

public class PlumberActivity extends AppCompatActivity implements View.OnClickListener ,RecyclerViewAdapter.OnServiceItemClick {

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
        login_tv.setText("View all Plumber Services");

        back_tv = findViewById(R.id.back_tv);
        back_tv.setOnClickListener(this);
        //end
        //setting up the title of collapsableToolbarLayout
        collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
        collapsingToolbarLayout.setTitle("Plumber");
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();


/**
 Simple GridLayoutManager that spans    two columns
 **/
        GridLayoutManager manager = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerViewAdapter = new RecyclerViewAdapter(this, arrayList, this);
        recyclerView.setAdapter(recyclerViewAdapter);
        setGridSectionDetailss();
    }

    public void setGridSectionDetailss() {
       // arrayList.add(new DataModel("Quick Book", R.drawable.plumber));
        arrayList.add(new DataModel("Tap & Mixers", R.drawable.plumber));
        arrayList.add(new DataModel("Blockage", R.drawable.plumber));
        arrayList.add(new DataModel("Bath Fitings", R.drawable.plumber));
        arrayList.add(new DataModel("Toilet", R.drawable.plumber));
        arrayList.add(new DataModel("Water Tank", R.drawable.plumber));
        arrayList.add(new DataModel("Motor", R.drawable.plumber));
     //   arrayList.add(new DataModel("Altered Nozzle", R.drawable.plumber));
    //    arrayList.add(new DataModel("Looking For Something else ?", R.drawable.plumber));
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
        Intent back = new Intent(PlumberActivity.this,PECActivity.class);
        startActivity(back);
        finish();
    }

    @Override
    public void onClick(int position) {
        switch (position) {
            case 0:
                Intent intent = new Intent(this, ViewAllPlumber.class);
                intent.putExtra("TabNumber", "0");
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, ViewAllPlumber.class);
                intent1.putExtra("TabNumber", "1");
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, ViewAllPlumber.class);
                intent2.putExtra("TabNumber", "2");
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, ViewAllPlumber.class);
                intent3.putExtra("TabNumber", "3");
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, ViewAllPlumber.class);
                intent4.putExtra("TabNumber", 4);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this, ViewAllPlumber.class);
                intent5.putExtra("TabNumber", "5");
                startActivity(intent5);
                break;
        }
    }
}
