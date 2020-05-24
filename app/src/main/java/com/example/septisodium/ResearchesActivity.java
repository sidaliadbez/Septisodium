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

public class ResearchesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_researches);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation) ;
/*        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);*/


    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {
                        case R.id.page_1:
                            Intent intent = new Intent(ResearchesActivity.this, FaqActivity.class);
                            startActivity(intent);
                            break;
                        case R.id.page_2:
                            Intent intent1 = new Intent(ResearchesActivity.this, StepbyStepActivity.class);
                            startActivity(intent1);
                            break;
                        case R.id.page_3:
                            Intent intent2 = new Intent(ResearchesActivity.this, MainActivity.class);
                            startActivity(intent2);
                            break;
                        case R.id.page_4:
                            Intent intent3 = new Intent(ResearchesActivity.this, ResearchesActivity.class);
                            startActivity(intent3);
                            break;

                    }

                    return true;
                }
            };
}
