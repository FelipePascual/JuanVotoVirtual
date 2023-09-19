package com.juanaristizabal.votovirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {
    String voto,nombre,cedula,fecha;
    TextView name,id,naci,votacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        name = findViewById(R.id.Nombre);
        id = findViewById(R.id.Cedula);
        naci = findViewById(R.id.FechaNacimiento);
        votacion = findViewById(R.id.Voto);

        Intent recibirDatos = getIntent();
        voto = recibirDatos.getStringExtra("votacion");
        nombre = recibirDatos.getStringExtra("nombre");
        cedula = recibirDatos.getStringExtra("cedula");
        fecha = recibirDatos.getStringExtra("fecha");

        name.setText(nombre);
        id.setText(cedula);
        naci.setText(fecha);
        votacion.setText(voto);

    }
}