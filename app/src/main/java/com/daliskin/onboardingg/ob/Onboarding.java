package com.daliskin.onboardingg.ob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.daliskin.onboardingg.R;

import me.relex.circleindicator.CircleIndicator;

public class Onboarding extends AppCompatActivity {
    private ViewPager viewPager;
    private TextView tvBoQua;
    private Button btnTiepTheo;
    private CircleIndicator circleIndicator;
    private RelativeLayout layoutBottom;
    private ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        innitUI();

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdapter);

        circleIndicator.setViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position ==2 ) {
                    circleIndicator.setVisibility(View.GONE);
                    tvBoQua.setVisibility(View.GONE);
                    btnTiepTheo.setVisibility(View.GONE);
                } else {
                    circleIndicator.setVisibility(View.VISIBLE);
                    tvBoQua.setVisibility(View.VISIBLE);
                    btnTiepTheo.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

    private void innitUI(){
        tvBoQua = findViewById(R.id.tvBoQua);
        viewPager = findViewById(R.id.viewpager1);
        btnTiepTheo = findViewById(R.id.btnTiepTheo);
        circleIndicator = findViewById(R.id.circleIndicator);
        layoutBottom = findViewById(R.id.layoutBottom);

        tvBoQua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
            }
        });

        btnTiepTheo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (viewPager.getCurrentItem() <2 ) {
                    viewPager.setCurrentItem(viewPager.getCurrentItem() +1);

                }
            }
        });





    }
}

