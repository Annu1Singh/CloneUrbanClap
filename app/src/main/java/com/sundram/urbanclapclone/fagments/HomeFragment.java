package com.sundram.urbanclapclone.fagments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.sundram.urbanclapclone.ApplianceAndEcRepair;
import com.sundram.urbanclapclone.GuranteeActivity;
import com.sundram.urbanclapclone.LocationOnBoarding;
import com.sundram.urbanclapclone.PECActivity;
import com.sundram.urbanclapclone.PestControl;
import com.sundram.urbanclapclone.R;
import com.sundram.urbanclapclone.SalonAtHome;
import com.sundram.urbanclapclone.ServiceListItem;
import com.sundram.urbanclapclone.ViewDialog;
import com.sundram.urbanclapclone.WidgetSearch;
import com.sundram.urbanclapclone.adapter.AdapterHomeScreenServiceListItem;
import com.sundram.urbanclapclone.datamodel.ServiceName;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class HomeFragment extends Fragment implements View.OnClickListener, AdapterHomeScreenServiceListItem.OnServiceItemClick {

    private Toolbar toolbar;
    private RelativeLayout include_searchView;
    private View thisFragment;
    private ViewFlipper viewFlipper;
    private CircleIndicator indicator;
    private CardView isn_cardview;
    private TextView home_screen_selected_city;
    ViewDialog viewDialog;
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
    public void onStart() {
        super.onStart();
        getActivity().overridePendingTransition(R.anim.fadein,R.anim.fadeout);
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
        initVar();
        //end
        //setting up the toolbar
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        //end

        //setting up the carusel in home fragment
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getActivity());
        String value = sp.getString("address", "DefaultValue");
        //Toast.makeText(getActivity(),value,Toast.LENGTH_LONG).show();

        for (int image : images) {
            addFilpperImage(image);

        }
        //end
        viewDialog = new ViewDialog(getActivity());
        //setting up the listners
        isn_cardview.setOnClickListener(this);
        include_searchView.setOnClickListener(this);
        home_screen_selected_city.setText(value);
        //end
        //setting up the recycler view
        arrayList = new ArrayList<ServiceName>();

        home_screen_list_item_recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        homeScreeenListAdapter = new AdapterHomeScreenServiceListItem(getActivity(), arrayList, this);
        home_screen_list_item_recyclerView.setAdapter(homeScreeenListAdapter);
        setDataServiceListItem();
        //end


        return thisFragment;
    }

    //getting ids of all the view
    public void initVar() {
        toolbar = thisFragment.findViewById(R.id.toolbar_home_screen);
        isn_cardview = thisFragment.findViewById(R.id.home_screen_item_single_card_ui_ins);
        include_searchView = thisFragment.findViewById(R.id.include_searchView);
        viewFlipper = thisFragment.findViewById(R.id.v_flipper);
        home_screen_list_item_recyclerView = thisFragment.findViewById(R.id.home_screen_list_item_recyclerView);
        indicator = thisFragment.findViewById(R.id.indicator);
        home_screen_selected_city = thisFragment.findViewById(R.id.home_screen_selected_city);
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


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_screen_item_single_card_ui_ins:
                Intent gurantee = new Intent(getContext(), GuranteeActivity.class);
                startActivity(gurantee);
                getActivity().finish();
                break;
            case R.id.include_searchView:
                Intent searchView = new Intent(getActivity(), WidgetSearch.class);
                startActivity(searchView);
                getActivity().finish();
                break;
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
        switch (position) {
            case 0:
                salonAtHome();
                break;
            case 1:
                cleaningService();
                break;
            case 2:
                pecService();
                break;
            case 3:
                applianceService();
                break;
            case 4:
                pestControlService();
                break;
        }
    }

    //salon at home intent
    public void salonAtHome() {
        viewDialog.showDialog();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getActivity(), SalonAtHome.class);
                startActivity(i);
                getActivity().finish();
                viewDialog.hideDialog();
            }
        }, 2000);
    }

    //Cleaning Service intent
    public void cleaningService() {
        viewDialog.showDialog();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getActivity(), ServiceListItem.class);
                startActivity(i);
                getActivity().finish();
                viewDialog.hideDialog();
            }
        }, 2000);
    }

    //PEC Service intent
    public void pecService() {
        viewDialog.showDialog();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getActivity(), PECActivity.class);
                startActivity(i);
                getActivity().finish();
                viewDialog.hideDialog();
            }
        }, 2000);
    }

    //appliance Service intent
    public void applianceService() {
        viewDialog.showDialog();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getActivity(), ApplianceAndEcRepair.class);
                startActivity(i);
                getActivity().finish();
                viewDialog.hideDialog();
            }
        }, 2000);
    }

    //Cleaning Service intent
    public void pestControlService() {
        viewDialog.showDialog();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getActivity(), PestControl.class);
                startActivity(i);
                getActivity().finish();
                viewDialog.hideDialog();
            }
        }, 2000);
    }
}
