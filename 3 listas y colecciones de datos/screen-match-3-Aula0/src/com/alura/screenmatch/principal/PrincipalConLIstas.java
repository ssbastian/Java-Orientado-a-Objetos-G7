package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConLIstas {
    public static void main(String[] args) {


        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Serie lost = new Serie("Lost", 2000);
        lost.evalua(8);
        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.evalua(9);
        var peliculaDeBruno = new Pelicula("El señór de los anillos",2021);
        peliculaDeBruno.evalua(10);


        List<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item);
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                /*Pelicula pelicula = (Pelicula) item;*/
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        System.out.println(listaDeArtistas);

        //Ordenar lista de artistas
        Collections.sort(listaDeArtistas);
        System.out.println("lista de artistas ordenada: " + listaDeArtistas);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("lista ordenada por fecha: " + lista);
    }
}
