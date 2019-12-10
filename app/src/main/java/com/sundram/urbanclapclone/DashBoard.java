package com.sundram.urbanclapclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sundram.urbanclapclone.fagments.HelpCenterFragment;
import com.sundram.urbanclapclone.fagments.HomeFragment;
import com.sundram.urbanclapclone.fagments.MyBookingFragment;
import com.sundram.urbanclapclone.fagments.ProfileFragment;

public class DashBoard extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottom_nav_view;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        bottom_nav_view = findViewById(R.id.bottom_nav_view);
        bottom_nav_view.setOnNavigationItemSelectedListener(this);

        // it makes default fragment
        loadFragment(new HomeFragment());

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int menuItemId = menuItem.getItemId();
        int id[] = new int[]{R.id.action_home, R.id.action_my_booking, R.id.action_help_center, R.id.action_profile};
        fragment = null;
        if (menuItemId == id[0]) {
            fragment = new HomeFragment();
        } else if (menuItemId == id[1]) {
            fragment = new MyBookingFragment();
        } else if (menuItemId == id[2]) {
            fragment = new HelpCenterFragment();
        } else if (menuItemId == id[3]) {
            fragment = new ProfileFragment();
        }

        return loadFragment(fragment);
    }

    // use to load and switch the fragments
    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.nav_host_fragment, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
