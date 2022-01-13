package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class RegistrosAdmin extends AppCompatActivity implements View.OnClickListener {

    public CardView cardView1,cardView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registros_admin);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        cardView1 = (CardView) findViewById(R.id.regisestu);
        cardView2 = (CardView) findViewById(R.id.regisprof);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.regisestu:
                i = new Intent(this, RegistroEstudiantes.class);
                startActivity(i);
                break;

            case R.id.regisprof:
                i = new Intent(this, RegistroProfesores.class);
                startActivity(i);
                break;
        }
    }
}