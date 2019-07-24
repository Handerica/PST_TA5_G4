package com.example.hugoa.trabajoautonomo5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipula el mapa una vez este disponible
     * Esto es activado una vez el mapa este listo para usarse.
     * En este metodo se puede añadir marcadores o lineas, listeners o mover la camara del mapa.
     * En este caso solo marcaremos el lugar geografico de ESPOL en el mapa.
     * Google Play services debe estar instaladao en el dispositivo. Caso contrario el usuario
     * se vera forzado a instalarlo. El mapa se mostrara una vez que los servicios de Google hayan
     * sido instalados y se retorne a la App.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Añadir marcador en el mapa
        LatLng espol = new LatLng(-2.147758,  -79.964520); //Latitud y longitud de la ubicacion
        mMap.addMarker(new MarkerOptions().position(espol).title("ESPOL"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(espol,50F)); //Zoom a la zona geografica
    }

    /**
     * Metodo que retorna al menu principal de la aplicacion usando Intents.
     * @param view Correspondiente al boton puesto sobre el map view
     */
    public void alMenuPrincipal(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }

}
