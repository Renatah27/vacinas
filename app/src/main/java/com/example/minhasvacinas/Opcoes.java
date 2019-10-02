package com.example.minhasvacinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Opcoes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes);
    }


    public void irParaTodasasVacinas(View v) {
        Intent i = new Intent();
        i.setClass(Opcoes.this, VacinasActivity.class);
        startActivity(i);
    }
    public void irParaCampanhas(View v) {
        Intent i = new Intent();
        i.setClass(Opcoes.this, CampanhasVacina.class);
        startActivity(i);
    }

    public void irParaCaderneta(View v) {
        Intent i = new Intent();
        i.setClass(Opcoes.this, MenuCadastro.class);
        startActivity(i);
    }
}

