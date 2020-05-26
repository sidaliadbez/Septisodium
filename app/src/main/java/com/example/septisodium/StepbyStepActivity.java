package com.example.septisodium;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class StepbyStepActivity extends AppCompatActivity {
    Boolean exp =false ;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stepbystep);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation) ;
       Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);
        LinearLayout linearLayout ;
        final RelativeLayout expandableLayout ;
        linearLayout= findViewById(R.id.linear_layout);
        expandableLayout= findViewById(R.id.expandable_layout);
        expandableLayout.setVisibility(View.GONE);


        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!exp){
                    exp=true ;
                    expandableLayout.setVisibility(View.VISIBLE);
                }else {
                    exp=false ;
                    expandableLayout.setVisibility(View.GONE);
                }
            }
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.page_1:
                                Intent intent = new Intent(StepbyStepActivity.this, FaqActivity.class);
                                startActivity(intent);
                                overridePendingTransition(0,0);
                                break;
                            case R.id.page_2:
                                break;
                            case R.id.page_3:
                                Intent intent2 = new Intent(StepbyStepActivity.this, MainActivity.class);
                                startActivity(intent2);
                                overridePendingTransition(0,0);
                                break;
                            case R.id.page_4:
                                Intent intent3 = new Intent(StepbyStepActivity.this, ResearchesActivity.class);
                                startActivity(intent3);
                                overridePendingTransition(0,0);
                                break;

                        }

                        return true;
                    }
                });
    }
}
