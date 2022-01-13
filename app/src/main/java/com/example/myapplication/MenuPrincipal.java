package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MenuPrincipal extends AppCompatActivity  implements View.OnClickListener {

    public CardView card1, card2,card3,card4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu_principal);


        card1 =(CardView)findViewById(R.id.administracion);
        card2 =(CardView)findViewById(R.id.profesores);
        card3 =(CardView)findViewById(R.id.estudiantes);
        card4 =(CardView)findViewById(R.id.acercade);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()){
            case R.id.administracion:
                intent = new Intent(this, LoginAdmin.class);
                startActivity(intent);
                break;

            case R.id.profesores:
                intent = new Intent(this,AsignarActivity.class);
                startActivity(intent);
                break;

            case  R.id.estudiantes:
                intent = new Intent(this,clasesActivity.class);
                startActivity(intent);
                break;

            case R.id.acercade:
                intent = new Intent(this,Info.class);
                startActivity(intent);
                break;

        }

    }
}