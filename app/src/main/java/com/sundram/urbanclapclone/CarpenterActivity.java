package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sundram.urbanclapclone.adapter.RecyclerViewAdapter;
import com.sundram.urbanclapclone.datamodel.DataModel;

import java.util.ArrayList;

public class CarpenterActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;
    RecyclerViewAdapter recyclerViewAdapter;
    TextView login_tv, grid_heading_tv, back_tv;
    // ImageView collapseImage_bg;
    CollapsingToolbarLayout collapsingToolbarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpenter);
        login_tv = findViewById(R.id.login_button_text);
        login_tv.setText("View all Cleaning Services");

        back_tv = findViewById(R.id.back_tv);
        back_tv.setOnClickListener(this);

        collapsingToolbarLayout = findViewById(R.id.collpasableToolbarLayout);
        collapsingToolbarLayout.setTitle("Carpenter");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();
        GridLayoutManager manager = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerViewAdapter = new RecyclerViewAdapter(this, arrayList);
        recyclerView.setAdapter(recyclerViewAdapter);
        setGridSectionDetailss();
    }

    public void setGridSectionDetailss() {
        arrayList.add(new DataModel("Plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
        arrayList.add(new DataModel("plumber Image", R.drawable.plumber));
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
        Intent back = new Intent(CarpenterActivity.this,PECActivity.class);
        startActivity(back);
        finish();
        super.onBackPressed();
    }
}
