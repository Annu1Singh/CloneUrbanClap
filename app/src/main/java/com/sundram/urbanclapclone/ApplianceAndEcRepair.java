package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sundram.urbanclapclone.adapter.AdapterServiceList;
import com.sundram.urbanclapclone.adapter.RecyclerViewAdapter;
import com.sundram.urbanclapclone.datamodel.DataModel;

import java.util.ArrayList;

public class ApplianceAndEcRepair extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;
    AdapterServiceList adapterServiceList;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appliance_and_ec_repair);
        toolbar = findViewById(R.id.service_list_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //setting up the recyclerview ofs erivce list
        recyclerView = new RecyclerView(this);
        arrayList = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapterServiceList = new AdapterServiceList(this,arrayList);
        recyclerView.setAdapter(adapterServiceList);


    }

    public void setServiceListItemDetails(){
        arrayList.add(new DataModel("AC Service and Repair",R.drawable.acrepair));
        arrayList.add(new DataModel("Gyser Repair and Service",R.drawable.gyserservice));
        arrayList.add(new DataModel("Washing Machine Repair and Service",R.drawable.washingservice));
        arrayList.add(new DataModel("Refrigerator Repair",R.drawable.refrigeratorservice));
        arrayList.add(new DataModel("RO or Water Purifier Repair",R.drawable.roservice));
        arrayList.add(new DataModel("Microwave Repair",R.drawable.microwave_repair));

    }
}
