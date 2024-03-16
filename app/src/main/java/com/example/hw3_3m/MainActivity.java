package com.example.hw3_3m;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> CarsNameList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();

        CarsAdapter adapter = new CarsAdapter(CarsNameList);
        RecyclerView сarRv = findViewById(R.id.cars_rv);
        сarRv.setAdapter(adapter);

    }

    private void loadData() {
        CarsNameList.add(" лучшие машины компании BMW");
        CarsNameList.add("BMW m5 e30");
        CarsNameList.add("BMW m5 e34");
        CarsNameList.add("BMW m5 e36");
        CarsNameList.add("BMW m5 e38");
        CarsNameList.add("BMW m5 e39");
        CarsNameList.add("BMW m5 e60");
        CarsNameList.add("BMW m5 f90");
        CarsNameList.add("BMW m5 m8");
        CarsNameList.add("BMW X2");
        CarsNameList.add("BMW X3");
        CarsNameList.add("BMW X4");
        CarsNameList.add("BMW X5");
        CarsNameList.add("BMW X6");
        CarsNameList.add("BMW X7");
        CarsNameList.add("BMW XM");
        CarsNameList.add("BMW M5 f30");
        CarsNameList.add("BMW m5 f10");
    }
}
