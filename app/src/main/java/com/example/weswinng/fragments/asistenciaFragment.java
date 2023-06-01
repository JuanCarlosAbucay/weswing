package com.example.weswinng.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.weswinng.bigAct;
import com.example.weswinng.Objects.asistent;
import com.example.weswinng.R;
import com.example.weswinng.adaptadores.adapterAsistentes;
import com.example.weswinng.listener.selectListenerProf;

import java.util.ArrayList;
import java.util.List;


public class asistenciaFragment extends Fragment implements selectListenerProf {
    List<asistent> asistentes;
    RecyclerView novedadesRecycler;
    adapterAsistentes adapterAsistentes;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista= inflater.inflate(R.layout.fragment_asisfragment, container, false);
        novedadesRecycler = vista.findViewById(R.id.recyclerAsis);
        ((bigAct) getActivity()).changeTitle("Assistentes");

        startRecycler();

        return vista;
    }

    public void startRecycler() {
        asistentes = new ArrayList<>();
        asistentes.add(new asistent("Juan Gomez Jurado", R.drawable.icono));
        asistentes.add(new asistent("Charles Bukowski", R.drawable.icono));
        asistentes.add(new asistent("Carmen Mola", R.drawable.icono));
        asistentes.add(new asistent("C.J Tudor", R.drawable.icono));

        adapterAsistentes = new adapterAsistentes(asistentes, this);
        novedadesRecycler.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        novedadesRecycler.setHasFixedSize(true);
        novedadesRecycler.setAdapter(adapterAsistentes);
    }

    @Override
    public void onItemClicked(asistent asistent) {

    }
}