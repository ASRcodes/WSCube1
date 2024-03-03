package com.example.wscubeprojs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.wscubeprojs.databinding.ActivityRecycleBinding;

public class Recycle extends AppCompatActivity {
ActivityRecycleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecycleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = new Intent(this,recyclerView.class);
        Intent intent2 = new Intent(this, recycleAdd.class);


        binding.Normal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(intent);
        }
    });
    binding.addDetail.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(intent2);
        }
    });
    }
}