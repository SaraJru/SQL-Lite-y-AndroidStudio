package com.example.myapplication;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class EstudiantesActivity extends AppCompatActivity {

    private RecyclerView recyclerViewEstudaintes;
    private EstudiantesAdaptador EstudiantesAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiantes);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        recyclerViewEstudaintes = (RecyclerView)findViewById(R.id.recyclerEstudiantes);
        recyclerViewEstudaintes.setLayoutManager(new LinearLayoutManager(this));

        SQLBD sqlbd = new SQLBD(getApplicationContext());
        EstudiantesAdaptador= new EstudiantesAdaptador(sqlbd.mostrarEstudiantes());
        recyclerViewEstudaintes.setAdapter(EstudiantesAdaptador);
    }

}