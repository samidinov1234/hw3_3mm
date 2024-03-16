package com.example.hw3_3m;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarsAdapter extends RecyclerView.Adapter<CarsViewHolderr> {

    private  ArrayList<String> carsNameList;
    CarsAdapter(ArrayList<String> carsNameList) {
        this.carsNameList = carsNameList;
    }

    @NonNull
    @Override
    public CarsViewHolderr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       return new CarsViewHolderr(android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.cars_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarsViewHolderr holder, int position) {
        holder.bind(carsNameList.get(position));
    }

    @Override
    public int getItemCount() {
        return carsNameList.size();
    }
}


