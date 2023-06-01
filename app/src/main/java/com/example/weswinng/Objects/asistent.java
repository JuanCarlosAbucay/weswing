package com.example.weswinng.Objects;

public class asistent {


    private String nombre;



    private int idPerfilFoto;


    public asistent(String name, int idProfilePic) {
        this.nombre = name;
        this.idPerfilFoto = idProfilePic;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPerfilFoto() {
        return idPerfilFoto;
    }

    public void setIdPerfilFoto(int idPerfilFoto) {
        this.idPerfilFoto = idPerfilFoto;
    }
}
