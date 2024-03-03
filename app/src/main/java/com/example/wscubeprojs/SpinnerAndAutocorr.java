package com.example.wscubeprojs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class SpinnerAndAutocorr extends AppCompatActivity {
    Spinner spinner;
    AutoCompleteTextView autoCompleteTextView;
    ArrayList<String > arrayList = new ArrayList<>();
    ArrayList<String > arrayList2 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_and_autocorr);
        spinner = findViewById(R.id.spinner);
        autoCompleteTextView = findViewById(R.id.autoCorrect);


        arrayList.add("Yoyo");
        arrayList.add("uu");
        arrayList.add("ppop");
        arrayList.add("iouo");
        arrayList.add("uiytrt");
        arrayList.add("ranchi");


        arrayList2.add("Ranchi");
        arrayList2.add("dhanbad");
        arrayList2.add("Delhi");
        arrayList2.add("Sri nagar");

        ArrayAdapter<String > arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,arrayList);
        spinner.setAdapter(arrayAdapter);

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayList2);
        autoCompleteTextView.setAdapter(arrayAdapter1);
        autoCompleteTextView.setThreshold(2);
    }
}