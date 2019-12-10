package com.sundram.urbanclapclone.fagments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.sundram.urbanclapclone.GuranteeActivity;
import com.sundram.urbanclapclone.R;
import com.sundram.urbanclapclone.SofaCleaning;

import me.relex.circleindicator.CircleIndicator;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private Toolbar toolbar;
    private OnFragmentInteractionListener mListener;
    private View thisFragment;
    private ViewFlipper viewFlipper;
    private CircleIndicator indicator;
    private CardView cardView,isn_cardview;
    private int images[] = {R.drawable.ayushamannkhurrana,
            R.drawable.ayushamannkhurrana,
            R.drawable.ayushamannkhurrana,
            R.drawable.ayushamannkhurrana,
            R.drawable.ayushamannkhurrana
    };

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        thisFragment = LayoutInflater.from(getActivity()).inflate(R.layout.activity_home_screen,null);
        //setting up the toolbar
        toolbar = thisFragment.findViewById(R.id.toolbar_home_screen);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        //sed
       //setting up the carusel in home fragment
        viewFlipper = thisFragment.findViewById(R.id.v_flipper);
        indicator = thisFragment.findViewById(R.id.indicator);
        for (int image : images) {
            addFilpperImage(image);

        }
        //end
        cardView = thisFragment.findViewById(R.id.home_screen_item_single_card_ui);
        isn_cardview = thisFragment.findViewById(R.id.home_screen_item_single_card_ui_ins);
        isn_cardview.setOnClickListener(this);
        cardView.setOnClickListener(this);


        return thisFragment;
    }

    public void addFilpperImage(int image) {
        ImageView imageView = new ImageView(thisFragment.getContext());
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(thisFragment.getContext(), android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(thisFragment.getContext(), android.R.anim.slide_out_right);
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.home_screen_item_single_card_ui :
                Intent cleaningService = new Intent(getContext(), SofaCleaning.class);
                startActivity(cleaningService);
                getActivity().finish();
                break;
            case R.id.home_screen_item_single_card_ui_ins :
                Intent gurantee = new Intent(getContext(), GuranteeActivity.class);
                startActivity(gurantee);
                getActivity().finish();
        }
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
