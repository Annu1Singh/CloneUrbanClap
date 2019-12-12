package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sundram.urbanclapclone.adapter.GuranteeAdapter;
import com.sundram.urbanclapclone.datamodel.dataModelGuranteeSection;

import java.util.ArrayList;

public class GyserServiceAndRepair extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;
    RecyclerView recyclerView;
    dataModelGuranteeSection dataModel;
    GuranteeAdapter adapter;

    ArrayList<dataModelGuranteeSection> mList;
    TextView back_tv;
    TextView heading_gurantee_section_tv,gurantee_txt_tv1,gurantee_txt_tv2,gurantee_txt_tv3;
    CollapsingToolbarLayout collapsingToolbarLayout;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyser_service_and_repair);

        back_tv = findViewById(R.id.back_tv);
        back_tv.setOnClickListener(this);
        //setting up the title of collapsableToolbarLayout
        collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
        collapsingToolbarLayout.setTitle("Gyser Service and Repair");



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent ii = new Intent(GyserServiceAndRepair.this,ApplianceAndEcRepair.class);
        startActivity(ii);
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
