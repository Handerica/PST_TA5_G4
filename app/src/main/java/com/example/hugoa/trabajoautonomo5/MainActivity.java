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
    /*Este metodo permite acceder al calendario creado desde el menu principal, al presionar el boton CALENDARIO*/
    public void calendar(View view) {
        Intent i = new Intent(this, Calendario.class );
        startActivity(i);
    }
    /*Este metodo permite acceder al video desde el menu principal, al presionar el boton VIDEO*/
    public void video(View view) {
        Intent i = new Intent(this, Video.class );
        startActivity(i);
    }

    /*Este metodo permite acceder al mapa  desde el menu principal, al presionar el boton MAPA*/
    public void toMap(View view) {
        Intent i = new Intent(this,MapsActivity.class);
        startActivity(i);
        finish();
    }

    /*Este metodo permite cerrar la apliccaion en sus dispositivo, al presionar el boton SALIR*/
    public void salir(View view) {
        finish();
    }
}

