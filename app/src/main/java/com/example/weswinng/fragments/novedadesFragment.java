package com.example.weswinng.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.weswinng.bigAct;
import com.example.weswinng.Objects.novetat;
import com.example.weswinng.R;
import com.example.weswinng.adaptadores.adapterNovedades;
import com.example.weswinng.listener.selectListenerNovetats;

import java.util.ArrayList;
import java.util.List;


public class novedadesFragment extends Fragment implements selectListenerNovetats {
    List<novetat> novedades;
    RecyclerView novedadesRecycler;
    adapterNovedades novetatsAdapter;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista=  inflater.inflate(R.layout.fragment_novetats, container, false);
        novedadesRecycler = vista.findViewById(R.id.recyclerNovetats);
        StartRecycler();


        return vista;
    }

    public void StartRecycler(){
        novedades = new ArrayList<>();
        novedades.add(new novetat(R.drawable.icono,"La más mala de España soy yo. Llego a la disco, me salto la fila","Fa 10h"));
        novedades.add(new novetat(R.drawable.icono,"La más mala de España soy yo. Llego a la disco, me salto la fila","Fa 15h"));
        novedades.add(new novetat(R.drawable.icono,"La más mala de España soy yo. Llego a la disco, me salto la fila","Fa 19h"));
        novedades.add(new novetat(R.drawable.icono,"La más mala de España soy yo. Llego a la disco, me salto la fila","Fa 20h"));
        novedades.add(new novetat(R.drawable.icono,"La más mala de España soy yo. Llego a la disco, me salto la fila","Fa 21h"));
        novedades.add(new novetat(R.drawable.icono,"La más mala de España soy yo. Llego a la disco, me salto la fila","Fa 22h"));
        novedades.add(new novetat(R.drawable.icono,"La más mala de España soy yo. Llego a la disco, me salto la fila","Fa 23h"));
        novedades.add(new novetat(R.drawable.icono,"La más mala de España soy yo. Llego a la disco, me salto la fila","Fa 24h"));
        novedades.add(new novetat(R.drawable.icono,"La más mala de España soy yo. Llego a la disco, me salto la fila","Fa 25h"));

        novetatsAdapter = new adapterNovedades(novedades,this);
        novedadesRecycler.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        novedadesRecycler.setHasFixedSize(true);
        novedadesRecycler.setAdapter(novetatsAdapter);
    }

    @Override
    public void onItemClicked(novetat novetat) {
        ((bigAct)getActivity()).replaceFragmentMoguda(new mogudaFragment());

    }
}