package com.example.wscubeprojs.fragmentsPrac;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wscubeprojs.R;
import com.example.wscubeprojs.dynamicfrag;

public class dynamicfragA extends Fragment {
//    here we have created the so that we can use in any of the methods and have made it static so that we'll not be able to change it on run time.
    public static final String ARG1 = "Argument1";
    public static  final String ARG2 = "Argument2";
    public dynamicfragA() {
        // Required empty public constructor
    }
//    Now we'll create a method . With the help of which we'll pass arguments in Activity class.
    public static dynamicfragA getInstance(String value1,int value2){
        dynamicfragA dynamicfragA = new dynamicfragA();

        Bundle bundle = new Bundle();
//        Here in bundle through value1 & value2 we'll define the values in ActivityClass(dynamicfrag)..
        bundle.putString(ARG1,value1);
        bundle.putInt(ARG2,value2);

        dynamicfragA.setArguments(bundle);


        return  dynamicfragA;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        yahan you can get the arguments through keys.........
        if(getArguments()!= null){
//            Now we have created the methods here and also defined the Key so Copy paste karne ki requirement nhi hai......
            String name = getArguments().getString(ARG1);
            int roll = getArguments().getInt(ARG2);
            Log.d("Value for fragments","Name is : "+name + ",Roll is : "+roll);

//            We'll typeCaste this to tell the compiler  that we are demanding the mainActivity(dynamicfrag).........

            ((dynamicfrag)getActivity()).CallFromFragments();
        }


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dynamicfrag_a, container, false);
    }
}