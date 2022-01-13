package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroProfesores extends AppCompatActivity {

    EditText edtnomProf, edtapellidosProf,edtID,edtFac;
    Button btnRegistrar,btnMostrarProf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_profesores);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        edtnomProf = (EditText)findViewById(R.id.edtNomProf);
        edtapellidosProf = (EditText)findViewById(R.id.edtapellidosProf);
        edtID = (EditText)findViewById(R.id.edtID);
        edtFac= (EditText)findViewById(R.id.edtFac);
        btnRegistrar = (Button)findViewById(R.id.btnRegistrar);
        btnMostrarProf = (Button)findViewById(R.id.btnMostrarProf);

        final SQLBD sqlumg = new SQLBD(getApplicationContext());

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               sqlumg.agregarProf(edtnomProf.getText().toString(),edtapellidosProf.getText().toString(),edtID.getText().toString(),edtFac.getText().toString());
                Toast.makeText(getApplicationContext(), "SE AGREGO CORRECTAMENTE", Toast.LENGTH_SHORT).show();
            }
        });

        btnMostrarProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mostrarProf= new Intent(getApplicationContext(),ProfesoresActivity.class);
                startActivity(mostrarProf);
            }
        });
    }
}


