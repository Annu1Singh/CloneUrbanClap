package com.sundram.urbanclapclone.fagments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.sundram.urbanclapclone.R;

public class FragmentViewAllTab2 extends Fragment {

    private View tab_two_fragment;
    private TextView view_section_heading;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        tab_two_fragment = inflater.inflate(R.layout.fragment_fragment_view_all_tab2, container, false);
        view_section_heading = tab_two_fragment.findViewById(R.id.view_section_heading);
        view_section_heading.setText("Demo Heading");
        return tab_two_fragment;
    }
}
