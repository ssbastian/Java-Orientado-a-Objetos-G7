package com.proyecto.screenmatch.calculos;
import com.proyecto.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return this.tiempoTotal;
    }
}
