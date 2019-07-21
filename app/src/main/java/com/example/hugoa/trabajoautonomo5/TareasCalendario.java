package com.example.hugoa.trabajoautonomo5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TareasCalendario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tareas_calendario);

        TextView fecha = findViewById(R.id.textView1);
        TextView tarea = findViewById(R.id.textView2);
        Button button = findViewById(R.id.button2);

        String date = getIntent().getStringExtra("date");
        if(date!= null)
            fecha.setText(date);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TareasCalendario.this, Calendario.class);
                startActivity(intent);
            }

        });
    }
}
