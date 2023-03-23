package com.example.aviles_gomez_parcial_2.entity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aviles_gomez_parcial_2.R;

import java.util.ArrayList;

public class EmpleadosAdapter extends ArrayAdapter<Empleado> {

    public EmpleadosAdapter(Context c, ArrayList<Empleado> l){
        super(c, 0, l);
    }

    @Override
    public View getView(int p, View cv, ViewGroup parent){

        Empleado e = getItem(p);

        if(cv == null){
            cv = LayoutInflater.from(getContext()).inflate(R.layout.item_empleado, parent, false);
        }

        TextView tvNombre = cv.findViewById(R.id.tvNombre);
        TextView tvCargo = cv.findViewById(R.id.tvCargo);
        TextView tvCompania = cv.findViewById(R.id.tvCompania);
        ImageView imFoto = cv.findViewById(R.id.imFoto);


        tvNombre.setText(e.getEmpleado());
        tvCargo.setText(e.getCargo());
        tvCompania.setText(e.getCompania());
        imFoto.setImageResource(e.getFotografia());

        return cv;
    }
}
