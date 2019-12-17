package com.sundram.urbanclapclone.fagments.salonathomeservice;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sundram.urbanclapclone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentViewAllTab8 extends Fragment {
    private View tab_eight_fragment;
    private TextView view_section_heading;

    public FragmentViewAllTab8() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        tab_eight_fragment = inflater.inflate(R.layout.fragment_fragment_view_all_tab8, container, false);
        view_section_heading = tab_eight_fragment.findViewById(R.id.view_section_heading);
        view_section_heading.setText("Threading");
        return tab_eight_fragment;
    }

}
