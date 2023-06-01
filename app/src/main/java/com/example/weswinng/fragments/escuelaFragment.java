package com.example.weswinng.fragments;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.weswinng.bigAct;
import com.example.weswinng.R;


public class escuelaFragment extends Fragment {
    View vista;
    Button soyProfesor, profes;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista =  inflater.inflate(R.layout.fragment_escola, container, false);
        ((bigAct) getActivity()).changeTitle("Escuela");
        soyProfesor = vista.findViewById(R.id.escola_socprofessor);
        soyProfesor.setOnClickListener(v -> {
            DialogFragment avis = new avisoFragment();
            avis.show(getChildFragmentManager(), "AVISO");
        });


        profes = vista.findViewById(R.id.escola_btn_profes);
        profes.setOnClickListener(v -> {
            ((bigAct) getActivity()).replaceFragmentMoguda(new asistenciaFragment());
            ((bigAct) getActivity()).changeTitle("Profesores");
        });



        return vista;
    }
}