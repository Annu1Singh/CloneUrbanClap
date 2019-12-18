package com.sundram.urbanclapclone.fagments.salonathomeservice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sundram.urbanclapclone.R;
import com.sundram.urbanclapclone.adapter.SectionViewAllServiceListAdapter;
import com.sundram.urbanclapclone.datamodel.SectionViewAllServiceListModel;

import java.util.ArrayList;

public class FragmentViewAllTab2 extends Fragment implements SectionViewAllServiceListAdapter.OnServiceItemClick {

    private TextView view_section_heading;
    private RecyclerView fragment_tab_one_recycler;
    private SectionViewAllServiceListAdapter adapterList;
    ArrayList<SectionViewAllServiceListModel> list ;
    private View tab_two_fragment;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        tab_two_fragment = inflater.inflate(R.layout.fragment_fragment_view_all_tab1, container, false);
        view_section_heading = tab_two_fragment.findViewById(R.id.view_section_heading);
        view_section_heading.setText("RICA Waxing");

        fragment_tab_one_recycler = tab_two_fragment.findViewById(R.id.fragment_tab_one_recycler);
        list = new ArrayList<>();
        fragment_tab_one_recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapterList = new SectionViewAllServiceListAdapter(getActivity(),list,this);
        fragment_tab_one_recycler.setAdapter(adapterList);
        setDataToRecycler();
        return tab_two_fragment;
    }
    public void setDataToRecycler(){
        list.add(new SectionViewAllServiceListModel("Service Name","120","40","RICA Wax","60 min",R.drawable.waxing));
        list.add(new SectionViewAllServiceListModel("Service Name","180","40","RICA Wax","60 min",R.drawable.waxing));
        list.add(new SectionViewAllServiceListModel("Service Name","190","40","RICA Wax","60 min",R.drawable.waxing));
        list.add(new SectionViewAllServiceListModel("Service Name","200","40","RICA Wax","60 min",R.drawable.waxing));
        list.add(new SectionViewAllServiceListModel("Service Name","300","40","RICA Wax","60 min",R.drawable.waxing));
        list.add(new SectionViewAllServiceListModel("Service Name","100","40","RICA Wax","60 min",R.drawable.waxing));
    }
    @Override
    public void onClick(int position) {


    }
}
