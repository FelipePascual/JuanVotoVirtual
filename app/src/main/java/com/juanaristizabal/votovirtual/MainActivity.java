package com.juanaristizabal.votovirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText Nombre,Cedula,FechaNacimiento;
    Button opcionA,opcionB,opcionC;


    String Voto,name,id,naci;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Identificar boton

        Nombre = findViewById(R.id.Nombre);
        Cedula = findViewById(R.id.Cedula);
        FechaNacimiento = findViewById(R.id.FechaNacimiento);
        opcionA = findViewById(R.id.opcionA);
        opcionB = findViewById(R.id.opcionB);
        opcionC = findViewById(R.id.opcionC);

        opcionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Voto = "A";
                name = Nombre.getText().toString();
                id = Cedula.getText().toString();
                naci = FechaNacimiento.getText().toString();

                Intent enviarDatos = new Intent(MainActivity.this, Resultados.class);
                enviarDatos.putExtra("nombre",name);
                enviarDatos.putExtra("cedula",id);
                enviarDatos.putExtra("fecha","26/04/2003");
                enviarDatos.putExtra("votacion",Voto);
                startActivity(enviarDatos);
            }
        });

        opcionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Voto = "B";
                name = Nombre.getText().toString();
                id = Cedula.getText().toString();
                naci = FechaNacimiento.getText().toString();

                Intent enviarDatos = new Intent(MainActivity.this, Resultados.class);
                enviarDatos.putExtra("nombre",name);
                enviarDatos.putExtra("cedula",id);
                enviarDatos.putExtra("fecha",naci);
                enviarDatos.putExtra("votacion",Voto);
                startActivity(enviarDatos);
            }
        });

        opcionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Voto = "C";
                name = Nombre.getText().toString();
                id = Cedula.getText().toString();
                naci = FechaNacimiento.getText().toString();

                Intent enviarDatos = new Intent(MainActivity.this, Resultados.class);
                enviarDatos.putExtra("nombre",name);
                enviarDatos.putExtra("cedula",id);
                enviarDatos.putExtra("fecha","26/04/2003");
                enviarDatos.putExtra("votacion",Voto);
                startActivity(enviarDatos);
            }
        });
    }
}


