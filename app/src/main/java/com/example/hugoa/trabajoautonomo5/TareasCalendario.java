package com.example.hugoa.trabajoautonomo5;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class TareasCalendario extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tareas_calendario);

        TextView fecha = findViewById(R.id.textView1);
        TextView tarea = findViewById(R.id.textView2);
        Button button = findViewById(R.id.button2);

        String Ftarea = "2019/6/22";

        String date = getIntent().getStringExtra("date");
        if(date!= null)
            fecha.setText(date);

        if (Objects.equals(date, Ftarea)) {
            tarea.setText("Presentar trabajo autonomo 5");
        }
        else {
            tarea.setText("No hay tarea guardada");
        }



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TareasCalendario.this, Calendario.class);
                startActivity(intent);
            }

        });
    }
}
