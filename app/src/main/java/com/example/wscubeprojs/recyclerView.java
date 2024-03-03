package com.example.wscubeprojs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class recyclerView extends AppCompatActivity {
    RecyclerView recyclerView;
ArrayList<structurerecycle> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        structurerecycle model = new structurerecycle(R.drawable.ic_launcher_foreground,"Anubhav","9162758437");
        arrayList.add(new structurerecycle(R.drawable.asr1,"Spider man","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.asr2,"Joker","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.guess,"Riya","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.guess2,"Shubh","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.uuuu,"?????","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.mommy1,"Mommy","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.anubhav,"Anubhav","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.asr1,"Spider man","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.asr2,"Joker","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.guess,"Riya","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.guess2,"Shubh","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.uuuu,"?????","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.mommy1,"Mommy","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.anubhav,"Anubhav","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.anubhav,"Anubhav","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.asr1,"Spider man","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.asr2,"Joker","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.guess,"Riya","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.guess2,"Shubh","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.uuuu,"?????","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.mommy1,"Mommy","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.anubhav,"Anubhav","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.asr1,"Spider man","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.asr2,"Joker","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.guess,"Riya","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.guess2,"Shubh","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.uuuu,"?????","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.mommy1,"Mommy","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.anubhav,"Anubhav","9898989012"));
        arrayList.add(new structurerecycle(R.drawable.asr1,"Spider man","9898989012"));




        recyclerAdapter recyclerAdapter = new recyclerAdapter(this,arrayList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}