package com.example.myapplication;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProfesoresActivity extends AppCompatActivity {

    private RecyclerView recyclerViewProfesores;
    private ProfesoresAdaptador profesoresAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesores);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        recyclerViewProfesores = (RecyclerView) findViewById(R.id.recyclerProfesores);
        recyclerViewProfesores.setLayoutManager(new LinearLayoutManager(this));

        SQLBD sqlbd = new SQLBD(getApplicationContext());

        profesoresAdaptador = new ProfesoresAdaptador(sqlbd.mostrarProfesores());
        recyclerViewProfesores.setAdapter(profesoresAdaptador);
    }

}

