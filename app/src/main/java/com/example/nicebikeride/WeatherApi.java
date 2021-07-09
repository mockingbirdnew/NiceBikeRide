package com.example.nicebikeride;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class WeatherApi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_api);
        initRetrofit();
    }
    protected void initRetrofit() {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new IntEx())
                .build();

        Retrofit retrofit = (new Retrofit.Builder())
                .baseUrl("https://api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .client(client)
                .build();

        RetrofitService service = retrofit.create(RetrofitService.class);
        }

    }

