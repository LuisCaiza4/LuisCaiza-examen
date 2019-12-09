package com.example.luiscaiza_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

    }
    public void Resumen(View view){
        Toast.makeText(getApplicationContext(),"Elemento guardado con exito",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Encuesta.this, Resumen.class);
        startActivity(intent);
    }
}
