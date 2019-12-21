package com.sundram.urbanclapclone;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sundram.urbanclapclone.adapter.RecyclerViewAdapter;
import com.sundram.urbanclapclone.datamodel.DataModel;
import com.sundram.urbanclapclone.viewallserviceactivity.pecservice.ViewAllElectrician;

import java.util.ArrayList;

public class ElectricianActivity extends AppCompatActivity implements View.OnClickListener, RecyclerViewAdapter.OnServiceItemClick {

    private RecyclerView recyclerView;
    private ArrayList<DataModel> arrayList;
    private RecyclerViewAdapter recyclerViewAdapter;

    TextView login_tv, heading_why_tv, back_tv;
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
        login_tv.setOnClickListener(this);
        heading_why_tv.setText("Please Note :-");
        collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
        collapsingToolbarLayout.setTitle("Electronics");

        //setting up the grid recyclerview
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();

        manager = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerViewAdapter = new RecyclerViewAdapter(this, arrayList, this);
        recyclerView.setAdapter(recyclerViewAdapter);
        setGridSectionDetails();

        //end
    }

    public void setGridSectionDetails() {
        // arrayList.add(new DataModel("Quick Book",R.drawable.electronic));
        arrayList.add(new DataModel("Switch and Socket", R.drawable.socket));
        arrayList.add(new DataModel("Fan", R.drawable.fan));
        arrayList.add(new DataModel("Light", R.drawable.light));
        //  arrayList.add(new DataModel("Chandelier",R.drawable.electronic));
        arrayList.add(new DataModel("MCB & Fuse", R.drawable.mcb_fuse));
        arrayList.add(new DataModel("Inverter & Stabilizer", R.drawable.inverter));
      //  arrayList.add(new DataModel("Appliance", R.drawable.electronic));
        arrayList.add(new DataModel("Wiring", R.drawable.wiring));
        arrayList.add(new DataModel("Door Bell", R.drawable.bell));
        arrayList.add(new DataModel("Room Heater", R.drawable.room_heater));
        //  arrayList.add(new DataModel("Looking For Something else ?",R.drawable.electronic));
        recyclerViewAdapter.notifyDataSetChanged();

    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(ElectricianActivity.this, PECActivity.class);
        startActivity(back);
        finish();
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back_tv:
                onBackPressed();
                break;
            case R.id.login_button_text:
                startActivity(new Intent(ElectricianActivity.this, ViewAllElectrician.class));
                finish();
                break;
        }
    }

    @Override
    public void onClick(int position) {
        switch (position) {
            case 0:
                Intent intent0 = new Intent(ElectricianActivity.this, ViewAllElectrician.class);
                intent0.putExtra("TabNumber", "0");
                startActivity(intent0);
                break;
            case 1:
                Intent intent1 = new Intent(ElectricianActivity.this, ViewAllElectrician.class);
                intent1.putExtra("TabNumber", "1");
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(ElectricianActivity.this, ViewAllElectrician.class);
                intent2.putExtra("TabNumber", "2");
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(ElectricianActivity.this, ViewAllElectrician.class);
                intent3.putExtra("TabNumber", "3");
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(ElectricianActivity.this, ViewAllElectrician.class);
                intent4.putExtra("TabNumber", "4");
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(ElectricianActivity.this, ViewAllElectrician.class);
                intent5.putExtra("TabNumber", "5");
                startActivity(intent5);
                break;
            case 6:
                Intent intent6 = new Intent(ElectricianActivity.this, ViewAllElectrician.class);
                intent6.putExtra("TabNumber", "6");
                startActivity(intent6);
                break;
            case 7:
                Intent intent7 = new Intent(ElectricianActivity.this, ViewAllElectrician.class);
                intent7.putExtra("TabNumber", "7");
                startActivity(intent7);
                break;
        }
    }
}
