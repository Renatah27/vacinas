package com.example.minhasvacinas;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import javax.xml.transform.stream.StreamResult;




public class VacinasActivity extends AppCompatActivity {


    private TextView edtVacina;

    private VacinasAdapter vacinasAdapter;
    public static ArrayList<Vacina> vacinas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacinas);

        RecyclerView listview  = (RecyclerView) findViewById(R.id.lstVacina);

        vacinas = new ArrayList<Vacina>();

        vacinas.add(new Vacina(1,"Varíola"));
        vacinas.add(new Vacina(2,"Sarampo"));
        vacinas.add(new Vacina(3,"Febre amarela"));
        vacinas.add(new Vacina(4,"Rubéola"));
        vacinas.add(new Vacina(5,"Catapora"));
        vacinas.add(new Vacina(6,"Dengue"));

        edtVacina = findViewById(R.id.edtVacina);




        vacinasAdapter = new VacinasAdapter(vacinas,getApplicationContext());
        listview.setAdapter( vacinasAdapter);

        RecyclerView.LayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        listview.setLayoutManager(layout);
    }



}
