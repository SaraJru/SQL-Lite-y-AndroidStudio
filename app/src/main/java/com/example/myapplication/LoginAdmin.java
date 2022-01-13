package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginAdmin extends AppCompatActivity {

    Button boton;
    EditText txt_usuario, txt_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        txt_usuario = (EditText) findViewById((R.id.txt_usuario));
        txt_pass = (EditText) findViewById(R.id.txt_pass);
        boton = (Button) findViewById(R.id.btn_bienvenida);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String V_User = txt_usuario.getText().toString();
                String V_pass = txt_pass.getText().toString();
                if(V_User.equals("UMGAdmin") && V_pass.equals("1966")){

                    Intent intent = new Intent(getApplicationContext(),RegistrosAdmin.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Usuario y/o contraseña incorrectos",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    }
