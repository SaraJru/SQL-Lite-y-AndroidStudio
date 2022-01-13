package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroEstudiantes extends AppCompatActivity {

    EditText edtNombres, edtApellidos, edtCarne, edtCarrera;
    Button btnInscribir,btnMostrar,btnAsignacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_estudiantes);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        edtNombres = (EditText) findViewById(R.id.edtNombres);
        edtApellidos = (EditText) findViewById(R.id.edtApellidos);
        edtCarne = (EditText) findViewById(R.id.edtCarne);
        edtCarrera = (EditText) findViewById(R.id.edtCarrera);
        btnInscribir = (Button) findViewById(R.id.btnInscribir);
        btnMostrar = (Button)findViewById(R.id.btnMostrar);

        final SQLBD sqlumg = new SQLBD(getApplicationContext());

        btnInscribir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqlumg.inscribirEstudiantes(edtNombres.getText().toString(), edtApellidos.getText().toString(), edtCarne.getText().toString(), edtCarrera.getText().toString());
                Toast.makeText(getApplicationContext(), "SE AGREGO CORRECTAMENTE", Toast.LENGTH_SHORT).show();
            }
        });

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mostrarEstudiantes= new Intent(getApplicationContext(),EstudiantesActivity.class);
                startActivity(mostrarEstudiantes);
            }
        });
    }
}