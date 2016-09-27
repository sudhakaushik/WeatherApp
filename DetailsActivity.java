package com.example.sudhakaushik.forecastsearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TableRow;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class DetailsActivity extends AppCompatActivity {

    TextView top;
    TextView ctemp;

    TextView val11;
    ImageView val12;
    TextView val13;
    TextView val21;
    ImageView val22;
    TextView val23;
    TextView val31;
    ImageView val32;
    TextView val33;
    TextView val41;
    ImageView val42;
    TextView val43;
    TextView val51;
    ImageView val52;
    TextView val53;
    TextView val61;
    ImageView val62;
    TextView val63;
    TextView val71;
    ImageView val72;
    TextView val73;
    TextView val81;
    ImageView val82;
    TextView val83;
    TextView val91;
    ImageView val92;
    TextView val93;
    TextView val101;
    ImageView val102;
    TextView val103;

    TextView val111;
    ImageView val112;
    TextView val113;
    TextView val121;
    ImageView val122;
    TextView val123;
    TextView val131;
    ImageView val132;
    TextView val133;
    TextView val141;
    ImageView val142;
    TextView val143;
    TextView val151;
    ImageView val152;
    TextView val153;
    TextView val161;
    ImageView val162;
    TextView val163;
    TextView val171;
    ImageView val172;
    TextView val173;
    TextView val181;
    ImageView val182;
    TextView val183;
    TextView val191;
    ImageView val192;
    TextView val193;
    TextView val201;
    ImageView val202;
    TextView val203;

    TextView val211;
    ImageView val212;
    TextView val213;
    TextView val221;
    ImageView val222;
    TextView val223;
    TextView val231;
    ImageView val232;
    TextView val233;
    TextView val241;
    ImageView val242;
    TextView val243;


    TextView val911;
    ImageView val912;
    TextView val913;
    TextView val921;
    ImageView val922;
    TextView val923;
    TextView val931;
    ImageView val932;
    TextView val933;
    TextView val941;
    ImageView val942;
    TextView val943;
    TextView val951;
    ImageView val952;
    TextView val953;
    TextView val961;
    ImageView val962;
    TextView val963;
    TextView val971;
    ImageView val972;
    TextView val973;
    TextView val981;
    ImageView val982;
    TextView val983;
    TextView val991;
    ImageView val992;
    TextView val993;
    TextView val9101;
    ImageView val9102;
    TextView val9103;

    TextView val9111;
    ImageView val9112;
    TextView val9113;
    TextView val9121;
    ImageView val9122;
    TextView val9123;
    TextView val9131;
    ImageView val9132;
    TextView val9133;
    TextView val9141;
    ImageView val9142;
    TextView val9143;
    TextView val9151;
    ImageView val9152;
    TextView val9153;
    TextView val9161;
    ImageView val9162;
    TextView val9163;
    TextView val9171;
    ImageView val9172;
    TextView val9173;
    TextView val9181;
    ImageView val9182;
    TextView val9183;
    TextView val9191;
    ImageView val9192;
    TextView val9193;
    TextView val9201;
    ImageView val9202;
    TextView val9203;

    TextView val9211;
    ImageView val9212;
    TextView val9213;
    TextView val9221;
    ImageView val9222;
    TextView val9223;
    TextView val9231;
    ImageView val9232;
    TextView val9233;
    TextView val9241;
    ImageView val9242;
    TextView val9243;

    TextView grid11;
    TextView grid12;
    ImageView grid13;
    TextView grid21;
    TextView grid22;
    ImageView grid23;
    TextView grid31;
    TextView grid32;
    ImageView grid33;
    TextView grid41;
    TextView grid42;
    ImageView grid43;
    TextView grid51;
    TextView grid52;
    ImageView grid53;
    TextView grid61;
    TextView grid62;
    ImageView grid63;
    TextView grid71;
    TextView grid72;
    ImageView grid73;


    public JSONObject item1;
    public JSONArray item2;
    public ListView list1;
    static String jsonResponse1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        top = (TextView) findViewById(R.id.textView12);
        ctemp = (TextView) findViewById(R.id.title3);

        val11 = (TextView) findViewById(R.id.val11);
        val12 = (ImageView) findViewById(R.id.val12);
        val13 = (TextView) findViewById(R.id.val13);
        val21 = (TextView) findViewById(R.id.val21);
        val22 = (ImageView) findViewById(R.id.val22);
        val23 = (TextView) findViewById(R.id.val23);
        val31 = (TextView) findViewById(R.id.val31);
        val32 = (ImageView) findViewById(R.id.val32);
        val33 = (TextView) findViewById(R.id.val33);
        val41 = (TextView) findViewById(R.id.val41);
        val42 = (ImageView) findViewById(R.id.val42);
        val43 = (TextView) findViewById(R.id.val43);
        val51 = (TextView) findViewById(R.id.val51);
        val52 = (ImageView) findViewById(R.id.val52);
        val53 = (TextView) findViewById(R.id.val53);
        val61 = (TextView) findViewById(R.id.val61);
        val62 = (ImageView) findViewById(R.id.val62);
        val63 = (TextView) findViewById(R.id.val63);
        val71 = (TextView) findViewById(R.id.val71);
        val72 = (ImageView) findViewById(R.id.val72);
        val73 = (TextView) findViewById(R.id.val73);
        val81 = (TextView) findViewById(R.id.val81);
        val82 = (ImageView) findViewById(R.id.val82);
        val83 = (TextView) findViewById(R.id.val83);
        val91 = (TextView) findViewById(R.id.val91);
        val92 = (ImageView) findViewById(R.id.val92);
        val93 = (TextView) findViewById(R.id.val93);
        val101 = (TextView) findViewById(R.id.val101);
        val102 = (ImageView) findViewById(R.id.val102);
        val103 = (TextView) findViewById(R.id.val103);
        val111 = (TextView) findViewById(R.id.val111);
        val112 = (ImageView) findViewById(R.id.val112);
        val113 = (TextView) findViewById(R.id.val113);
        val121 = (TextView) findViewById(R.id.val121);
        val122 = (ImageView) findViewById(R.id.val122);
        val123 = (TextView) findViewById(R.id.val123);
        val131 = (TextView) findViewById(R.id.val131);
        val132 = (ImageView) findViewById(R.id.val132);
        val133 = (TextView) findViewById(R.id.val133);
        val141 = (TextView) findViewById(R.id.val141);
        val142 = (ImageView) findViewById(R.id.val142);
        val143 = (TextView) findViewById(R.id.val143);
        val151 = (TextView) findViewById(R.id.val151);
        val152 = (ImageView) findViewById(R.id.val152);
        val153 = (TextView) findViewById(R.id.val153);
        val161 = (TextView) findViewById(R.id.val161);
        val162 = (ImageView) findViewById(R.id.val162);
        val163 = (TextView) findViewById(R.id.val163);
        val171 = (TextView) findViewById(R.id.val171);
        val172 = (ImageView) findViewById(R.id.val172);
        val173 = (TextView) findViewById(R.id.val173);
        val181 = (TextView) findViewById(R.id.val181);
        val182 = (ImageView) findViewById(R.id.val182);
        val183 = (TextView) findViewById(R.id.val183);
        val191 = (TextView) findViewById(R.id.val191);
        val192 = (ImageView) findViewById(R.id.val192);
        val193 = (TextView) findViewById(R.id.val193);
        val201 = (TextView) findViewById(R.id.val201);
        val202 = (ImageView) findViewById(R.id.val202);
        val203 = (TextView) findViewById(R.id.val203);
        val211 = (TextView) findViewById(R.id.val211);
        val212 = (ImageView) findViewById(R.id.val212);
        val213 = (TextView) findViewById(R.id.val213);
        val221 = (TextView) findViewById(R.id.val221);
        val222 = (ImageView) findViewById(R.id.val222);
        val223 = (TextView) findViewById(R.id.val223);
        val231 = (TextView) findViewById(R.id.val231);
        val232 = (ImageView) findViewById(R.id.val232);
        val233 = (TextView) findViewById(R.id.val233);
        val241 = (TextView) findViewById(R.id.val241);
        val242 = (ImageView) findViewById(R.id.val242);
        val243 = (TextView) findViewById(R.id.val243);


        val911 = (TextView) findViewById(R.id.val911);
        val912 = (ImageView) findViewById(R.id.val912);
        val913 = (TextView) findViewById(R.id.val913);
        val921 = (TextView) findViewById(R.id.val921);
        val922 = (ImageView) findViewById(R.id.val922);
        val923 = (TextView) findViewById(R.id.val923);
        val931 = (TextView) findViewById(R.id.val931);
        val932 = (ImageView) findViewById(R.id.val932);
        val933 = (TextView) findViewById(R.id.val933);
        val941 = (TextView) findViewById(R.id.val941);
        val942 = (ImageView) findViewById(R.id.val942);
        val943 = (TextView) findViewById(R.id.val943);
        val951 = (TextView) findViewById(R.id.val951);
        val952 = (ImageView) findViewById(R.id.val952);
        val953 = (TextView) findViewById(R.id.val953);
        val961 = (TextView) findViewById(R.id.val961);
        val962 = (ImageView) findViewById(R.id.val962);
        val963 = (TextView) findViewById(R.id.val963);
        val971 = (TextView) findViewById(R.id.val971);
        val972 = (ImageView) findViewById(R.id.val972);
        val973 = (TextView) findViewById(R.id.val973);
        val981 = (TextView) findViewById(R.id.val981);
        val982 = (ImageView) findViewById(R.id.val982);
        val983 = (TextView) findViewById(R.id.val983);
        val991 = (TextView) findViewById(R.id.val991);
        val992 = (ImageView) findViewById(R.id.val992);
        val993 = (TextView) findViewById(R.id.val993);
        val9101 = (TextView) findViewById(R.id.val9101);
        val9102 = (ImageView) findViewById(R.id.val9102);
        val9103 = (TextView) findViewById(R.id.val9103);
        val9111 = (TextView) findViewById(R.id.val9111);
        val9112 = (ImageView) findViewById(R.id.val9112);
        val9113 = (TextView) findViewById(R.id.val9113);
        val9121 = (TextView) findViewById(R.id.val9121);
        val9122 = (ImageView) findViewById(R.id.val9122);
        val9123 = (TextView) findViewById(R.id.val9123);
        val9131 = (TextView) findViewById(R.id.val9131);
        val9132 = (ImageView) findViewById(R.id.val9132);
        val9133 = (TextView) findViewById(R.id.val9133);
        val9141 = (TextView) findViewById(R.id.val9141);
        val9142 = (ImageView) findViewById(R.id.val9142);
        val9143 = (TextView) findViewById(R.id.val9143);
        val9151 = (TextView) findViewById(R.id.val9151);
        val9152 = (ImageView) findViewById(R.id.val9152);
        val9153 = (TextView) findViewById(R.id.val9153);
        val9161 = (TextView) findViewById(R.id.val9161);
        val9162 = (ImageView) findViewById(R.id.val9162);
        val9163 = (TextView) findViewById(R.id.val9163);
        val9171 = (TextView) findViewById(R.id.val9171);
        val9172 = (ImageView) findViewById(R.id.val9172);
        val9173 = (TextView) findViewById(R.id.val9173);
        val9181 = (TextView) findViewById(R.id.val9181);
        val9182 = (ImageView) findViewById(R.id.val9182);
        val9183 = (TextView) findViewById(R.id.val9183);
        val9191 = (TextView) findViewById(R.id.val9191);
        val9192 = (ImageView) findViewById(R.id.val9192);
        val9193 = (TextView) findViewById(R.id.val9193);
        val9201 = (TextView) findViewById(R.id.val9201);
        val9202 = (ImageView) findViewById(R.id.val9202);
        val9203 = (TextView) findViewById(R.id.val9203);
        val9211 = (TextView) findViewById(R.id.val9211);
        val9212 = (ImageView) findViewById(R.id.val9212);
        val9213 = (TextView) findViewById(R.id.val9213);
        val9221 = (TextView) findViewById(R.id.val9221);
        val9222 = (ImageView) findViewById(R.id.val9222);
        val9223 = (TextView) findViewById(R.id.val9223);
        val9231 = (TextView) findViewById(R.id.val9231);
        val9232 = (ImageView) findViewById(R.id.val9232);
        val9233 = (TextView) findViewById(R.id.val9233);
        val9241 = (TextView) findViewById(R.id.val9241);
        val9242 = (ImageView) findViewById(R.id.val9242);
        val9243 = (TextView) findViewById(R.id.val9243);


        grid11 = (TextView) findViewById(R.id.grid11);
        grid12 = (TextView) findViewById(R.id.grid12);
        grid13 = (ImageView) findViewById(R.id.grid13);
        grid21 = (TextView) findViewById(R.id.grid21);
        grid22 = (TextView) findViewById(R.id.grid22);
        grid23 = (ImageView) findViewById(R.id.grid23);
        grid31 = (TextView) findViewById(R.id.grid31);
        grid32 = (TextView) findViewById(R.id.grid32);
        grid33 = (ImageView) findViewById(R.id.grid33);
        grid41 = (TextView) findViewById(R.id.grid41);
        grid42 = (TextView) findViewById(R.id.grid42);
        grid43 = (ImageView) findViewById(R.id.grid43);
        grid51 = (TextView) findViewById(R.id.grid51);
        grid52 = (TextView) findViewById(R.id.grid52);
        grid53 = (ImageView) findViewById(R.id.grid53);
        grid61 = (TextView) findViewById(R.id.grid61);
        grid62 = (TextView) findViewById(R.id.grid62);
        grid63 = (ImageView) findViewById(R.id.grid63);
        grid71 = (TextView) findViewById(R.id.grid71);
        grid72 = (TextView) findViewById(R.id.grid72);
        grid73 = (ImageView) findViewById(R.id.grid73);


        //    // Toast(getApplicationContext(),"in details", Toast.LENGTH_LONG).show();
        Log.d("three", "in details");


        setTitle("DetailsActivity");

        JSONObject reader = null;
        JSONObject item = null;
        JSONArray item2 = null;
        String item1 = null;
        Context context;

        Intent intentObject = getIntent();
        final String jsonResponse = (String) intentObject.getSerializableExtra("forecast_output");
        String cityname = (String) intentObject.getSerializableExtra("cityname");
        String state = (String) intentObject.getSerializableExtra("state");
        String degree = (String) intentObject.getSerializableExtra("degree");


        Log.d("three", "" + cityname + state + degree);
        Log.d("three", jsonResponse);

        //  // Toast(getApplicationContext(),""+cityname+state+degree, Toast.LENGTH_LONG).show();
        //    // Toast(getApplicationContext(),jsonResponse, Toast.LENGTH_LONG).show();


        try {

            top.setText("More Details for " + cityname + ", " + state);
            if (degree.matches("si")) {
                ctemp.setText("Temp(°C)");
            }
            Log.d("three", "in try");
            reader = new JSONObject(jsonResponse);
            Log.d("three", "parsing json");


            item = reader.getJSONObject("hourly");
            item2 = item.getJSONArray("data");

            Log.d("three", item2.toString());

            JSONObject oneObject = item2.getJSONObject(0);

            Long time1 = oneObject.getLong("time");

            java.util.Date time2 = new java.util.Date(time1 * 1000);
            //      // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            String timezone = reader.getString("timezone");

            //     // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                //        // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                //        // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val11.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            String item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val12.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val12.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val12.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val12.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val12.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val12.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val12.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val12.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val12.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val12.setImageResource(R.drawable.cloud_night);
            }

            Integer item4 = oneObject.getInt("temperature");
            val13.setText("" + item4);


            oneObject = item2.getJSONObject(1);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            //    // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            //     // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                //        // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                //        // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val21.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val22.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val22.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val22.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val22.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val22.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val22.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val22.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val22.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val22.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val22.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val23.setText("" + item4);


            oneObject = item2.getJSONObject(2);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            //      // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            //      // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                //          // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                //         // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val31.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val32.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val32.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val32.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val32.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val32.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val32.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val32.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val32.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val32.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val32.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val33.setText("" + item4);


            oneObject = item2.getJSONObject(3);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            //     // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            //// Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                //// Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                //// Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      //// Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val41.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val42.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val42.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val42.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val42.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val42.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val42.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val42.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val42.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val42.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val42.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val43.setText("" + item4);


            oneObject = item2.getJSONObject(4);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            //// Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            //// Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                //// Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                //// Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val51.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val52.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val52.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val52.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val52.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val52.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val52.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val52.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val52.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val52.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val52.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val53.setText("" + item4);


            oneObject = item2.getJSONObject(5);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            //// Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            //// Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                //// Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                //// Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      //// Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val61.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val62.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val62.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val62.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val62.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val62.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val62.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val62.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val62.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val62.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val62.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val63.setText("" + item4);


            oneObject = item2.getJSONObject(6);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            //// Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            //// Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                //// Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                //// Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val71.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val72.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val72.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val72.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val72.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val72.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val72.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val72.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val72.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val72.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val72.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val73.setText("" + item4);


            oneObject = item2.getJSONObject(7);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            //// Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            //// Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                //// Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                //// Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val81.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val82.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val82.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val82.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val82.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val82.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val82.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val82.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val82.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val82.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val82.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val83.setText("" + item4);


            oneObject = item2.getJSONObject(8);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            //// Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //       Toast.makeText(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val91.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val92.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val92.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val92.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val92.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val92.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val92.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val92.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val92.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val92.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val92.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val93.setText("" + item4);


            oneObject = item2.getJSONObject(9);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val101.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val102.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val102.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val102.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val102.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val102.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val102.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val102.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val102.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val102.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val102.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val103.setText("" + item4);


            oneObject = item2.getJSONObject(10);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val111.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val112.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val112.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val112.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val112.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val112.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val112.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val112.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val112.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val112.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val112.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val113.setText("" + item4);


            oneObject = item2.getJSONObject(11);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val121.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val122.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val122.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val122.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val122.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val122.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val122.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val122.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val122.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val122.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val122.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val123.setText("" + item4);


            oneObject = item2.getJSONObject(12);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val131.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val132.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val132.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val132.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val132.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val132.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val132.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val132.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val132.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val132.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val132.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val133.setText("" + item4);


            oneObject = item2.getJSONObject(13);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val141.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val142.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val142.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val142.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val142.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val142.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val142.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val142.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val142.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val142.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val142.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val143.setText("" + item4);


            oneObject = item2.getJSONObject(14);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val151.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val152.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val152.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val152.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val152.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val152.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val152.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val152.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val152.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val152.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val152.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val153.setText("" + item4);


            oneObject = item2.getJSONObject(15);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val161.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val162.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val162.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val162.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val162.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val162.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val162.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val162.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val162.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val162.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val162.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val163.setText("" + item4);


            oneObject = item2.getJSONObject(16);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val171.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val172.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val172.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val172.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val172.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val172.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val172.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val172.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val172.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val172.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val172.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val173.setText("" + item4);


            oneObject = item2.getJSONObject(17);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val181.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val182.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val182.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val182.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val182.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val182.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val182.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val182.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val182.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val182.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val182.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val183.setText("" + item4);


            oneObject = item2.getJSONObject(18);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val191.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val192.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val192.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val192.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val192.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val192.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val192.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val192.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val192.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val192.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val192.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val193.setText("" + item4);


            oneObject = item2.getJSONObject(19);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val201.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val202.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val202.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val202.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val202.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val202.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val202.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val202.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val202.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val202.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val202.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val203.setText("" + item4);


            oneObject = item2.getJSONObject(20);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val211.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val212.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val212.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val212.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val212.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val212.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val212.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val212.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val212.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val212.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val212.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val213.setText("" + item4);


            oneObject = item2.getJSONObject(21);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val221.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val222.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val222.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val222.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val222.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val222.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val222.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val222.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val222.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val222.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val222.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val223.setText("" + item4);


            oneObject = item2.getJSONObject(22);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val231.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val232.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val232.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val232.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val232.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val232.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val232.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val232.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val232.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val232.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val232.setImageResource(R.drawable.cloud_night);
            }


            item4 = oneObject.getInt("temperature");
            val233.setText("" + item4);

            //          item4= oneObject.getInt("temperature");
            //          val233.setText(""+item4);


            oneObject = item2.getJSONObject(23);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val241.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val242.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val242.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val242.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val242.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val242.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val242.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val242.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val242.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val242.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val242.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val243.setText("" + item4);


            //for next 24 hours


            oneObject = item2.getJSONObject(24);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val911.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val912.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val912.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val912.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val912.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val912.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val912.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val912.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val912.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val912.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val912.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val913.setText("" + item4);


            oneObject = item2.getJSONObject(25);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val921.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val922.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val922.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val922.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val922.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val922.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val922.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val922.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val922.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val922.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val922.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val923.setText("" + item4);


            oneObject = item2.getJSONObject(26);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val931.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val932.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val932.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val932.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val932.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val932.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val932.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val932.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val932.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val932.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val932.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val933.setText("" + item4);


            oneObject = item2.getJSONObject(27);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val941.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val942.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val942.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val942.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val942.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val942.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val942.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val942.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val942.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val942.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val942.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val943.setText("" + item4);


            oneObject = item2.getJSONObject(28);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val951.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val952.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val952.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val952.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val952.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val952.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val952.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val952.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val952.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val952.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val952.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val953.setText("" + item4);


            oneObject = item2.getJSONObject(29);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val961.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val962.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val962.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val962.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val962.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val962.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val962.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val962.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val962.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val962.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val962.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val963.setText("" + item4);


            oneObject = item2.getJSONObject(30);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val971.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val972.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val972.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val972.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val972.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val972.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val972.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val972.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val972.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val972.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val972.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val973.setText("" + item4);


            oneObject = item2.getJSONObject(31);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val981.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val982.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val982.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val982.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val982.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val982.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val982.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val982.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val982.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val982.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val982.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val983.setText("" + item4);


            oneObject = item2.getJSONObject(32);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val991.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val992.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val992.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val992.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val992.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val992.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val992.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val992.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val992.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val992.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val992.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val993.setText("" + item4);


            oneObject = item2.getJSONObject(33);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9101.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9102.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9102.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9102.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9102.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9102.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9102.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9102.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9102.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9102.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9102.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9103.setText("" + item4);


            oneObject = item2.getJSONObject(34);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9111.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9112.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9112.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9112.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9112.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9112.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9112.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9112.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9112.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9112.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9112.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9113.setText("" + item4);


            oneObject = item2.getJSONObject(35);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9121.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9122.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9122.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9122.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9122.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9122.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9122.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9122.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9122.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9122.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9122.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9123.setText("" + item4);


            oneObject = item2.getJSONObject(36);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9131.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9132.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9132.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9132.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9132.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9132.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9132.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9132.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9132.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9132.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9132.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9133.setText("" + item4);


            oneObject = item2.getJSONObject(37);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9141.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9142.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9142.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9142.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9142.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9142.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9142.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9142.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9142.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9142.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9142.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9143.setText("" + item4);


            oneObject = item2.getJSONObject(38);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9151.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9152.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9152.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9152.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9152.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9152.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9152.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9152.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9152.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9152.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9152.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9153.setText("" + item4);


            oneObject = item2.getJSONObject(39);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9161.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9162.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9162.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9162.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9162.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9162.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9162.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9162.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9162.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9162.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9162.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9163.setText("" + item4);


            oneObject = item2.getJSONObject(40);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9171.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9172.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9172.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9172.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9172.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9172.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9172.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9172.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9172.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9172.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9172.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9173.setText("" + item4);


            oneObject = item2.getJSONObject(41);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9181.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9182.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9182.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9182.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9182.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9182.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9182.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9182.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9182.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9182.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9182.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9183.setText("" + item4);


            oneObject = item2.getJSONObject(42);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9191.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9192.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9192.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9192.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9192.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9192.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9192.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9192.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9192.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9192.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9192.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9193.setText("" + item4);


            oneObject = item2.getJSONObject(43);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9201.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9202.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9202.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9202.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9202.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9202.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9202.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9202.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9202.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9202.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9202.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9203.setText("" + item4);


            oneObject = item2.getJSONObject(44);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9211.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9212.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9212.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9212.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9212.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9212.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9212.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9212.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9212.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9212.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9212.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9213.setText("" + item4);


            oneObject = item2.getJSONObject(45);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9221.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9222.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9222.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9222.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9222.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9222.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9222.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9222.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9222.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9222.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9222.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9223.setText("" + item4);


            oneObject = item2.getJSONObject(46);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9231.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9232.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9232.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9232.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9232.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9232.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9232.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9232.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9232.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9232.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9232.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9233.setText("" + item4);


            oneObject = item2.getJSONObject(47);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                val9241.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                val9242.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                val9242.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                val9242.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                val9242.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                val9242.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                val9242.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                val9242.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                val9242.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                val9242.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                val9242.setImageResource(R.drawable.cloud_night);
            }

            item4 = oneObject.getInt("temperature");
            val9243.setText("" + item4);


            item = reader.getJSONObject("daily");
            item2 = item.getJSONArray("data");

            Log.d("three", item2.toString());

            oneObject = item2.getJSONObject(1);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("EEEE, MMM d");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                grid11.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            Integer temp1 = oneObject.getInt("temperatureMax");
            Integer temp2 = oneObject.getInt("temperatureMin");

            if (degree.matches("us")) {
                String temp = "Min: " + temp1 + "°F | Max: " + temp2 + "°F";
                grid12.setText(temp);
                Log.d("three", temp);

            } else {
                String temp = "Min: " + temp1 + "°C | Max: " + temp2 + "°C";
                grid12.setText(temp);
                Log.d("three", temp);
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                grid13.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                grid13.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                grid13.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                grid13.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                grid13.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                grid13.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                grid13.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                grid13.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                grid13.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                grid13.setImageResource(R.drawable.cloud_night);
            }


            oneObject = item2.getJSONObject(2);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("EEEE, MMM d");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                grid21.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            temp1 = oneObject.getInt("temperatureMax");
            temp2 = oneObject.getInt("temperatureMin");

            if (degree.matches("us")) {
                String temp = "Min: " + temp1 + "°F | Max: " + temp2 + "°F";
                grid22.setText(temp);
                Log.d("three", temp);

            } else {
                String temp = "Min: " + temp1 + "°C | Max: " + temp2 + "°C";
                grid22.setText(temp);
                Log.d("three", temp);
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                grid23.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                grid23.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                grid23.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                grid23.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                grid23.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                grid23.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                grid23.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                grid23.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                grid23.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                grid23.setImageResource(R.drawable.cloud_night);
            }


            oneObject = item2.getJSONObject(3);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("EEEE, MMM d");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                grid31.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            temp1 = oneObject.getInt("temperatureMax");
            temp2 = oneObject.getInt("temperatureMin");

            if (degree.matches("us")) {
                String temp = "Min: " + temp1 + "°F | Max: " + temp2 + "°F";
                grid32.setText(temp);
                Log.d("three", temp);

            } else {
                String temp = "Min: " + temp1 + "°C | Max: " + temp2 + "°C";
                grid32.setText(temp);
                Log.d("three", temp);
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                grid33.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                grid33.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                grid33.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                grid33.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                grid33.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                grid33.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                grid33.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                grid33.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                grid33.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                grid33.setImageResource(R.drawable.cloud_night);
            }


            oneObject = item2.getJSONObject(2);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("EEEE, MMM d");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                grid21.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            temp1 = oneObject.getInt("temperatureMax");
            temp2 = oneObject.getInt("temperatureMin");

            if (degree.matches("us")) {
                String temp = "Min: " + temp1 + "°F | Max: " + temp2 + "°F";
                grid22.setText(temp);
                Log.d("three", temp);

            } else {
                String temp = "Min: " + temp1 + "°C | Max: " + temp2 + "°C";
                grid22.setText(temp);
                Log.d("three", temp);
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                grid23.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                grid23.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                grid23.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                grid23.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                grid23.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                grid23.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                grid23.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                grid23.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                grid23.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                grid23.setImageResource(R.drawable.cloud_night);
            }


            oneObject = item2.getJSONObject(4);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("EEEE, MMM d");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                grid41.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            temp1 = oneObject.getInt("temperatureMax");
            temp2 = oneObject.getInt("temperatureMin");

            if (degree.matches("us")) {
                String temp = "Min: " + temp1 + "°F | Max: " + temp2 + "°F";
                grid42.setText(temp);
                Log.d("three", temp);

            } else {
                String temp = "Min: " + temp1 + "°C | Max: " + temp2 + "°C";
                grid42.setText(temp);
                Log.d("three", temp);
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                grid43.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                grid43.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                grid43.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                grid43.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                grid43.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                grid43.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                grid43.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                grid43.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                grid43.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                grid43.setImageResource(R.drawable.cloud_night);
            }


            oneObject = item2.getJSONObject(5);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("EEEE, MMM d");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                grid51.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            temp1 = oneObject.getInt("temperatureMax");
            temp2 = oneObject.getInt("temperatureMin");

            if (degree.matches("us")) {
                String temp = "Min: " + temp1 + "°F | Max: " + temp2 + "°F";
                grid52.setText(temp);
                Log.d("three", temp);

            } else {
                String temp = "Min: " + temp1 + "°C | Max: " + temp2 + "°C";
                grid52.setText(temp);
                Log.d("three", temp);
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                grid53.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                grid53.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                grid53.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                grid53.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                grid53.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                grid53.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                grid53.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                grid53.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                grid53.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                grid53.setImageResource(R.drawable.cloud_night);
            }


            oneObject = item2.getJSONObject(6);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("EEEE, MMM d");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                grid61.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            temp1 = oneObject.getInt("temperatureMax");
            temp2 = oneObject.getInt("temperatureMin");

            if (degree.matches("us")) {
                String temp = "Min: " + temp1 + "°F | Max: " + temp2 + "°F";
                grid62.setText(temp);
                Log.d("three", temp);

            } else {
                String temp = "Min: " + temp1 + "°C | Max: " + temp2 + "°C";
                grid62.setText(temp);
                Log.d("three", temp);
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                grid63.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                grid63.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                grid63.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                grid63.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                grid63.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                grid63.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                grid63.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                grid63.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                grid63.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                grid63.setImageResource(R.drawable.cloud_night);
            }


            oneObject = item2.getJSONObject(7);

            time1 = oneObject.getLong("time");

            time2 = new java.util.Date(time1 * 1000);
            // Toast(getApplicationContext(),time2.toString(), Toast.LENGTH_LONG).show();

            timezone = reader.getString("timezone");

            // Toast(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
                // Toast(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("EEEE, MMM d");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1 = isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
                // Toast(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
                //      // Toast(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                grid71.setText(date1);

            } catch (Exception e) {
                e.printStackTrace();
            }

            temp1 = oneObject.getInt("temperatureMax");
            temp2 = oneObject.getInt("temperatureMin");

            if (degree.matches("us")) {
                String temp = "Min: " + temp1 + "°F | Max: " + temp2 + "°F";
                grid72.setText(temp);
                Log.d("three", temp);

            } else {
                String temp = "Min: " + temp1 + "°C | Max: " + temp2 + "°C";
                grid72.setText(temp);
                Log.d("three", temp);
            }

            item3 = oneObject.getString("icon");

            if (item3.matches("clear-day")) {
                grid73.setImageResource(R.drawable.clear);
            } else if (item3.matches("clear-night")) {
                grid73.setImageResource(R.drawable.clear_night);
            } else if (item3.matches("rain")) {
                grid73.setImageResource(R.drawable.rain);
            } else if (item3.matches("snow")) {
                grid73.setImageResource(R.drawable.snow);
            } else if (item3.matches("sleet")) {
                grid73.setImageResource(R.drawable.sleet);
            } else if (item3.matches("wind")) {
                grid73.setImageResource(R.drawable.wind);
            } else if (item3.matches("fog")) {
                grid73.setImageResource(R.drawable.fog);
            } else if (item3.matches("cloudy")) {
                grid73.setImageResource(R.drawable.cloudy);
            } else if (item3.matches("partly-cloudy-day")) {
                grid73.setImageResource(R.drawable.cloud_day);
            } else if (item3.matches("partly-cloudy-night")) {
                grid73.setImageResource(R.drawable.cloud_night);
            }


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void show24(View view) {
        ScrollView v1;
        ScrollView v2;
        RelativeLayout r1;
        RelativeLayout r2;
        Button b1;
        b1 = (Button) findViewById(R.id.button5);
        Button b2;
        b2 = (Button) findViewById(R.id.button6);
        b1.setBackgroundColor(0xFFB0DBF9);
        b2.setBackgroundColor(0xFFDBDBDB);
        v1 = (ScrollView) findViewById(R.id.scrollView);
        v1.setVisibility(View.VISIBLE);
        v2 = (ScrollView) findViewById(R.id.scrollView3);
        v2.setVisibility(View.INVISIBLE);
        b1.setSelected(true);
        b2.setSelected(false);
        r1 = (RelativeLayout) findViewById(R.id.layoutshow24);
        r2 = (RelativeLayout) findViewById(R.id.layoutshow7);
        r2.setVisibility(View.GONE);
        r1.setVisibility(View.VISIBLE);
    }

    public void show7(View view) {
        ScrollView v1;
        ScrollView v2;
        RelativeLayout r1;
        RelativeLayout r2;
        Button b1;
        b1 = (Button) findViewById(R.id.button5);
        Button b2;
        b2 = (Button) findViewById(R.id.button6);
        b2.setBackgroundColor(0xFFB0DBF9);
        b1.setBackgroundColor(0xFFDBDBDB);
        b1.setSelected(false);
        b2.setSelected(true);

        v1 = (ScrollView) findViewById(R.id.scrollView);
        v1.setVisibility(View.INVISIBLE);
        v2 = (ScrollView) findViewById(R.id.scrollView3);
        v2.setVisibility(View.VISIBLE);
        r1 = (RelativeLayout) findViewById(R.id.layoutshow24);
        r2 = (RelativeLayout) findViewById(R.id.layoutshow7);
        r1.setVisibility(View.GONE);
        r2.setVisibility(View.VISIBLE);
    }

    public void showplus(View view) {
        TableRow r1;
        TableRow r2;
        r1 = (TableRow) findViewById(R.id.plus);
        r2 = (TableRow) findViewById(R.id.other24);
        r1.setVisibility(View.GONE);
        r2.setVisibility(View.VISIBLE);
    }
}
