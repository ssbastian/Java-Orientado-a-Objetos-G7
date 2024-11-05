package com.proyecto.principal;

import com.proyecto.reproduccion.Cancion;
import com.proyecto.reproduccion.MisFavoritos;
import com.proyecto.reproduccion.Podcast;

public class Main {
    public static void main(String[] args) {

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Cafe.Tech");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i < 200; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total reproducciones: " + miCancion.getTotalDeReproduccion());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.Adiciona(miPodcast);
        favoritos.Adiciona(miCancion);
    }

}