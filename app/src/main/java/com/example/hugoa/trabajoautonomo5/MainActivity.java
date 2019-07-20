package com.example.hugoa.trabajoautonomo5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Prueba Master
    }

    public void toCalendar(View view) {
    }

    public void toVideo(View view) {
    }

    public void cerrar(View view) {
        finish();
    }

    public void toMap(View view) {
        Intent i = new Intent(this,MapsActivity.class);
        startActivity(i);
    }
}
