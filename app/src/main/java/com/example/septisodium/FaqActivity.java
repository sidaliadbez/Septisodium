package com.example.septisodium;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class FaqActivity extends AppCompatActivity {
private ArrayList<String> header = new ArrayList<>();
    private ArrayList<ArrayList<String>> body = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        ArrayList<String> contenu1 = new ArrayList<>();
        contenu1.add("quelque chose");
        ArrayList<String> contenu2 = new ArrayList<>();
        contenu2.add("quelque chose2");
header.add("Question1");
header.add("Question2");
body.add(contenu1);
body.add(contenu2);
        ExpandableListView expandableListView = findViewById(R.id.expandableListView);
        expandableListView.setAdapter(new ExpendableListAdapter(this,expandableListView,header,body));

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation) ;
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
        TextView textView = findViewById(R.id.text);
        textView.bringToFront();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.page_1:

                                break;
                            case R.id.page_3:
                                Intent intent2 = new Intent(FaqActivity.this, MainActivity.class);
                                startActivity(intent2);
                                overridePendingTransition(0,0);
                                break;
                            case R.id.page_4:
                                Intent intent3 = new Intent(FaqActivity.this, ResearchesActivity.class);
                                startActivity(intent3);
                                overridePendingTransition(0,0);
                                break;

                        }

                        return true;
                    }
                });
    }
}
