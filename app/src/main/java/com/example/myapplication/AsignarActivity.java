package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AsignarActivity extends AppCompatActivity {

    EditText carne_Es, semestre, carrera, curso;
    Button btnAsignar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asignar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        carne_Es = (EditText) findViewById(R.id.edtCarEs);
        semestre = (EditText) findViewById(R.id.edtSemestre);
        carrera = (EditText) findViewById(R.id.edtCarrera);
        curso = (EditText) findViewById(R.id.edtCurso);
        btnAsignar = (Button) findViewById(R.id.btnAsignar);

       /* final SQLDB sqldb =  new SQLDB(getApplicationContext());

        btnAsignar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqldb.asignarCursos(carne_Es.getText().toString(),semestre.getText().toString(),carrera.getText().toString(),curso.getText().toString());
                Toast.makeText(getApplicationContext(), "SE AGREGO CORRECTAMENTE", Toast.LENGTH_SHORT).show();
            }
        });*/

    }
   }
