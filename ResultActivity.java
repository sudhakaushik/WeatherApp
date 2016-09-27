package com.example.sudhakaushik.forecastsearch;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.widget.Toast;
import java.text.*;
import java.util.*;

import com.facebook.FacebookCallback;
import com.facebook.FacebookDialog;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookActivity;
import com.facebook.CallbackManager;
import com.facebook.share.ShareApi;
import com.facebook.share.Sharer;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.MessageDialog;
import com.facebook.share.widget.ShareButton;
import com.facebook.share.widget.ShareDialog;
import com.hamweather.aeris.communication.AerisEngine;

public class ResultActivity extends AppCompatActivity

{
    TextView resultof;
    TextView temp;
    TextView temp1;
    TextView deg;
    TextView precepval;
    TextView rainval;
    TextView wind;
    TextView dew;
    TextView hum;
    TextView vis;
    TextView sunr;
    TextView suns;

    public JSONObject item1;
    public JSONArray item2;
    public ListView list1;
    static String jsonResponse1;
    public String cityname;
    public String state;
    public String fbsummary;
    public String fbtemp;
    public String fbpic;


    CallbackManager callbackManager;
    ShareDialog shareDialog;
    ShareLinkContent linkContent;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        FacebookSdk.sdkInitialize(getApplicationContext());
        callbackManager = CallbackManager.Factory.create();

        shareDialog = new ShareDialog(this);








        resultof = (TextView) findViewById(R.id.textView11);
        temp1 = (TextView) findViewById(R.id.temp1);
        temp = (TextView) findViewById(R.id.temp);
        deg=  (TextView) findViewById(R.id.textView10);
        precepval=  (TextView) findViewById(R.id.precepval);
        rainval=  (TextView) findViewById(R.id.rainval);
        wind=  (TextView) findViewById(R.id.wind);
        dew=  (TextView) findViewById(R.id.dew);
        hum=  (TextView) findViewById(R.id.hum);
        vis=  (TextView) findViewById(R.id.vis);
        sunr=  (TextView) findViewById(R.id.sunr);
        suns=  (TextView) findViewById(R.id.suns);
        hum.setText("");
        suns.setText("");
        sunr.setText("");
        vis.setText("");
        temp1.setText("");
        dew.setText("");
        wind.setText("");
        rainval.setText("");
        precepval.setText("");
        deg.setText("");
        temp.setText("");
        JSONObject reader = null;
        JSONObject item = null;
        JSONArray item2 = null;
        String item1 = null;
        Context context;
        ImageView img= (ImageView) findViewById(R.id.imageView2);

     //   Toast.makeText(getApplicationContext(),"in output", Toast.LENGTH_LONG).show();

        Log.d("two", "in output");

        Intent intentObject = getIntent();
        final String jsonResponse = (String) intentObject.getSerializableExtra("forecast_output");
         cityname = (String) intentObject.getSerializableExtra("cityname");
         state = (String) intentObject.getSerializableExtra("state");
        String degree = (String) intentObject.getSerializableExtra("degree");

