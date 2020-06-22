package com.example.septisodium;

import androidx.annotation.NonNull;

import androidx.fragment.app.FragmentActivity;


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

public class TimgadeInfoActivity extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map ;
    Boolean exp =false ;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timgade_info);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map) ;
        mapFragment.getMapAsync(this);


        View card = findViewById(R.id.objectcard);

        card.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimgadeInfoActivity.this, DetailObjectTimgadeActivity.class);
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
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.page_1:
                        Intent intent = new Intent(TimgadeInfoActivity.this, FaqActivity.class);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                        break;
                    case R.id.page_3:
                        Intent intent2 = new Intent(TimgadeInfoActivity.this, MainActivity.class);
                        startActivity(intent2);
                        overridePendingTransition(0,0);
                        break;
                    case R.id.page_4:
                        Intent intent3 = new Intent(TimgadeInfoActivity.this, ResearchesActivity.class);
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
        LatLng timgade = new LatLng(35.484448, 6.467640) ;
        //map.moveCamera(CameraUpdateFactory.newLatLng(khemissa));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(timgade,16f));
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

}
