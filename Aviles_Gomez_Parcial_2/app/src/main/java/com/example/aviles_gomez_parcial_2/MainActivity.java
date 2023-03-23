package com.example.aviles_gomez_parcial_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

import com.example.aviles_gomez_parcial_2.entity.Empleado;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Button btnListado;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnListado = findViewById(R.id.btnListado);
    }

    public void mostrarListado(View v){

        Intent i = new Intent(this, ListaDatos.class);
        startActivity(i);
    }
}