package com.example.hugoa.trabajoautonomo5;

import android.content.Intent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Prueba Master
    }
        public void calendar(View view) {
            Intent i = new Intent(this, Calendario.class );
            startActivity(i);
        }

        public void video(View view) {
            Intent i = new Intent(this, Video.class );
            startActivity(i);
        }




    }

