package com.example.weswinng.Objects;

public class novetat {
    private int foto;
    private String descripcion;
    private String horas;

    public novetat(int foto, String descripcio, String hores) {
        this.foto = foto;
        this.descripcion = descripcio;
        this.horas = hores;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }
}
