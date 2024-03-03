package com.example.wscubeprojs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.wscubeprojs.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intentbmi = new Intent(this,BmiCalculator.class);
        Intent intentlists = new Intent(this,DiffLists.class);
        Intent intentRecycler = new Intent(this,Recycle.class);
        Intent implicit = new Intent(this,implicitIntent.class);
        Intent fragments = new Intent(this,frag.class);
        Intent tablayout = new Intent(this,tabpractice.class);
        Intent bottomNav = new Intent(this,practiceBottom.class);
        Intent drawerNva = new Intent(this,nDrawer.class);
        Intent mapActive = new Intent(this,MapPractice.class);
        Intent tictac = new Intent(this, TicTacToe.class);

        binding.bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentbmi);
            }
        });
        binding.lists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(intentlists);
            }
        });
        binding.recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentRecycler);
            }
        });
        binding.implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(implicit);
            }
        });
        binding.frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(fragments);
            }
        });
        binding.tablayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(tablayout);
            }
        });
        binding.bottomnav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(bottomNav);
            }
        });
        binding.drawerNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(drawerNva);
            }
        });
        binding.mapActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mapActive);
            }
        });
        binding.ttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(tictac);
            }
        });
















    }
}