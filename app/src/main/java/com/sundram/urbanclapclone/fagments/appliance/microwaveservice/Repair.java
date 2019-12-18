package com.sundram.urbanclapclone.fagments.appliance.microwaveservice;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sundram.urbanclapclone.R;
import com.sundram.urbanclapclone.adapter.PECAdapter;
import com.sundram.urbanclapclone.datamodel.CarpenterDataModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Repair extends Fragment implements PECAdapter.OnServiceItemClick {

    private View applianceFragment;
    private TextView view_section_heading;
    private RecyclerView recyclerView;
    private PECAdapter adapter;
    private ArrayList<CarpenterDataModel> mList;

    public Repair() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        applianceFragment = inflater.inflate(R.layout.fragment_fragment_view_all_tab1, container, false);
        implementRecyclerview();
        return applianceFragment;
    }

    public void implementRecyclerview(){
        view_section_heading = applianceFragment.findViewById(R.id.view_section_heading);
        view_section_heading.setText("Microwave Repair");
        recyclerView = applianceFragment.findViewById(R.id.fragment_tab_one_recycler);
        mList = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new PECAdapter(getActivity(),mList,this);
        setDataToRecycler();
        recyclerView.setAdapter(adapter);
    }
    public void setDataToRecycler() {
        mList.add(new CarpenterDataModel("Microwave Repair(Not Heating)", "1254", "200"));
        mList.add(new CarpenterDataModel("Microwave Repair(Button Not Working)", "1254", "300"));
        mList.add(new CarpenterDataModel("Microwave Repair(Noise)", "1254", "100"));
        adapter.notifyDataSetChanged();
    }

    @Override
    public void OnClick(int position) {

    }
}
