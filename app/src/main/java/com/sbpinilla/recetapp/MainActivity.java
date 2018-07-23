package com.sbpinilla.recetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sbpinilla.recetapp.pojos.Receta;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recvclerRecetas;

    ArrayList<Receta> recetaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recvclerRecetas = findViewById(R.id.recyclerRecetas);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recvclerRecetas.setLayoutManager(linearLayoutManager);


    }

    public void createData() {

        recetaArrayList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {

            recetaArrayList.add(
                    new Receta(
                            "" + (i),
                            "Receta " + i,
                            2,
                            "descripcion receta " + i,
                            "preparacion receta " + i,
                            "http://imagen.png",
                            0));

        }

    }
}
