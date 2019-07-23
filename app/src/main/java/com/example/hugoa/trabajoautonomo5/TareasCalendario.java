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

        TextView txtfecha = findViewById(R.id.textView1); //Declaramos TextView Fecha - Este TextView presentara la fecha presionada en el calendario
        TextView txttarea = findViewById(R.id.textView2); //Declaramos TextView tarea - Este TextView presentara la tarea que haya para esa fecha
        Button btnvolver = findViewById(R.id.button2); //Declaramos Button - Este boton nos permitira volver al calendario

        String tarea1 = "2019/7/23"; // String que contiene la fecha de nuestra tarea

        String date = getIntent().getStringExtra("date"); //Obtenemos la fecha presionada en el calendario
        if(date!= null)
            txtfecha.setText(date); //Presentamos la fecha presionada en nuestro txtfecha

        if (Objects.equals(date, tarea1)) { //si el valor de la fecha es igual a la fecha de nuestra tarea
            txttarea.setText("Presentar trabajo autonomo 5"); //Presentamos la tarea en nuestro txttarea
        }
        else {
            txttarea.setText("No hay tarea guardada");
        }



        btnvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //si damos clic en el boton volver, por medio de intent volveremos a la ventana calendario

                Intent intent = new Intent(TareasCalendario.this, Calendario.class);
                startActivity(intent);
            }

        });
    }
}
