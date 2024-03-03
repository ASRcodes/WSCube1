package com.example.wscubeprojs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.sax.RootElement;
import android.util.Log;
import android.view.View;

import com.example.wscubeprojs.databinding.ActivityDynamicfragBinding;
import com.example.wscubeprojs.fragmentsPrac.dynamicfragA;
import com.example.wscubeprojs.fragmentsPrac.dynamicfragB;
import com.example.wscubeprojs.fragmentsPrac.dynamicfragC;

public class dynamicfrag extends AppCompatActivity {
    private static final String ROOT_FRAGMENT_TAG = null;
    ActivityDynamicfragBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityDynamicfragBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        loadFragment(new dynamicfragA(),0);
        binding.a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Now humlogo ne Method bana liya hai so ab dynamicfragA aise call nhi hoga humlog  yahan iske saath method bhi call karenge And we'll pass the values also here.
//               ONE MORE THING THIS WILL BE ONLY CALLED FOR FRAG-A .....
                loadFragment(dynamicfragA.getInstance("Anubhav Singh",10),0);
            }
        });
        binding.b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new dynamicfragB(),1);
            }
        });
        binding.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            loadFragment(new dynamicfragC(),1);
            }
        });
    }
    //        we have to call the fragments for more then one time so we'll simply create Method here..........
    public void loadFragment(Fragment fragment,int flag){
//        Here we'll learn how we can pass bundles in fragments

//      WE ARE COMMENTING IT HERE BECAUSE WE HAVE MADE A GETINSTACE METHOD IN DYNAMICFRAGA CLASSS AND USING THAT

//        Bundle bundle = new Bundle();
////        This bundle method is called in loadfragment matlab ye saare fragments ke liye set ho jayega agar alag alag kaarna hai to
////        We can use if statement that frag1 ka 0, frag2 ka 1 , etc.....
//        bundle.putString("anu","Hii");
//        bundle.putInt("Singh",12);
//        fragment.setArguments(bundle);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag==0) {
            ft.add(R.id.fragments, fragment);
//            For doing that we'll add few lines of code here
//            take this ROOT_FRAGMENT_TAG  = null..... and define it over OnCreate
            fm.popBackStack(ROOT_FRAGMENT_TAG,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            
//            This code will ensure that root element ke baad koi stack manage nhi hoga seedha bahar......
            ft.addToBackStack(ROOT_FRAGMENT_TAG);
        }
        else {
            ft.replace(R.id.fragments, fragment);
//            And this code will manage backstack for the rest no-root elements....
            ft.addToBackStack(null);
        }

// We'll add this code to manage our fragments in backstack but here, There is one problem that ye agar humlog fragA se fragB jayenge then fragA se fragC jayenge sbka backstack bann jaayega
//        hona ye chahiye ki jab home frag main aaye to wahan se seedha back for that will do modification.......
//        ft.addToBackStack(null);
        ft.commit();


    }

//    Now we'll see that how we can access the methods of activity class in fragments

    public void CallFromFragments(){
        Log.d("Yoyo","Hi bhai Radhe Radhe");
    }
}