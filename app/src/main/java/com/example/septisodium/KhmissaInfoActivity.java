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

        LinearLayout linearLayout1 ;
        final LinearLayout expandableLayout1 ;
        linearLayout1= findViewById(R.id.layout3);
        expandableLayout1= findViewById(R.id.layout4);
        expandableLayout1.setVisibility(View.GONE);
        final ImageView imageView1 = findViewById(R.id.down1);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!exp){
                    exp=true ;
                    imageView1.setImageResource(R.drawable.ic_up);
                    expandableLayout1.setVisibility(View.VISIBLE);
                }else {
                    exp=false ;
                    imageView1.setImageResource(R.drawable.ic_down);
                    expandableLayout1.setVisibility(View.GONE);
                }
            }
        });

    LinearLayout linearLayout2 ;
    final LinearLayout expandableLayout2 ;
    linearLayout2= findViewById(R.id.layout5);
    expandableLayout2= findViewById(R.id.layout6);
    expandableLayout2.setVisibility(View.GONE);
    final ImageView imageView2 = findViewById(R.id.down2);

    linearLayout2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(!exp){
                exp=true ;
                imageView2.setImageResource(R.drawable.ic_up);
                expandableLayout2.setVisibility(View.VISIBLE);
            }else {
                exp=false ;
                imageView2.setImageResource(R.drawable.ic_down);
                expandableLayout2.setVisibility(View.GONE);
            }
        }
    });

        LinearLayout linearLayout3;
        final LinearLayout expandableLayout3 ;
        linearLayout3= findViewById(R.id.layout7);
        expandableLayout3= findViewById(R.id.layout8);
        expandableLayout3.setVisibility(View.GONE);
        final ImageView imageView3 = findViewById(R.id.down3);

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!exp){
                    exp=true ;
                    imageView3.setImageResource(R.drawable.ic_up);
                    expandableLayout3.setVisibility(View.VISIBLE);
                }else {
                    exp=false ;
                    imageView3.setImageResource(R.drawable.ic_down);
                    expandableLayout3.setVisibility(View.GONE);
                }
            }
        });
        LinearLayout linearLayout4;
        final LinearLayout expandableLayout4 ;
        linearLayout4= findViewById(R.id.layout9);
        expandableLayout4= findViewById(R.id.layout10);
        expandableLayout4.setVisibility(View.GONE);
        final ImageView imageView4 = findViewById(R.id.down4);

        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!exp){
                    exp=true ;
                    imageView4.setImageResource(R.drawable.ic_up);
                    expandableLayout4.setVisibility(View.VISIBLE);
                }else {
                    exp=false ;
                    imageView4.setImageResource(R.drawable.ic_down);
                    expandableLayout4.setVisibility(View.GONE);
                }
            }
        });


        LinearLayout linearLayout5;
        final LinearLayout expandableLayout5 ;
        linearLayout5= findViewById(R.id.layout11);
        expandableLayout5= findViewById(R.id.layout12);
        expandableLayout5.setVisibility(View.GONE);
        final ImageView imageView5 = findViewById(R.id.down5);

        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!exp){
                    exp=true ;
                    imageView5.setImageResource(R.drawable.ic_up);
                    expandableLayout5.setVisibility(View.VISIBLE);
                }else {
                    exp=false ;
                    imageView5.setImageResource(R.drawable.ic_down);
                    expandableLayout5.setVisibility(View.GONE);
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

        LatLng Alger = new LatLng(36.195864, 7.686330) ;
        map.addMarker((new MarkerOptions().position(new LatLng(36.195450, 7.699433)).title("نقطة انطلاق المنبع المائي")));
        map.addMarker((new MarkerOptions().position(new LatLng(36.193194, 7.676111 )).title("نقطة التحصيل")));
        map.addMarker((new MarkerOptions().position(new LatLng(36.195400, 7.676117 )).title("المسار الثاني")));
        map.addMarker((new MarkerOptions().position(new LatLng(36.196950, 7.674217 )).title("البئر")));
        map.addMarker((new MarkerOptions().position(new LatLng(36.196067, 7.675917 )).title("القناة الناقلة السطحية")));
        map.addMarker((new MarkerOptions().position(new LatLng(36.197883, 7.674000 )).title(" القناة السطحية")));
        map.moveCamera(CameraUpdateFactory.newLatLng(Alger));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Alger,12f));
    }



}
