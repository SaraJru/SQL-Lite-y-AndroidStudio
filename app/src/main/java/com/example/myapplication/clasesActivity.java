package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class clasesActivity extends AppCompatActivity {

    EditText edtCodigo, edtCurso, edtCarrera;
    Button btnAgregar, btnMostrar, btnAsignacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clases);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        edtCodigo = (EditText) findViewById(R.id.edtCodigo);
        edtCurso = (EditText) findViewById(R.id.edtCurso);
        edtCarrera = (EditText) findViewById(R.id.edtCarrera);
        btnAgregar = (Button) findViewById(R.id.btnAgregar);
        /*btnMostrar = (Button) findViewById(R.id.btnMostrar);
        btnAsignacion = (Button) findViewById(R.id.btnAsignacion);*/

        final SQLBD sqlumg= new SQLBD(getApplicationContext());

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqlumg.agregarCursos(edtCodigo.getText().toString(), edtCurso.getText().toString(), edtCarrera.getText().toString());
                Toast.makeText(getApplicationContext(), "SE AGREGO CORRECTAMENTE", Toast.LENGTH_SHORT).show();
            }
        });

    }
}