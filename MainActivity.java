package com.example.sudhakaushik.forecastsearch;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.InputStreamReader;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.net.Uri;


public class MainActivity extends AppCompatActivity {


    static String streetname;
    static String cityname;
    static String state;
    static String degree;

    public static String Response = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        final RadioButton rb = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
     //   final int deg=radioGroup.getCheckedRadioButtonId();
        final EditText street = (EditText) findViewById(R.id.editText);
        final EditText city = (EditText) findViewById(R.id.editText1);
        final Spinner spinnera = (Spinner) findViewById(R.id.spinner);
        final TextView noResultsMsg = (TextView) findViewById(R.id.textView6);
        state = spinnera.getSelectedItem().toString();
        streetname = street.getText().toString();
        cityname = city.getText().toString();
    //    degree = rb.getContentDescription().toString();
        degree="us";
        noResultsMsg.setText("");

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.media_names, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        final Button search = (Button) findViewById(R.id.button);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state = spinnera.getSelectedItem().toString();
                streetname = street.getText().toString();
                cityname = city.getText().toString();
             //   degree = rb.getContentDescription().toString();
                noResultsMsg.setText("");

            //    Toast.makeText(MainActivity.this,"hi"+degree , Toast.LENGTH_SHORT).show();

                if (streetname.matches("")) {
                    noResultsMsg.setText("Please enter a Street.");
                } else if (cityname.matches("")) {
                    noResultsMsg.setText("Please enter a City.");
                } else if (state.matches("Select")) {
                    noResultsMsg.setText("Please select a state.");
                } else {
             //       Toast.makeText(MainActivity.this, "calling forecast", Toast.LENGTH_SHORT).show();
                    try {
                        streetname = URLEncoder.encode(street.getText().toString(), "UTF-8");
                        cityname = URLEncoder.encode(city.getText().toString(), "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    getForecast(streetname, cityname, state, degree,city,street);
                }
            }
        });
        final Button clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Toast.makeText(MainActivity.this, "in clear", Toast.LENGTH_SHORT).show();
                street.setText("");
                city.setText("");
                spinnera.setSelection(0);
                ((RadioButton) radioGroup.getChildAt(0)).setChecked(true);
                noResultsMsg.setText("");
            }


        });
        final ImageButton forecastio = (ImageButton) findViewById(R.id.imageButton);
        forecastio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.forecast.io"));
                startActivity(intent);
            }
        });

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked)
                    degree="us";
                    break;
            case R.id.radioButton2:
                if (checked)
                    degree="si";
                    break;
        }
    }

    public void aboutme(View view)
    {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
    public void getForecast(String streetname, String cityname, String state, String degree,EditText city,EditText street) {

      //  Toast.makeText(MainActivity.this, "inside forecast", Toast.LENGTH_SHORT).show();
     //   Toast.makeText(MainActivity.this,streetname+cityname+state+degree, Toast.LENGTH_SHORT).show();

        String citynameunencode=city.getText().toString();
        String streetunencode=street.getText().toString();
        forecast getDetails = new forecast();
        String msg = "error";
        Log.d("One", "*****************************four");

        try {
            String forecastoutput = getDetails.execute(getApplicationContext()).get();
        //    Toast.makeText(getApplicationContext(),forecastoutput, Toast.LENGTH_LONG).show();
            Log.d("One", "***************two");
            Log.d("One", forecastoutput);
            JSONObject jsonObj = new JSONObject(forecastoutput);
            Log.d("One", jsonObj.toString());
            Log.d("One", "**************************three");
            msg = "ok";
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("forecast_output", forecastoutput);
            intent.putExtra("cityname", citynameunencode);
            intent.putExtra("state", state);
            intent.putExtra("degree", degree);
            intent.putExtra("street", streetunencode);

            startActivity(intent);
           // Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            //Log.d("One", "*****************************four");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Log.d("One", "*****************************ERRRRRRRRRR1");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Log.d("One", "*****************************ERRRRRRRRR2");
        }
        Log.d("One", "*****************************five");
    }

}

 class forecast extends AsyncTask<Context, String, String>{

    Context ctx;
    String jsonObj = "empty";
    Activity activity;

     @Override
     protected void onPreExecute() {
         super.onPreExecute();
     }


    @Override
    protected String doInBackground(Context... arg0){
        // TODO Auto-generated method stub
        Log.d("One", "*****************************async 1");
        ctx = arg0[0];

        try{
            String url = "http://csci571sudha-env.elasticbeanstalk.com/index.php?street=" + MainActivity.streetname + "&city=" + MainActivity.cityname + "&state=" + MainActivity.state + "&degree=" + MainActivity.degree;
            Log.d("One", "*****************************async 2");
            HttpClient http = new DefaultHttpClient();
            HttpGet http_get = new HttpGet(url);
            HttpResponse http_resp = http.execute(http_get);
            HttpEntity http_ent = http_resp.getEntity();
            BufferedReader br = new BufferedReader(new InputStreamReader(http_ent.getContent()));
            jsonObj = br.readLine();
            Log.d("One", "*****************************async 3");

        }catch(Exception e){
            jsonObj = e.getMessage();
            Log.d("One", "*****************************async ERRRRRR");
        }
        //publishProgress(jsonObj);
        Log.d("One", "*****************************async 4");
        Log.d("One", jsonObj);
        return jsonObj;
    }

     protected void onPostExecute(String result) {
         Log.d("One", "*****************************async 3");
     }

}

