package com.sundram.urbanclapclone.fagments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sundram.urbanclapclone.R;


public class FragmentViewAllTab3 extends Fragment {

    private View tab_three_fragment;
    private TextView view_section_heading;

     public FragmentViewAllTab3() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        tab_three_fragment = inflater.inflate(R.layout.fragment_fragment_view_all_tab3, container, false);
        view_section_heading = tab_three_fragment.findViewById(R.id.view_section_heading);
        view_section_heading.setText("RICA Waxing");
        return tab_three_fragment;
    }

}
