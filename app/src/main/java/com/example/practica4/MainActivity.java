package com.example.practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eMes;
    Button bMostrar;
    TextView tResultado;

    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eMes = findViewById(R.id.eMes);
        bMostrar = findViewById(R.id.bMostrar);
        tResultado = findViewById(R.id.tResultado);
    }

    public void MostrarMes(View view){
    if (eMes.getText().toString().length() > 0){
        numero = Integer.parseInt(eMes.getText().toString());
        switch (numero){
            case 1:
                tResultado.setText("Enero");
                break;
            case 2:
                tResultado.setText("Febrero");
                break;
            case 3:
                tResultado.setText("Marzo");
                break;
            case 4:
                tResultado.setText("Abril");
                break;
            default:
                tResultado.setText("Ingresa un valor valido");
                break;
        }
    }else{
        Toast.makeText(this, "Debes de ingresar un valor", Toast.LENGTH_SHORT).show();
    }

    }





}