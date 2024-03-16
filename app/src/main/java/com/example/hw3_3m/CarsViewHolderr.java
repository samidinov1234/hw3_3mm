package com.example.hw3_3m;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarsViewHolderr extends RecyclerView.ViewHolder {

    private TextView nameTv;
    public CarsViewHolderr(@NonNull View itemView) {
        super(itemView);
        nameTv = itemView.findViewById(R.id.name_tv);
    }

    public void bind(String starName){nameTv.setText(starName);}

}
