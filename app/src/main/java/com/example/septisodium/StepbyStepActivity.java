package com.example.septisodium;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class StepbyStepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stepbystep);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation) ;
       Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

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
