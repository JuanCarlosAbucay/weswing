package com.example.weswinng.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.weswinng.Objects.mogudaObject;
import com.example.weswinng.R;
import com.example.weswinng.adaptadores.adapterCalendario;

import java.util.ArrayList;
import java.util.List;


public class calendario extends Fragment {
    View vista;
    TextView amigos, asistencia, todo;
    TextView filtros;
    RecyclerView movidas;

    List<TextView> tvs = new ArrayList<>();

    public static calendario newInstance(String param1, String param2) {
        calendario fragment = new calendario();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_calendari, container, false);

        init();
        initRecyclerTots();

        return vista;
    }

    public void init() {
        amigos = vista.findViewById(R.id.amicsBTN);
        amigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickTV(amigos);
                initRecyclerAmics();
            }
        });

        asistencia = vista.findViewById(R.id.asistireBTN);
        asistencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickTV(asistencia);
                initRecyclerAssistire();
            }
        });


        todo = vista.findViewById(R.id.totsBTN);
        todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickTV(todo);
                initRecyclerTots();
            }
        });
        tvs.add(amigos);
        tvs.add(asistencia);
        tvs.add(todo);

        filtros = vista.findViewById(R.id.filtresTV);
        movidas = vista.findViewById(R.id.recyclerMogudes);
    }

    public void initRecyclerTots() {
        List<mogudaObject> mos = new ArrayList<>();

        mos.add(new mogudaObject("29 de febrero de 2077", "Nahuel me debes 8€", R.drawable.icono, "Metro Boomin want some more nib", "Madrid, Spain", "17/04/2017-18/04/2017 | 6horas", "39 assistents | 0 amics"));
        mos.add(new mogudaObject("1 de abril de 2018", "Domingo Faceit", R.drawable.icono, "Metro Boomin want some more nib", "Madrid, Spain", "18/04/2017-18/04/2017 | 9horas", "64 assistents | 0 amics"));
        mos.add(new mogudaObject("19 de junio de 2021", "DAM Experience", R.drawable.icono, "Metro Boomin want some more nib", "Madrid, Spain", "19/04/2017-18/04/2017 | 3horas", "20 assistents | 0 amics"));
        mos.add(new mogudaObject("1 de septiembre de 2019", "Bury the light deep within", R.drawable.icono, "Metro Boomin want some more nib", "Madrid, Spain", "1/05/2017-2/04/2017 | 5horas", "10 assistents | 0 amics"));
        mos.add(new mogudaObject("5 de mayo de 2010", "Kanye West Instagram Freestyle", R.drawable.icono, "Metro Boomin want some more nib", "Madrid, Spain", "5/05/2017-16/04/2017 | 9horas", "2 assistents | 0 amics"));
        mos.add(new mogudaObject("7 de marzo de 2022", "Joel clase de botanica", R.drawable.icono, "Metro Boomin want some more nib", "Madrid, Spain", "7/05/2017-8/04/2017 | 6horas", "90 assistents | 0 amics"));


        adapterCalendario adapter = new adapterCalendario(mos);
        movidas.setLayoutManager(new LinearLayoutManager(vista.getContext(), LinearLayoutManager.VERTICAL, false));
        movidas.setAdapter(adapter);


    }

    public void initRecyclerAmics() {
        List<mogudaObject> mos = new ArrayList<>();

        mos.add(new mogudaObject("29 de febrero de 2077", "Swinging boys", R.drawable.icono, "Organizado por los Swinging Boys", "Barcelona, Spain", "29/02/2077 | 1hora", "1 assistents | 1 amics"));
        mos.add(new mogudaObject("19 de junio de 2021", "Los chicos de la calle de atras", R.drawable.icono, "Organizado por Vinicius Jr Balón de oro", "Madrid, Spain", "19/06/2017-19/06/2017 | 8horas", "79 assistents | 4 amics"));
        mos.add(new mogudaObject("7 de marzo de 2022", "Monos del artico", R.drawable.icono, "Organizado por Lionel Messi Balón de oro x8", "Madrid, Spain", "7/03/2017-7/03/2017 | 9horas", "60 assistents | 9 amics"));


        adapterCalendario adapter = new adapterCalendario(mos);
        movidas.setLayoutManager(new LinearLayoutManager(vista.getContext(), LinearLayoutManager.VERTICAL, false));
        movidas.setAdapter(adapter);


    }

    public void initRecyclerAssistire() {
        List<mogudaObject> mos = new ArrayList<>();

        mos.add(new mogudaObject("23 de abril de 2023", "Voy a explotar", R.drawable.icono, "Organitzat per Marco Laureano Gutierrez", "Madrid, Spain", "23/04/2023-23/04/2023 | 8horas", "8 assistents | 4 amics"));


        adapterCalendario adapter = new adapterCalendario(mos);
        movidas.setLayoutManager(new LinearLayoutManager(vista.getContext(), LinearLayoutManager.VERTICAL, false));
        movidas.setAdapter(adapter);


    }

    public void clickTV(TextView clicked) {
        clicked.setTextColor(getResources().getColor(R.color.white));
        clicked.setBackgroundColor(getResources().getColor(R.color.tematicRed));

        for (TextView tv :
                tvs) {
            if (tv.equals(clicked)) {
                tv.setTextColor(getResources().getColor(R.color.white));
                tv.setBackgroundColor(getResources().getColor(R.color.tematicRed));
            } else {
                tv.setTextColor(getResources().getColor(R.color.textgrey));
                tv.setBackgroundColor(getResources().getColor(R.color.grey));

            }

        }
    }
}