import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nomCliente = "Tony Start";
        String tipoCuenta = "Corriente";
        double saldoDisponi = 1599.99;
        int opcion = 0;
        System.out.println("******************\n");
        System.out.println("Nombre del cliente: " + nomCliente);
        System.out.println("El tipo de cuenta es: " + tipoCuenta);
        System.out.println("Su saldo disponible es: " + saldoDisponi + "$");
        System.out.println("\n");

        String menu = """
                ******************************************
                ** Escriba el número de la opcion deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("El saldo actualizado en la cuenta es: " + saldoDisponi + "$");
                }
                break;
                case 2: {
                    double retiro = 0;
                    System.out.println("¿Cual es el valor que desea retirar?");
                    retiro = teclado.nextDouble();
                    if (saldoDisponi > retiro) {
                        saldoDisponi -= retiro;
                        System.out.println("El saldo actualizado en la cuenta es: " + saldoDisponi + "$");
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                }
                break;
                case 3: {
                    double deposito = 0;
                    System.out.println("¿Cual es el valor que desea depositar?");
                    deposito = teclado.nextDouble();
                    saldoDisponi += deposito;
                    System.out.println("El saldo actualizado en la cuenta es: " + saldoDisponi + "$");
                }
                break;
                case 9: {
                    System.out.println("saliendo____");
                }
                break;
                default: {
                    System.out.println("____Opcion invalida ____");
                }

            }
        }

    }
}