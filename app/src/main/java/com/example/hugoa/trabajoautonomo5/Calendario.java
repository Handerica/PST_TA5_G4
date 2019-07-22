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

        CalendarView calendarView = findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {

                String date = i + "/" + i1 + "/" + i2;

                Intent intent = new Intent(Calendario.this, TareasCalendario.class);
                intent.putExtra("date", date);

                startActivity(intent);

            }
        });
    }

    public void calendarSalir(View view) {
        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);
        finish();
    }
}
