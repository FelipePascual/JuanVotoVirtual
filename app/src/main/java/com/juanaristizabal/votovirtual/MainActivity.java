package com.juanaristizabal.votovirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    String nombre;
    int cedula;

    Button opcionA;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Identificar boton

        opcionA = findViewById(R.id.opcionA);
        opcionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                votacion = "A";
                Intent enviarDatos = new Intent(MainActivity.this, Resultados.class);

                //Daticos
                enviarDatos.putExtra("nombre",nombre);
                enviarDatos.putExtra("cedula",cedula);
                enviarDatos.putExtra("fecha","26/04/2003");
                enviarDatos.putExtra("cedula",1000635023);

                startActivity(enviarDatos);
            }
        });


        Intent enviarDatos = new Intent(MainActivity.this, Resultados.class);

        //Daticos
        enviarDatos.putExtra("nombre",nombre);
        enviarDatos.putExtra("cedula",cedula);

        startActivity(enviarDatos);

    }
}