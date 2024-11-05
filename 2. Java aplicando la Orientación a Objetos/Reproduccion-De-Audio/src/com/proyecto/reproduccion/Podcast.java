package com.proyecto.reproduccion;

public class Podcast extends Audio {

    private String presentador;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if(getTotalDeReproduccion() >= 200) {
            return 9;
        } else {
            return 2;
        }
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
