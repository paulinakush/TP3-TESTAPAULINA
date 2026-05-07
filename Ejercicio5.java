package resol.TestaP;

import java.util.Scanner;

public class Ejercicio5 {

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese un numero entero positivo: ");
        int decimal = Integer.parseInt(sc.nextLine());

        if (decimal < 0) {
            System.out.println("Error: debe ingresar un numero positivo.");
        } else {
            String binario = convertirABinario(decimal);
            System.out.println("El numero " + decimal + " en binario es: " + binario);
        }
    }

    public static String convertirABinario(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        String binario = "";

        while (decimal > 0) {
            int resto = decimal % 2;
            binario = resto + binario;
            decimal = decimal / 2;
        }

        return binario;
    }
}