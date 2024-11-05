package com.proyecto.reproduccion;

public class Audio {
    private String titulo;
    private float duracion;
    private int totalDeReproduccion;
    private int totalDeMeGusta;
    private int clasificacion;


    public void meGusta() {
        this.totalDeMeGusta++;
    }

    public void reproduce () {
        this.totalDeReproduccion++;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }


    public int getTotalDeReproduccion() {
        return totalDeReproduccion;
    }

    public void setTotalDeReproduccion(int totalDeReproduccion) {
        this.totalDeReproduccion = totalDeReproduccion;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }
}
