package com.example.weswinng.adaptadores;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weswinng.Objects.novetat;
import com.example.weswinng.R;
import com.example.weswinng.listener.selectListenerNovetats;

import java.util.List;

public class adapterNovedades extends RecyclerView.Adapter<adapterNovedades.MyViewHolder> {

    private List<novetat> novedadesList;
    private selectListenerNovetats listenerMovida;

    public adapterNovedades(List<novetat> novetatsList, selectListenerNovetats listenerMoguda) {
        this.novedadesList = novetatsList;
        this.listenerMovida = listenerMoguda;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_moguda_feed,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bindData(novedadesList.get(position));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listenerMovida.onItemClicked(novedadesList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return novedadesList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView fotoPerfil;
        TextView descripcion;
        TextView horas;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            fotoPerfil = itemView.findViewById(R.id.pfpMoguda);
            descripcion = itemView.findViewById(R.id.mogudaTxt);
            horas = itemView.findViewById(R.id.horesTxt);
            cardView = itemView.findViewById(R.id.cardView);

        }

        void bindData(final novetat novetat){
            fotoPerfil.setImageResource(novetat.getFoto());
            descripcion.setText(novetat.getDescripcion());
            horas.setText(novetat.getHoras());
        }
    }
}
