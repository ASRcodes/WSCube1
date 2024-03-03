package com.example.wscubeprojs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.wscubeprojs.databinding.ActivityDrawerBinding;
import com.google.android.material.navigation.NavigationView;

public class nDrawer extends AppCompatActivity {
    ActivityDrawerBinding binding;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityDrawerBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationDrawer);
//        onbackpress();
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer,R.string.closeDrawer);
//   It will set that scrolling activity and those three horizontal lines
        drawerLayout.addDrawerListener(toggle);
//   It will manage the sync state that kab toggle open hai kab band hai.......
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id =item.getItemId();

                if (id==R.id.setting){
                    Toast.makeText(nDrawer.this, "This is setting fragment", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.game) {
                    Toast.makeText(nDrawer.this, "This is game fragment", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(nDrawer.this, "This is home fragment", Toast.LENGTH_SHORT).show();
                }
                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });

    }
    @Override
    public  void  onBackPressed(){
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

}