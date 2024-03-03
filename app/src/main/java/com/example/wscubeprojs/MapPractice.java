package com.example.wscubeprojs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.wscubeprojs.databinding.ActivityMapPracticeBinding;

public class MapPractice extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SupportMapFragment mapFragment =(SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapfrag);

//        mapFragment.getMapAsync(this::onMapReady);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        } else {
            // Handle the case where the fragment is not found
            // Log an error or show a message
            Log.e("MapPractice", "Error: Map fragment not found in the layout.");
        }
    }


    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        LatLng latLng = new LatLng(26.2389,73.0243);

        MarkerOptions markerOptions = new MarkerOptions().position(latLng).title("Jodhpur");

        mMap.addMarker(markerOptions);

        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,16f));
    }
}