package com.example.luiscaiza_examen;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void ingreso (View v) {

        String usuario = ((EditText)findViewById(R.id.IDUSUARIO)) .getText().toString();
        String Clave  = ((EditText)findViewById(R.id.IDCLAVE)).getText().toString();

        if (usuario.equals("estudiante2019")&&Clave.equals("uisrael2019")){
            Intent Registro = new Intent(Login.this, Registro.class);
            startActivity(Registro);
        }

        else  {
            Toast.makeText(getApplicationContext(),"Usuario o Contraseña Incorrecta",Toast.LENGTH_LONG).show();
        }
    }
}
