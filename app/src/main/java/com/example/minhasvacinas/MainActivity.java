package com.example.minhasvacinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void irParaOpcoes(View v) {
        Intent i = new Intent();
        i.setClass(MainActivity.this, Opcoes.class);
        startActivity(i);
    }



}