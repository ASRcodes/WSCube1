package com.example.wscubeprojs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class recycleAdd extends AppCompatActivity {
RecyclerView recyclerView;
EditText editname,editnumber;
recycleAddAdapter adapter;
Button add;
FloatingActionButton opendialog;
ArrayList<recycleAddStructure> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_add);
        recyclerView = findViewById(R.id.recycleAdd);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));
        arrayList.add(new recycleAddStructure(R.drawable.guess1,"Kriti","9898989012"));



        recycleAddAdapter adapter = new recycleAddAdapter(this,arrayList);
        recyclerView.setAdapter(adapter);

        opendialog = findViewById(R.id.opendialog);
        opendialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(recycleAdd.this);
                dialog.setContentView(R.layout.update);
                editname = dialog.findViewById(R.id.editName);
                editnumber = dialog.findViewById(R.id.editNumber);
                add = dialog.findViewById(R.id.Add);

                add.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name,number;

                        if(editname.getText().toString().equals("") &&  editnumber.getText().toString().equals("")){
                            Toast.makeText(recycleAdd.this, "Add details first", Toast.LENGTH_SHORT).show();
                        }

                        name = editname.getText().toString();
                        number = editnumber.getText().toString();

                        arrayList.add(new recycleAddStructure(name,number));
                        adapter.notifyItemInserted(arrayList.size()-1);
                        recyclerView.scrollToPosition(arrayList.size()-1);

                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

    }
}