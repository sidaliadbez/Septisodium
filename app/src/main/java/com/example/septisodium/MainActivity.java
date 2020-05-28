package com.example.septisodium;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation) ;
       // bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
    Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
        TextView textView = findViewById(R.id.textseptiso);
        textView.bringToFront();
        View card = findViewById(R.id.cardView);
        card.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResearchesActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });

        View card2 = findViewById(R.id.cardView2);
        card2.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StepbyStepActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });

        View card3 = findViewById(R.id.cardView3);
        card3.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FaqActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.page_1:

                                Intent intent = new Intent(MainActivity.this, FaqActivity.class);
                                startActivity(intent);
                                overridePendingTransition(0,0);
                                break;
                            case R.id.page_2:

                                Intent intent1 = new Intent(MainActivity.this, StepbyStepActivity.class);
                                startActivity(intent1);
                                overridePendingTransition(0,0);
                                break;
                            case R.id.page_3:

                                break;
                            case R.id.page_4:

                                Intent intent3 = new Intent(MainActivity.this, ResearchesActivity.class);
                                startActivity(intent3);
                                overridePendingTransition(0,0);
                                break;

                        }

                        return true;
                    }

                });

    }


}
