package com.sundram.urbanclapclone.fagments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sundram.urbanclapclone.R;


public class FragmentViewAllTab7 extends Fragment {

    private View tab_seven_fragment;
    private TextView view_section_heading;

    public FragmentViewAllTab7() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        tab_seven_fragment = inflater.inflate(R.layout.fragment_fragment_view_all_tab7, container, false);
        view_section_heading = tab_seven_fragment.findViewById(R.id.view_section_heading);
        view_section_heading.setText("Hair Care");
        return tab_seven_fragment;
    }

}
