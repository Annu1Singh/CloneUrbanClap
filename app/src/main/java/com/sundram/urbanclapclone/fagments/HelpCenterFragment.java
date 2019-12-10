package com.sundram.urbanclapclone.fagments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.sundram.urbanclapclone.R;

import org.w3c.dom.Text;

public class HelpCenterFragment extends Fragment implements View.OnClickListener {

    private Toolbar toolbar;
    private TextView bookSerice1, payingService, urban_guide;
    private OnFragmentInteractionListener mListener;
    private View helpCenterFragment;

    public HelpCenterFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        helpCenterFragment = LayoutInflater.from(getActivity()).inflate(R.layout.customer_support, null);
        //setting up the toolbar in the fragment
        toolbar = helpCenterFragment.findViewById(R.id.custom_toolbar_wedget);
        toolbar.setTitle(getString(R.string.customer_support));
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        //end
        bookSerice1 = helpCenterFragment.findViewById(R.id.bookSerice);
        payingService = helpCenterFragment.findViewById(R.id.payingService);
        urban_guide = helpCenterFragment.findViewById(R.id.urban_guide);

        bookSerice1.setOnClickListener(this);
        payingService.setOnClickListener(this);
        urban_guide.setOnClickListener(this);

        return helpCenterFragment;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    //getting all method in this onClick method
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bookSerice:
                Toast.makeText(getActivity(), "Not avialable yet..", Toast.LENGTH_LONG).show();
                break;
            case R.id.payingService:
                Toast.makeText(getActivity(), "Not avialable yet..", Toast.LENGTH_LONG).show();
                break;
            case R.id.urban_guide:
                Toast.makeText(getActivity(), "Not avialable yet..", Toast.LENGTH_LONG).show();
                break;
        }
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
