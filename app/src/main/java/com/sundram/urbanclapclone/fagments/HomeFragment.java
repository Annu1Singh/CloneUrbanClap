package com.sundram.urbanclapclone.fagments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.sundram.urbanclapclone.ApplianceAndEcRepair;
import com.sundram.urbanclapclone.GuranteeActivity;
import com.sundram.urbanclapclone.PECActivity;
import com.sundram.urbanclapclone.PestControl;
import com.sundram.urbanclapclone.R;
import com.sundram.urbanclapclone.SalonAtHome;
import com.sundram.urbanclapclone.ServiceListItem;
import com.sundram.urbanclapclone.SofaCleaning;
import com.sundram.urbanclapclone.WidgetSearch;
import com.sundram.urbanclapclone.adapter.AdapterHomeScreenServiceListItem;
import com.sundram.urbanclapclone.adapter.RecyclerViewAdapter;
import com.sundram.urbanclapclone.datamodel.ServiceName;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class HomeFragment extends Fragment implements View.OnClickListener, AdapterHomeScreenServiceListItem.OnServiceItemClick {

    private Toolbar toolbar;
    private RelativeLayout include_searchView;
    private OnFragmentInteractionListener mListener;
    private View thisFragment;
    private ViewFlipper viewFlipper;
    private CircleIndicator indicator;
    private CardView cardView, isn_cardview;

    RecyclerView home_screen_list_item_recyclerView;
    AdapterHomeScreenServiceListItem homeScreeenListAdapter;
    ArrayList<ServiceName> arrayList;

    private int images[] = {R.drawable.service_bgs,
            R.drawable.carpet_cleaning,
            R.drawable.bathroom,
            R.drawable.sofa_cleaning,
            R.drawable.kitchen_cleaning
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

        thisFragment = LayoutInflater.from(getActivity()).inflate(R.layout.activity_home_screen, null);
        //getting the ids of all views
        toolbar = thisFragment.findViewById(R.id.toolbar_home_screen);
        cardView = thisFragment.findViewById(R.id.home_screen_item_single_card_ui);
        isn_cardview = thisFragment.findViewById(R.id.home_screen_item_single_card_ui_ins);
        include_searchView = thisFragment.findViewById(R.id.include_searchView);
        viewFlipper = thisFragment.findViewById(R.id.v_flipper);
        home_screen_list_item_recyclerView = thisFragment.findViewById(R.id.home_screen_list_item_recyclerView);
        //end
        //setting up the toolbar
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        //end

        //setting up the carusel in home fragment
        indicator = thisFragment.findViewById(R.id.indicator);
        for (int image : images) {
            addFilpperImage(image);

        }
        //end

        //setting up the listners
        isn_cardview.setOnClickListener(this);
        cardView.setOnClickListener(this);
        include_searchView.setOnClickListener(this);
        //end
        //setting up the recycler view
        arrayList = new ArrayList<ServiceName>();

        home_screen_list_item_recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        homeScreeenListAdapter = new AdapterHomeScreenServiceListItem(getActivity(), arrayList,this);
        home_screen_list_item_recyclerView.setAdapter(homeScreeenListAdapter);
        setDataServiceListItem();
        //end


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
        switch (v.getId()) {
            case R.id.home_screen_item_single_card_ui:
                Intent cleaningService = new Intent(getContext(), SofaCleaning.class);
                startActivity(cleaningService);
                getActivity().finish();
                break;
            case R.id.home_screen_item_single_card_ui_ins:
                Intent gurantee = new Intent(getContext(), GuranteeActivity.class);
                startActivity(gurantee);
                getActivity().finish();
                break;
            case R.id.include_searchView:
                Intent searchView = new Intent(getActivity(), WidgetSearch.class);
                startActivity(searchView);
                getActivity().finish();
        }
    }

    //setting the data into service list item of home
    public void setDataServiceListItem() {
        arrayList.add(new ServiceName("Beauty Services at Home",
                "Wax | Facial |Packages",
                "Facial",
                "Packages"));
        arrayList.add(new ServiceName("Cleaning Services",
                "Bathroom | Sofa | Kitchen",
                "Sofa",
                "Kitchen"));
        arrayList.add(new ServiceName("Plumber, Electrician, Carpenter",
                "Service in 60 minutes",
                "in",
                "60 minutes"));
        arrayList.add(new ServiceName("Appliance & Electronic Repair",
                "90 Days Services Gurantee",
                "Service",
                "Gurantee"));
        arrayList.add(new ServiceName("Pest Control Services",
                "Guranteed Removal Certified Safe Chemicals",
                "Certified Safe",
                "Chemicals"));
        homeScreeenListAdapter.notifyDataSetChanged();

    }
//onClick for recyclerView item
    @Override
    public void onClick(int position) {
        ///Toast.makeText(getActivity(),"position"+position,Toast.LENGTH_LONG).show();
        switch (position){
            case 0:
                Intent salonAtHome = new Intent(getActivity(), SalonAtHome.class);
                startActivity(salonAtHome);
                getActivity().finish();
                break;
            case 1:
                Intent cleaningService = new Intent(getActivity(), ServiceListItem.class);
                startActivity(cleaningService);
                getActivity().finish();
                break;
            case 2:
                Intent pecService = new Intent(getActivity(), PECActivity.class);
                startActivity(pecService);
                getActivity().finish();
                break;
            case 3:
                Intent applianceService = new Intent(getActivity(), ApplianceAndEcRepair.class);
                startActivity(applianceService);
                getActivity().finish();
                break;
            case 4:
                Intent pestControl = new Intent(getActivity(), PestControl.class);
                startActivity(pestControl);
                getActivity().finish();
                break;
        }
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
