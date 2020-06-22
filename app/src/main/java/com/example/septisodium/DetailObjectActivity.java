package com.example.septisodium;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class DetailObjectActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private ExploreFragment exploreFragment;
    private FlightsFragment flightsFragment;
    private TravelFragment travelFragment;
    private ReconstitutionKhemissa reconstitutionKhemissa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailobjects);




        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        exploreFragment = new ExploreFragment();
        flightsFragment = new FlightsFragment();
        travelFragment = new TravelFragment();
        reconstitutionKhemissa = new ReconstitutionKhemissa();



        DetailObjectActivity.ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragment(exploreFragment, "buildings");
        viewPagerAdapter.addFragment(reconstitutionKhemissa, "Reconstitution");
        viewPagerAdapter.addFragment(flightsFragment, "Plan");
        viewPagerAdapter.addFragment(travelFragment, "decorative elements");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);



        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation) ;
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.page_1:
                        Intent intent = new Intent(DetailObjectActivity.this, FaqActivity.class);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                        break;

                    case R.id.page_3:
                        Intent intent2 = new Intent(DetailObjectActivity.this, MainActivity.class);
                        startActivity(intent2);
                        overridePendingTransition(0,0);
                        break;
                    case R.id.page_4:
                        Intent intent3 = new Intent(DetailObjectActivity.this, ResearchesActivity.class);
                        startActivity(intent3);
                        overridePendingTransition(0,0);
                        break;

                }

                return true;
            }
        });
    }
    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments = new ArrayList<>();
        private List<String> fragmentTitle = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void addFragment(Fragment fragment, String title) {
            fragments.add(fragment);
            fragmentTitle.add(title);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle.get(position);
        }
    }


}
