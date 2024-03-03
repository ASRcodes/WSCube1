package com.example.wscubeprojs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class lists extends AppCompatActivity {
ListView listView;
ArrayList<String> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = findViewById(R.id.listView);

        arrayList.add("Anubhav");
        arrayList.add("Raj");
        arrayList.add("Rajesh");
        arrayList.add("Vandana");
        arrayList.add("Tannu");
        arrayList.add("Anubhav");
        arrayList.add("Raj");
        arrayList.add("Rajesh");
        arrayList.add("Vandana");
        arrayList.add("Tannu");
        arrayList.add("Anubhav");
        arrayList.add("Raj");
        arrayList.add("Rajesh");
        arrayList.add("Vandana");
        arrayList.add("Tannu");
        arrayList.add("Anubhav");
        arrayList.add("Raj");
        arrayList.add("Rajesh");
        arrayList.add("Vandana");
        arrayList.add("Tannu");
        arrayList.add("Anubhav");
        arrayList.add("Raj");
        arrayList.add("Rajesh");
        arrayList.add("Vandana");
        arrayList.add("Tannu");


        ArrayAdapter<String > arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(lists.this, "Yo ho gya aaakhir kaar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}