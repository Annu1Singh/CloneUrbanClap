package com.sundram.urbanclapclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.ViewFlipper;

import me.relex.circleindicator.CircleIndicator;

public class HomeScreenActivity extends AppCompatActivity {

    int images[] = {R.drawable.ayushamannkhurrana,
                    R.drawable.ayushamannkhurrana,
                    R.drawable.ayushamannkhurrana,
                    R.drawable.ayushamannkhurrana,
                    R.drawable.ayushamannkhurrana
    };

    ScrollView scrollView;
    private ViewFlipper viewFlipper;
    CircleIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        viewFlipper = findViewById(R.id.v_flipper);
        indicator = findViewById(R.id.indicator);
        scrollView = findViewById(R.id.home_screen_scrollview);



        for (int image : images){
            addFilpperImage(image);
        }

    }
    public void addFilpperImage(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
