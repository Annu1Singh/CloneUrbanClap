package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sundram.urbanclapclone.adapter.GuranteeAdapter;
import com.sundram.urbanclapclone.datamodel.dataModelGuranteeSection;

import java.util.ArrayList;

public class GyserServiceAndRepair extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;
    dataModelGuranteeSection dataModel;
    GuranteeAdapter adapter;

    ArrayList<dataModelGuranteeSection> mList;
    ImageView collapseImage_bg;
    TextView heading_gurantee_section_tv,gurantee_txt_tv1,gurantee_txt_tv2,gurantee_txt_tv3;
    CollapsingToolbarLayout collapsingToolbarLayout;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyser_service_and_repair);


        //setting up the title of collapsableToolbarLayout
        collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
        collapsingToolbarLayout.setTitle("Gyser Service and Repair");
        collapsingToolbarLayout.setCollapsedTitleTextColor(ColorStateList.valueOf(R.color.black));

        //setting collapsetoolbar bg
        collapseImage_bg = findViewById(R.id.collapse_iv);
        collapseImage_bg.setBackgroundResource(R.drawable.services_bg);
        //end collapsable

        //changing in gurantee section
        heading_gurantee_section_tv = findViewById(R.id.heading_gurantee_section_tv);
        heading_gurantee_section_tv.setText("We do not provide services for gas gysers");
        gurantee_txt_tv1 = findViewById(R.id.gurantee_tv1);
        gurantee_txt_tv2 = findViewById(R.id.gurantee_tv2);
        gurantee_txt_tv3 = findViewById(R.id.gurantee_tv3);

        //setting up the text as well drawabel
        gurantee_txt_tv1.setText("Repair Gurantee");
       // gurantee_txt_tv1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_verified_user_black_24dp,0,0,0);
        //gurantee_txt_tv1.setCompoundDrawablePadding(R.dimen.margin_10);
        gurantee_txt_tv2.setText("Customer Protection");
        gurantee_txt_tv3.setText("Spare Assurance");
        //gurantee end

        //setting the gurantee section recyclerView
        recyclerView = findViewById(R.id.gurantee_gyser_recycler);
        mList = new ArrayList<>();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new GuranteeAdapter(this,mList);
        recyclerView.setAdapter(adapter);
        setDataToGuranteeSection();

    }
    public void setDataToGuranteeSection(){
        mList.add(new dataModelGuranteeSection("Repair Gurantee","90 days repair gurantee",R.drawable.ic_beenhere_black));
        mList.add(new dataModelGuranteeSection("Spare Assurance","fixed price of spare parts",R.drawable.ic_beenhere_black));
        mList.add(new dataModelGuranteeSection("Customer Protection","10x of invoice value against damages",R.drawable.ic_beenhere_black));
        adapter.notifyDataSetChanged();
    }
}
