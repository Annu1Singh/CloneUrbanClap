package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sundram.urbanclapclone.adapter.RecyclerViewAdapter;
import com.sundram.urbanclapclone.datamodel.DataModel;
import com.sundram.urbanclapclone.viewallserviceactivity.salonathome.ViewAllServiceActivity;

import java.util.ArrayList;

public class SalonAtHome extends AppCompatActivity implements View.OnClickListener, RecyclerViewAdapter.OnServiceItemClick {

    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;
    RecyclerViewAdapter recyclerViewAdapter;
    TextView login_tv, grid_heading_tv, back_tv;
    CollapsingToolbarLayout collapsingToolbarLayout;
    String tabNumber;
    Context context;

    public SalonAtHome(Context context){
        this.context=context;
    }

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
        login_tv.setText("View all Salon Service");
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
        login_tv.setOnClickListener(this);
        //end
        arrayList = new ArrayList<>();


/**
 Simple GridLayoutManager that spans    two columns
 **/
        GridLayoutManager manager = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerViewAdapter = new RecyclerViewAdapter(this, arrayList, this);
        recyclerView.setAdapter(recyclerViewAdapter);
        setGridSectionDetails();

    }

    public void setGridSectionDetails() {
        arrayList.add(new DataModel("Waxing", R.drawable.facial));
        arrayList.add(new DataModel("RICA Waxing", R.drawable.facial));
        arrayList.add(new DataModel("Honey Waxing", R.drawable.facial));
        arrayList.add(new DataModel("Facial, Bleach and Detan", R.drawable.facial));
        arrayList.add(new DataModel("Manicure & Pedicure", R.drawable.facial));
        arrayList.add(new DataModel("Hair Care", R.drawable.facial));
        arrayList.add(new DataModel("Threading", R.drawable.facial));
        recyclerViewAdapter.notifyDataSetChanged();

    }


    @Override
    public void onBackPressed() {
        Intent ii = new Intent(SalonAtHome.this, DashBoard.class);
        startActivity(ii);
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back_tv:
                onBackPressed();
                break;
            case R.id.login_button_text:
                startActivity(new Intent(SalonAtHome.this, ViewAllServiceActivity.class));
                finish();
                break;
        }
    }

    @Override
    public void onClick(int position) {
        switch (position) {
            case 0:
                Intent intent = new Intent(this, ViewAllServiceActivity.class);
                intent.putExtra("TabNumber", "0");
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, ViewAllServiceActivity.class);
                intent1.putExtra("TabNumber", "1");
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, ViewAllServiceActivity.class);
                intent2.putExtra("TabNumber", "2");
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, ViewAllServiceActivity.class);
                intent3.putExtra("TabNumber", "3");
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, ViewAllServiceActivity.class);
                intent4.putExtra("TabNumber", 4);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this, ViewAllServiceActivity.class);
                intent5.putExtra("TabNumber", "5");
                startActivity(intent5);
                break;
            case 6:
                Intent intent6 = new Intent(this, ViewAllServiceActivity.class);
                intent6.putExtra("TabNumber", "6");
                startActivity(intent6);
                break;
        }
    }

}
