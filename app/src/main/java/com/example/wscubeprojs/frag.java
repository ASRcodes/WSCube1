package com.example.wscubeprojs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.wscubeprojs.databinding.ActivityFragBinding;

public class frag extends AppCompatActivity {
ActivityFragBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityFragBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        Intent statc = new Intent(this, staticfrag.class);
        Intent dynamic = new Intent(this, dynamicfrag.class);

        binding.staticFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(statc);
            }
        });
        binding.dynamicFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(dynamic);
            }
        });

    }
}