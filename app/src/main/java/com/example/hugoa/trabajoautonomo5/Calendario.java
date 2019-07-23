package com.example.hugoa.trabajoautonomo5;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Calendario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        CalendarView calendarView = findViewById(R.id.calendarView); //Declaramos clase CalendarView

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) { // Obtenemos la fecha que ha sido seleccionada en el calendario

                String date = i + "/" + (i1+1) + "/" + i2; //Guardamos esa fecha, este dato se envia a TareasCalendario

                Intent intent = new Intent(Calendario.this, TareasCalendario.class); //Al presinar alguna fecha del calendario
                //por medio de Intent nos dirigimos a TareasCalendario
                intent.putExtra("date", date);

                startActivity(intent);

            }
        });
    }

    public void calendarSalir(View view) { //Funcion para ir de la ventana Calendario al Menu principal (MainActivity)
        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);
        finish();
    }
}
