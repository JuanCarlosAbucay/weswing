package com.example.weswinng.adaptadores;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weswinng.Objects.mogudaObject;
import com.example.weswinng.R;

import android.view.LayoutInflater;


import java.util.List;

public class adapterCalendario extends RecyclerView.Adapter<adapterCalendario.MyviewHolder> {

    List<mogudaObject> mos;

    public adapterCalendario(List<mogudaObject> mos) {
        this.mos = mos;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyviewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_mogudes_calendar,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.bindData(mos.get(position));
    }

    @Override
    public int getItemCount() {
        return mos.size();
    }


    public class MyviewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView diaGran, titulo, asistentes, duracion, lugar, organizador;

        public MyviewHolder(@NonNull View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.IVperfil);
            diaGran = itemView.findViewById(R.id.TVData);
            titulo = itemView.findViewById(R.id.TitleTV);
            organizador = itemView.findViewById(R.id.OrganitzaTV);
            duracion = itemView.findViewById(R.id.duracio);
            lugar = itemView.findViewById(R.id.lloc);
            asistentes = itemView.findViewById(R.id.assistentsTV);

        }

        void bindData(final mogudaObject mo){
            imageView.setImageResource(mo.getIdImagen());
            diaGran.setText(mo.getDiaTop());
            titulo.setText(mo.getTitulo());
            organizador.setText(mo.getOrganizado());
            duracion.setText(mo.getDuracion());
            lugar.setText(mo.getLugar());
            asistentes.setText(mo.getAsistentes());

        }

    }

}
