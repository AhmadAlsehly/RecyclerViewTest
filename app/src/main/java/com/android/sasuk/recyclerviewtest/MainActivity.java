package com.android.sasuk.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

RecyclerView rv = null;

ArrayList<Model> modelList =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=findViewById(R.id.rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLM = linearLayoutManager;
        rv.setLayoutManager(rvLM);


        modelList = new ArrayList<Model>();
        modelList.add(new Model("Ahmad" , "Awesome",R.drawable.kh2));
        modelList.add(new Model("Ahmad" , "Awesome",R.drawable.kh2));
        modelList.add(new Model("Hashim" , "Super Awesome",R.drawable.kh2));
        modelList.add(new Model("Ahmad" , "Awesome",R.drawable.kh2));
        modelList.add(new Model("Ahmad" , "Awesome",R.drawable.kh2));
        modelList.add(new Model("Ahmad" , "Awesome",R.drawable.kh2));




        MyAdapter adapter = new MyAdapter(this,modelList);
        rv.setAdapter(adapter);
    }
}
