package com.example.wscubeprojs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.wscubeprojs.FragmentsBottomView.addFragment;
import com.example.wscubeprojs.FragmentsBottomView.homeFragment;
import com.example.wscubeprojs.FragmentsBottomView.messageFragment;
import com.example.wscubeprojs.FragmentsBottomView.searchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class practiceBottom extends AppCompatActivity {
BottomNavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_bottom);
       nav = findViewById(R.id.bottomnav);

       nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               int id = item.getItemId();

               if (id==R.id.home){
                   loadFrag(new homeFragment(),false);
               } else if (id==R.id.search) {
                   loadFrag(new searchFragment(),false);
               } else if (id==R.id.addd) {
                   loadFrag(new addFragment(),false);
               }
               else {
                   loadFrag(new messageFragment(),false);
               }
               return true;
           }
       });
        nav.setSelectedItemId(R.id.message);
    }
    public void loadFrag(Fragment fragment,boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
//        ft.addToBackStack(null);
        if (flag){
            ft.add(R.id.fragContainer,fragment);
        }
        else {
            ft.replace(R.id.fragContainer,fragment);
        }
        ft.commit();
    }
}
