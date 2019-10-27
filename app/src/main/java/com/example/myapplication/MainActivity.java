package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Adaptar adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        ArrayList<Model> arrayList = new ArrayList<>();

        arrayList.add(new Model("adnan", "adnan.starit"));
        arrayList.add(new Model("dew", "dew.starit"));
        arrayList.add(new Model("rubel", "rubel.starit"));


        adapter = new Adaptar(this, arrayList);
        listView.setAdapter(adapter);

    }

}
