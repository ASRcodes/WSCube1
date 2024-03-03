package com.example.wscubeprojs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.wscubeprojs.adapterForTab.ViewPagerMessageAdapter;
import com.google.android.material.tabs.TabLayout;

public class tabpractice extends AppCompatActivity {
TabLayout tab;
ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_practice);

        tab = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewPager);

        ViewPagerMessageAdapter adapter = new ViewPagerMessageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

//        now to sincronize both ....
        tab.setupWithViewPager(viewPager);


    }
}