package com.sundram.urbanclapclone.fagments.salonathomeservice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sundram.urbanclapclone.R;
import com.sundram.urbanclapclone.adapter.SectionViewAllServiceListAdapter;
import com.sundram.urbanclapclone.datamodel.SectionViewAllServiceListModel;

import java.util.ArrayList;

public class FragmentViewAllTab1 extends Fragment implements View.OnClickListener, SectionViewAllServiceListAdapter.OnServiceItemClick {
    int count = 0;

    private View tab_one_fragment;
    private TextView view_section_heading;
    private RecyclerView fragment_tab_one_recycler;
    private SectionViewAllServiceListAdapter adapterList;
    ArrayList<SectionViewAllServiceListModel> list;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        tab_one_fragment = inflater.inflate(R.layout.fragment_fragment_view_all_tab1, container, false);
        view_section_heading = tab_one_fragment.findViewById(R.id.view_section_heading);
        view_section_heading.setText("Waxing");

        fragment_tab_one_recycler = tab_one_fragment.findViewById(R.id.fragment_tab_one_recycler);

        list = new ArrayList<>();
        fragment_tab_one_recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapterList = new SectionViewAllServiceListAdapter(getActivity(), list, this);
        fragment_tab_one_recycler.setAdapter(adapterList);
        setDataToRecycler();
        return tab_one_fragment;
    }

    public void setDataToRecycler() {
        list.add(new SectionViewAllServiceListModel("Service Name", "120", "40", "Wax", "60 min", R.drawable.waxing));
        list.add(new SectionViewAllServiceListModel("Service Name", "180", "40", "Wax", "60 min", R.drawable.waxing));
        list.add(new SectionViewAllServiceListModel("Service Name", "190", "40", "Wax", "60 min", R.drawable.waxing));
        list.add(new SectionViewAllServiceListModel("Service Name", "200", "40", "Wax", "60 min", R.drawable.waxing));
        list.add(new SectionViewAllServiceListModel("Service Name", "300", "40", "Wax", "60 min", R.drawable.waxing));
        list.add(new SectionViewAllServiceListModel("Service Name", "100", "40", "Wax", "60 min", R.drawable.waxing));
    }

    @Override
    public void onClick(int position) {

    }


    @Override
    public void onClick(View v) {
    }
}
