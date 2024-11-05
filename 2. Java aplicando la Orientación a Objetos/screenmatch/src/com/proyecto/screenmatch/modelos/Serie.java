package com.proyecto.screenmatch.modelos;

public class Serie extends Titulo{


    private int temporadas;
    private int episodiosPopTemporada;
    private int minutosPorEpisodio;

    //sobreescritura de metodos
    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPopTemporada * minutosPorEpisodio;
    }


    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPopTemporada() {
        return episodiosPopTemporada;
    }

    public void setEpisodiosPopTemporada(int episodiosPopTemporada) {
        this.episodiosPopTemporada = episodiosPopTemporada;
    }
}

