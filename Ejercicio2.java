package resol.TestaP;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el valor de N para la matriz cuadrada NxN: ");
        int n = Integer.parseInt(sc.nextLine());

        int[][] matriz = new int[n][n];

        llenarMatriz(matriz);
        mostrarMatriz(matriz);

        int sumaPrincipal = sumarDiagonalPrincipal(matriz);
        int sumaSecundaria = sumarDiagonalSecundaria(matriz);
        int mayor = Math.max(sumaPrincipal, sumaSecundaria);

        System.out.println("Suma de la diagonal principal: " + sumaPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaSecundaria);

        if (sumaPrincipal == sumaSecundaria) {
            System.out.println("Ambas diagonales tienen la misma suma.");
        } else {
            System.out.println("La suma mayor es: " + mayor);
        }
    }

    public static void llenarMatriz(int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz generada:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int sumarDiagonalPrincipal(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }

        return suma;
    }

    public static int sumarDiagonalSecundaria(int[][] matriz) {
        int suma = 0;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];
        }

        return suma;
    }
}