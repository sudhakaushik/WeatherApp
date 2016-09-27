package com.example.sudhakaushik.forecastsearch;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.hamweather.aeris.communication.AerisEngine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MapActivity extends Activity {

    public Long item1;
    public Long item2;
    public ListView list1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        JSONObject reader = null;
        JSONObject item = null;
        Context context;

        Intent intentObject = getIntent();
        final String jsonResponse = (String) intentObject.getSerializableExtra("forecast_output");
        final String cityname = (String) intentObject.getSerializableExtra("cityname");
        final String state = (String) intentObject.getSerializableExtra("state");
        try {
            reader = new JSONObject(jsonResponse);
            item1 = reader.getLong("longitude");
            item2 = reader.getLong("latitude");
        }catch (JSONException e) {
            e.printStackTrace();
        }

        AerisEngine.initWithKeys(this.getString(R.string.aeris_client_id), this.getString(R.string.aeris_client_secret), this);

        //set Fragmentclass Arguments
        AriesMapFragment fragobj=AriesMapFragment.newInstance(null,null);

        Bundle args = new Bundle();
        args.putLong("item1", item1);
        args.putLong("item2", item2);
        fragobj.setArguments(args);

        Log.d("map", ""+item1);
        Log.d("map", ""+item2);


        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, fragobj);
        fragmentTransaction.commit();

    }
}