        Log.d("two", "HI"+jsonResponse);
        try {
             Log.d("two", "in try");
             reader = new JSONObject(jsonResponse);
            Log.d("two", "*****************");
            Log.d("two", reader.toString());
            item = reader.getJSONObject("currently");
            item1 = item.getString("summary");
            fbsummary=item1;
             Log.d("two", item.toString());
            Log.d("two", item1.toString());
            Log.d("two", degree);
            resultof.setText(item1 + " in " + cityname + ", " + state);


            if(degree.matches("us")) {
                Integer temp = item.getInt("temperature");
                temp1.setText(""+temp);
                deg.setText("°F");
                fbtemp=""+temp+"°F";
            }
            else{
                Integer temp = item.getInt("temperature");
                temp1.setText(""+temp);
                deg.setText("°C");
                fbtemp=""+temp+"°C";
            }


            item1 = item.getString("icon");

            fbpic=item1;
            if(item1.matches("clear-day")){
                img.setImageResource(R.drawable.clear);
            }
            else if(item1.matches("clear-night")){
                img.setImageResource(R.drawable.clear_night);
            }
            else if(item1.matches("rain")){
                img.setImageResource(R.drawable.rain);
            }
            else if(item1.matches("snow")){
                img.setImageResource(R.drawable.snow);
            }
            else if(item1.matches("sleet")){
                img.setImageResource(R.drawable.sleet);
            }
            else if(item1.matches("wind")){
                img.setImageResource(R.drawable.wind);
            }
            else if(item1.matches("fog")){
                img.setImageResource(R.drawable.fog);
            }
            else if(item1.matches("cloudy")){
                img.setImageResource(R.drawable.cloudy);
            }
            else if(item1.matches("partly-cloudy-day")){
                img.setImageResource(R.drawable.cloud_day);
            }
            else if(item1.matches("partly-cloudy-night")){
                img.setImageResource(R.drawable.cloud_night);
            }


            item = reader.getJSONObject("daily");
            item2 = item.getJSONArray("data");

            Log.d("two", item2.toString());

            JSONObject oneObject = item2.getJSONObject(0);
            String tempmax="H: "+Math.round((oneObject.getInt("temperatureMax")))+"°";
            String tempmin= "L: "+Math.round((oneObject.getInt("temperatureMin")))+"°";

            temp.setText(tempmin+" | "+tempmax);


            item = reader.getJSONObject("currently");
            Integer precep = item.getInt("precipIntensity");
            String precepint="";

            if(degree.matches("us")){
                if ((0<=precep) && (precep<0.002)){
                    precepint="None";
                }
                else if ((0.002<=precep) && (precep<0.017)){
                    precepint="Very Light";
                }
                else if ((0.017<=precep)&&(precep<0.1)){
                    precepint="Light";
                }
                else if ((0.1<=precep)&&(precep<0.4)){
                    precepint="Moderate";
                }
                else if (0.4<=precep){
                    precepint="Heavy";
                }
            }
            else{
                if ((0<=precep) && (precep<0.0508)){
                    precepint="None";
                }
                else if ((0.0508<=precep) && (precep<0.4318)){
                    precepint="Very Light";
                }
                else if ((0.4318<=precep)&&(precep<2.54)){
                    precepint="Light";
                }
                else if ((2.54<=precep)&&(precep<10.16)){
                    precepint="Moderate";
                }
                else if (10.16<=precep){
                    precepint="Heavy";
                }
            }
            precepval.setText(precepint);

            item = reader.getJSONObject("currently");
            Integer rainint = item.getInt("precipProbability");
            rainval.setText(rainint+"%");


            String windsp = item.getString("windSpeed");
            if(degree.matches("us")) {
                wind.setText(windsp + " mph");
            }
            else{
                wind.setText(windsp + " m/s");
            }


            Log.d("two", "Hi"+windsp);

            Integer dewpt = item.getInt("dewPoint");
            if(degree.matches("us")) {
                dew.setText(dewpt + "°F");
            }
            else{
                dew.setText(dewpt + "°C");
            }

            Log.d("two", "Hi"+windsp);


            Integer humi = item.getInt("humidity");
            hum.setText(humi + "%");


            String visi = item.getString("visibility");
            if(degree.matches("us")) {
                vis.setText(visi + " mi");
            }
            else{
                vis.setText(visi + " km");
            }

            Long sunrise = oneObject.getLong("sunriseTime");
            Long sunset = oneObject.getLong("sunsetTime");

            java.util.Date time1=new java.util.Date(sunrise*1000);
            java.util.Date time2=new java.util.Date(sunset*1000);
       //     Toast.makeText(getApplicationContext(),time1.toString(), Toast.LENGTH_LONG).show();

            String timezone= reader.getString("timezone");

       //     Toast.makeText(getApplicationContext(),timezone, Toast.LENGTH_LONG).show();

            try {
        //        Toast.makeText(getApplicationContext(),"in try", Toast.LENGTH_LONG).show();

                SimpleDateFormat isoFormat = new SimpleDateFormat("hh:mm a");
                isoFormat.setTimeZone(TimeZone.getTimeZone(timezone));
                String date1= isoFormat.format(time1);
                String date2= isoFormat.format(time2);

//                String newstring3 = new SimpleDateFormat("HH:mm:ss").format(date1);
        //        Toast.makeText(getApplicationContext(),date1, Toast.LENGTH_LONG).show();
         //       Toast.makeText(getApplicationContext(),newstring3, Toast.LENGTH_LONG).show();
                sunr.setText(date1);
                suns.setText(date2);

            }catch (Exception e){
                e.printStackTrace();
            }





      //      Toast.makeText(getApplicationContext(),item1.toString(), Toast.LENGTH_LONG).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }

//        Toast.makeText(getApplicationContext(),item1.toString(), Toast.LENGTH_LONG).show();


//                resultof.setTexitem1.toString()+ street + "'");
        final ImageButton fb = (ImageButton) findViewById(R.id.imageButton2);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String iconimg="";

                if(fbpic.matches("clear-day")){
                    iconimg="clear.png";
                }
                else if(fbpic.matches("clear-night")){
                    iconimg="clear_night.png";
                }
                else if(fbpic.matches("rain")){
                    iconimg="rain.png";
                }
                else if(fbpic.matches("snow")){
                    iconimg="snow.png";
                }
                else if(fbpic.matches("sleet")){
                    iconimg="sleet.png";
                }
                else if(fbpic.matches("wind")){
                    iconimg="wind.png";
                }
                else if(fbpic.matches("fog")){
                    iconimg="fog.png";
                }
                else if(fbpic.matches("cloudy")){
                    iconimg="cloudy.png";
                }
                else if(fbpic.matches("partly-cloudy-day")){
                    iconimg="cloud_day.png";
                }
                else if(fbpic.matches("partly-cloudy-night")){
                    iconimg="cloud_night.png";
                }

                String url="http://cs-server.usc.edu:45678/hw/hw8/images/"+iconimg;

                if (ShareDialog.canShow(ShareLinkContent.class)) {
                    linkContent = new ShareLinkContent.Builder()
                            .setContentTitle("Current Weather in " + cityname + ", " + state)
                            .setContentDescription(fbsummary + ", " + fbtemp)
                            .setContentUrl(Uri.parse("http://forecast.io"))
                            .setImageUrl(Uri.parse(url))
                            .build();

                    shareDialog.show(linkContent);
                    //   ShareApi.share(linkContent, null);
                }
                Log.i("four","in register");

                shareDialog.registerCallback(callbackManager, new FacebookCallback<Sharer.Result>()
                {
                    @Override
                    public void onSuccess(Sharer.Result Result)
                    {

                        Log.i("four",Result.toString());
                    //    Log.i("four",Result.getPostId());
          /*      if(!Result.getPostId().equals("")) {
                    Toast.makeText(getApplicationContext(), "Facebook Post Successful", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Post Cancelled", Toast.LENGTH_LONG).show();
                }*/

                        Toast.makeText(getApplicationContext(),"Facebook Post Successful", Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onCancel()
                    {
                        Toast.makeText(getApplicationContext(),"Post Cancelled", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onError(FacebookException exception)
                    {
                        Toast.makeText(getApplicationContext(),"Post Cancelled", Toast.LENGTH_LONG).show();
                        System.out.println("onError");
                    }
                });

                // MessageDialog.show(activityOrFragment, linkContent);

            }
        });





    }



    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
        Log.i("four", "in activity");
        Log.i("four", ""+requestCode);
        Log.i("four", ""+resultCode);
        Log.i("four", ""+data);

    }

