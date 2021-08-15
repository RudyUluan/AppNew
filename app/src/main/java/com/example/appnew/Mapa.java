package com.example.appnew;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class Mapa extends SupportMapFragment implements

        OnMapReadyCallback {


    private final LatLng cen1 = new LatLng(15.4033721,-90.4794852);
    private final LatLng cen2 = new LatLng(15.3798142,-90.9453777);
    private final LatLng cen3 = new LatLng(16.853807012280615, -90.22989281813284);
    private final LatLng cen4 = new LatLng(16.52950560517264, -89.58638031094334);
    private final LatLng cen5 = new LatLng(15.486925697136119, -91.42054489963303);
    private final LatLng cen6 = new LatLng(15.462850581004432, -89.08429260239812);
    private final LatLng cen7 = new LatLng(15.083592716995938, -91.69818177004493);


     Marker marker1;
     Marker marker2;
     Marker marker3;
    Marker marker4;
    Marker marker5;
    Marker marker6;
    Marker marker7;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = super.onCreateView(inflater, container, savedInstanceState);
        getMapAsync(this);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Mapa");

        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.ACCESS_FINE_LOCATION,}, 1000);

        } else {

        }
        return view;
    }

    @Override
    public void onMapReady(@NonNull GoogleMap map) {



        map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);


        LatLng mountainView = new LatLng(15.4033721, -90.4794852);

        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(mountainView )      // Sets the center of the map to Mountain View
                .zoom(7 )                   // Sets the zoom
                .bearing(0)                // Sets the orientation of the camera to east
                .tilt(30)                   // Sets the tilt of the camera to 30 degrees
                .build();                   // Creates a CameraPosition from the builder
        map.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        marker1 = map.addMarker(new MarkerOptions()
                .position(cen1)
                .title("Centro No.1")
            );

        marker1.setTag(10);

        marker2 = map.addMarker(new MarkerOptions()
                .position(cen2)
                .title("Centro No.2"));
        marker2.setTag(0);

        marker3 = map.addMarker(new MarkerOptions()
                .position(cen3)
                .title("Centro No.3"));
        marker3.setTag(0);

        marker4 = map.addMarker(new MarkerOptions()
                .position(cen4)
                .title("Centro No.4"));
        marker4.setTag(0);

        marker5 = map.addMarker(new MarkerOptions()
                .position(cen5)
                .title("Centro No.5"));
        marker5.setTag(0);

        marker6 = map.addMarker(new MarkerOptions()
                .position(cen6)
                .title("Centro No.6"));
        marker6.setTag(0);

        marker7 = map.addMarker(new MarkerOptions()
                .position(cen7)
                .title("Centro No.7"));
        marker7.setTag(0);




        map.getUiSettings().setZoomControlsEnabled(true);
        map.setBuildingsEnabled(true);//botones de mas y menos
        map.getUiSettings().setCompassEnabled(true);//brujila





    }


         }