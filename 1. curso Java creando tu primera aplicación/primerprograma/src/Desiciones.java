public class Desiciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";
        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Peliculas más populares");
        }else{
            System.out.println("Peliculas Retro que aún vale la pena ver");
        }

        if (incluidoEnElPlan && tipoPlan.equals("plus")) {
            System.out.println("Disgrute de su pelicula");
        }else{
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
