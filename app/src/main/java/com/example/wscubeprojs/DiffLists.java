package com.example.wscubeprojs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.wscubeprojs.databinding.ActivityDiffListsBinding;

public class DiffLists extends AppCompatActivity {
    ActivityDiffListsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDiffListsBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        Intent intent = new Intent(this, lists.class);
        Intent intentSp = new Intent(this,SpinnerAndAutocorr.class);
        binding.list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        binding.spinNauto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentSp);
            }
        });

    }
}