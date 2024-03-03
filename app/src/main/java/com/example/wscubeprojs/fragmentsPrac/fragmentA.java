package com.example.wscubeprojs.fragmentsPrac;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wscubeprojs.R;

public class fragmentA extends Fragment {

    public fragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_a, container, false);
        TextView txt = view.findViewById(R.id.fregAtxt);
        return view;
    }
}