package com.sundram.urbanclapclone.fagments.cleaningservice;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sundram.urbanclapclone.R;
import com.sundram.urbanclapclone.adapter.SectionViewAllServiceListAdapter;
import com.sundram.urbanclapclone.datamodel.SectionViewAllServiceListModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FullHomeDeepCleaning extends Fragment implements SectionViewAllServiceListAdapter.OnServiceItemClick {

    private  View fullHomeDeepCleaningFragment;
    private TextView view_section_heading;
    private RecyclerView fragment_tab_one_recycler;
    private SectionViewAllServiceListAdapter adapterList;
    ArrayList<SectionViewAllServiceListModel> list ;
    public FullHomeDeepCleaning() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fullHomeDeepCleaningFragment = inflater.inflate(R.layout.fragment_fragment_view_all_tab1,container,false);
        view_section_heading = fullHomeDeepCleaningFragment.findViewById(R.id.view_section_heading);
        view_section_heading.setText("Full Home Deep Cleaning");
        implementRecyclerView();
        return fullHomeDeepCleaningFragment;
    }

    public void implementRecyclerView(){
        fragment_tab_one_recycler = fullHomeDeepCleaningFragment.findViewById(R.id.fragment_tab_one_recycler);

        list = new ArrayList<>();
        fragment_tab_one_recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapterList = new SectionViewAllServiceListAdapter(getActivity(),list,this);
        fragment_tab_one_recycler.setAdapter(adapterList);
        setDataToRecycler();
    }

    public void setDataToRecycler(){
        list.add(new SectionViewAllServiceListModel("1 BHK Home Cleaning","120","40","Full Home Cleaning","60 min",R.drawable.full_home_cleaning));
        list.add(new SectionViewAllServiceListModel("2 BHK Home Cleaning","180","40","Full Home Cleaning","60 min",R.drawable.full_home_cleaning));
        list.add(new SectionViewAllServiceListModel("3 BHK Home Cleaning","190","40","Full Home Cleaning","60 min",R.drawable.full_home_cleaning));
        list.add(new SectionViewAllServiceListModel("4 BHK Home Cleaning","200","40","Full Home Cleaning","60 min",R.drawable.full_home_cleaning));
        list.add(new SectionViewAllServiceListModel("5 BHK Home Cleaning","300","40","Full Home Cleaning","60 min",R.drawable.full_home_cleaning));
        //list.add(new SectionViewAllServiceListModel("Service Name","100","40","Full Home Cleaning","60 min",R.drawable.full_home_cleaning));
    }

    @Override
    public void onClick(int position) {

    }
}
