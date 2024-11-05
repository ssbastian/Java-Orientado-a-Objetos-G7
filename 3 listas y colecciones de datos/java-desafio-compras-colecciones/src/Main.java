import com.sebastian.desafio.modelos.Articulo;
import com.sebastian.desafio.modelos.Compra;
import com.sebastian.desafio.modelos.Tarjeta;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tarjeta tarjeta = new Tarjeta(100.0);



        List<Compra> lista= new ArrayList<>();
        Articulo articulo = new Articulo("zapato");
        Compra compra = new Compra(tarjeta, articulo, 100.0);
        lista.add(compra);
        System.out.println(lista);
    }





}