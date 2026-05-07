package resol.TestaP;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();

        System.out.print("Ingrese el caracter a buscar: ");
        char caracter = sc.nextLine().charAt(0);

        ResultadoBusqueda resultado = buscarCaracter(texto, caracter);

        System.out.println("Posiciones donde aparece el caracter '" + caracter + "':");

        if (resultado.posiciones.isEmpty()) {
            System.out.println("El caracter no aparece en el texto.");
        } else {
            for (int posicion : resultado.posiciones) {
                System.out.println("Indice: " + posicion);
            }
        }

        System.out.println("La letra '" + caracter + "' representa el "
                + resultado.porcentaje + "% del texto.");
    }

    public static ResultadoBusqueda buscarCaracter(String texto, char caracter) {
        ArrayList<Integer> posiciones = new ArrayList<>();

        char caracterBuscado = Character.toLowerCase(caracter);

        for (int i = 0; i < texto.length(); i++) {
            char actual = Character.toLowerCase(texto.charAt(i));

            if (actual == caracterBuscado) {
                posiciones.add(i);
            }
        }

        double porcentaje = 0;

        if (texto.length() > 0) {
            porcentaje = ((double) posiciones.size() / texto.length()) * 100;
        }

        return new ResultadoBusqueda(posiciones, porcentaje);
    }

    public static class ResultadoBusqueda {
        ArrayList<Integer> posiciones;
        double porcentaje;

        public ResultadoBusqueda(ArrayList<Integer> posiciones, double porcentaje) {
            this.posiciones = posiciones;
            this.porcentaje = porcentaje;
        }
    }
}