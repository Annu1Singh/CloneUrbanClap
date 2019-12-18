package com.sundram.urbanclapclone.fagments.salonathomeservice;


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


public class FragmentViewAllTab6 extends Fragment implements SectionViewAllServiceListAdapter.OnServiceItemClick {

    private View tab_five_fragment;
    private TextView view_section_heading;
    private RecyclerView fragment_tab_one_recycler;
    private SectionViewAllServiceListAdapter adapterList;
    ArrayList<SectionViewAllServiceListModel> list ;

    public FragmentViewAllTab6() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        tab_five_fragment = inflater.inflate(R.layout.fragment_fragment_view_all_tab1, container, false);
        view_section_heading = tab_five_fragment.findViewById(R.id.view_section_heading);
        view_section_heading.setText("Hair Care");
        fragment_tab_one_recycler = tab_five_fragment.findViewById(R.id.fragment_tab_one_recycler);
        list = new ArrayList<>();
        fragment_tab_one_recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapterList = new SectionViewAllServiceListAdapter(getActivity(),list,this);
        fragment_tab_one_recycler.setAdapter(adapterList);
        setDataToRecycler();
        return tab_five_fragment;
    }

    public void setDataToRecycler(){
        list.add(new SectionViewAllServiceListModel("Service Name","120","40","Hair","60 min",R.drawable.hair));
        list.add(new SectionViewAllServiceListModel("Service Name","180","40","Hair","60 min",R.drawable.hair));
        list.add(new SectionViewAllServiceListModel("Service Name","190","40","Hair","60 min",R.drawable.hair));
        list.add(new SectionViewAllServiceListModel("Service Name","200","40","Hair","60 min",R.drawable.hair));
        list.add(new SectionViewAllServiceListModel("Service Name","300","40","Hair","60 min",R.drawable.hair));
        list.add(new SectionViewAllServiceListModel("Service Name","100","40","Hair","60 min",R.drawable.hair));
    }
    @Override
    public void onClick(int position) {

    }
}
