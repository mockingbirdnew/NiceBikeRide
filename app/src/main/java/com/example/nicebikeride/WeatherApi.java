package com.example.nicebikeride;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class WeatherApi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_api);

    }
    protected void initRetrofit(){
        OkHttpClient client = new OkHttpClient.Builder()
                .build()
        Retrofit retrofit= (new Retrofit.Builder())

    }

}