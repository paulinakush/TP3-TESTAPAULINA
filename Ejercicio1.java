package resol.TestaP;

import java.util.Scanner;

public class Ejercicio1 {

    public static void ejecutar(Scanner sc) {
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Numeros primos encontrados:");

        boolean hayPrimos = false;

        for (int numero : numeros) {
            if (esPrimo(numero)) {
                System.out.println(numero);
                hayPrimos = true;
            }
        }

        if (hayPrimos) {
            double promedio = calcularPromedioPrimos(numeros);
            System.out.println("El promedio de los numeros primos es: " + promedio);
        } else {
            System.out.println("No se ingresaron numeros primos.");
        }
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calcularPromedioPrimos(int[] numeros) {
        int suma = 0;
        int cantidad = 0;

        for (int numero : numeros) {
            if (esPrimo(numero)) {
                suma += numero;
                cantidad++;
            }
        }

        if (cantidad == 0) {
            return 0;
        }

        return (double) suma / cantidad;
    }
}