package resol.TestaP;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== TRABAJO PRACTICO 3 =====");
            System.out.println("1. Ejercicio 1 - Numeros primos y promedio");
            System.out.println("2. Ejercicio 2 - Matriz y diagonales");
            System.out.println("3. Ejercicio 3 - Buscar caracter en texto");
            System.out.println("4. Ejercicio 4 - Dias entre fechas");
            System.out.println("5. Ejercicio 5 - Decimal a binario");
            System.out.println("6. Ejercicio 6 - Cifrado Cesar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    Ejercicio1.ejecutar(sc);
                    break;
                case 2:
                    Ejercicio2.ejecutar(sc);
                    break;
                case 3:
                    Ejercicio3.ejecutar(sc);
                    break;
                case 4:
                    Ejercicio4.ejecutar(sc);
                    break;
                case 5:
                    Ejercicio5.ejecutar(sc);
                    break;
                case 6:
                    Ejercicio6.ejecutar(sc);
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }

            System.out.println();

        } while (opcion != 0);

        sc.close();
    }
}