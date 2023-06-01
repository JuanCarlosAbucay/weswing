package com.example.weswinng.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.weswinng.R;


public class avisoFragment extends DialogFragment {
    TextView mensaje;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = requireActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.avis, null);

        builder.setPositiveButton("De acuerdo", (DialogInterface.OnClickListener) (dialog, id) -> {})
                .setNegativeButton("Cancela", (DialogInterface.OnClickListener) (dialog, id) -> {});

        builder.setView(v);

        mensaje = v.findViewById(R.id.avis_msg);
        mensaje.setText("Se notificara a la escuela que quieres registrarte como profesor");

        return builder.create();
    }
}