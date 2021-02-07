package com.pavelpotapov.filmoteka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.pavelpotapov.filmoteka.data.Movie;
import com.pavelpotapov.filmoteka.utils.JSONUtils;
import com.pavelpotapov.filmoteka.utils.NetworkUtils;

import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}