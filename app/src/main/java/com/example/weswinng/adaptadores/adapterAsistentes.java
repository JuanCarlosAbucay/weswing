package com.example.weswinng.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weswinng.Objects.asistent;
import com.example.weswinng.R;
import com.example.weswinng.listener.selectListenerProf;

import java.util.List;

public class adapterAsistentes extends  RecyclerView.Adapter<adapterAsistentes.MyViewHolder> {


    private List<asistent> asistentes;
    private selectListenerProf selectListenerProfesores;

    public adapterAsistentes(List<asistent> asistents, selectListenerProf selectListenerProfessors) {
        this.asistentes = asistents;
        this.selectListenerProfesores = selectListenerProfessors;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_asis, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bindData(asistentes.get(position));
        holder.cardView.setOnClickListener(v -> selectListenerProfesores.onItemClicked(asistentes.get(position)));
    }

    @Override
    public int getItemCount() {
        return asistentes.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView nombreProfesor;
        private ImageView perfilProfesor;
        private CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nombreProfesor = itemView.findViewById(R.id.tvNomProfessor);
            perfilProfesor = itemView.findViewById(R.id.pfpProfessor);
            cardView = itemView.findViewById(R.id.cardviewProfessor);
        }

        void bindData(final asistent asistent) {
            nombreProfesor.setText(asistent.getNombre());
            perfilProfesor.setImageResource(asistent.getIdPerfilFoto());
        }
    }
}
