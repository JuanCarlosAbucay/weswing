package com.example.weswinng.Objects;

public class mogudaObject {
    String diaTop;
    String titulo;
    int idImagen;
    String organizado;
    String lugar;
    String duracion;
    String asistentes;

    public mogudaObject(String dataTop, String title, int imageID, String organitzat, String lloc, String duracio, String assistents) {
        this.diaTop = dataTop;
        this.titulo = title;
        this.idImagen = imageID;
        this.organizado = organitzat;
        this.lugar = lloc;
        this.duracion = duracio;
        this.asistentes = assistents;
    }

    public mogudaObject() {
    }

    public String getDiaTop() {
        return diaTop;
    }

    public void setDiaTop(String diaTop) {
        this.diaTop = diaTop;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getOrganizado() {
        return organizado;
    }

    public void setOrganizado(String organizado) {
        this.organizado = organizado;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(String asistentes) {
        this.asistentes = asistentes;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}