    public void moredetails(View view)
    {

        Intent intentObject1 = getIntent();
        final String jsonResponse = (String) intentObject1.getSerializableExtra("forecast_output");
        String cityname = (String) intentObject1.getSerializableExtra("cityname");
        String state = (String) intentObject1.getSerializableExtra("state");
        String degree = (String) intentObject1.getSerializableExtra("degree");
        String street = (String) intentObject1.getSerializableExtra("street");

        Intent intent = new Intent(ResultActivity.this, DetailsActivity.class);

        intent.putExtra("forecast_output", jsonResponse);
        intent.putExtra("cityname", cityname);
        intent.putExtra("state", state);
        intent.putExtra("degree", degree);
        intent.putExtra("street", street);
        startActivity(intent);
    }
    public void map(View view)
    {
        Intent intentObject1 = getIntent();
        final String jsonResponse = (String) intentObject1.getSerializableExtra("forecast_output");
        String cityname = (String) intentObject1.getSerializableExtra("cityname");
        String state = (String) intentObject1.getSerializableExtra("state");

        Intent intent = new Intent(ResultActivity.this, MapActivity.class);

        intent.putExtra("forecast_output", jsonResponse);
        intent.putExtra("cityname", cityname);
        intent.putExtra("state", state);

        startActivity(intent);
    }
}
