package com.example.septisodium;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class KhmissaInfoActivity extends FragmentActivity implements OnMapReadyCallback {
private GoogleMap map ;
    Boolean exp =false ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khmissa_info);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map) ;
        mapFragment.getMapAsync(this);


        View card = findViewById(R.id.objectcard);

        card.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KhmissaInfoActivity.this, DetailObjectActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });

        LinearLayout linearLayout ;
        final LinearLayout expandableLayout ;
        linearLayout= findViewById(R.id.layout1);
        expandableLayout= findViewById(R.id.layout2);
        expandableLayout.setVisibility(View.GONE);
        final ImageView imageView = findViewById(R.id.down);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!exp){
                    exp=true ;
                    imageView.setImageResource(R.drawable.ic_up);
                    expandableLayout.setVisibility(View.VISIBLE);
                }else {
                    exp=false ;
                    imageView.setImageResource(R.drawable.ic_down);
                    expandableLayout.setVisibility(View.GONE);
                }
            }
        });



       BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation) ;
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.page_1:
                        Intent intent = new Intent(KhmissaInfoActivity.this, FaqActivity.class);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                        break;
                    case R.id.page_2:
                        Intent intent1 = new Intent(KhmissaInfoActivity.this, StepbyStepActivity.class);
                        startActivity(intent1);
                        overridePendingTransition(0,0);
                        break;
                    case R.id.page_3:
                        Intent intent2 = new Intent(KhmissaInfoActivity.this, MainActivity.class);
                        startActivity(intent2);
                        overridePendingTransition(0,0);
                        break;
                    case R.id.page_4:
                        Intent intent3 = new Intent(KhmissaInfoActivity.this, ResearchesActivity.class);
                        startActivity(intent3);
                        overridePendingTransition(0,0);
                        break;

                }

                return true;
            }
        });

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map= googleMap ;

        LatLng khemissa = new LatLng(36.194336, 7.656217) ;
        map.addMarker((new MarkerOptions().position(khemissa).title("khemissa")));
        map.moveCamera(CameraUpdateFactory.newLatLng(khemissa));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(khemissa,12f));
    }



}
