package resol.TestaP;

import java.util.Scanner;

public class Ejercicio6 {

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el mensaje a cifrar: ");
        String mensaje = sc.nextLine();

        System.out.print("Ingrese el desplazamiento: ");
        int desplazamiento = Integer.parseInt(sc.nextLine());

        String mensajeCifrado = cifrarCesar(mensaje, desplazamiento);

        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);
    }

    public static String cifrarCesar(String mensaje, int desplazamiento) {
        String resultado = "";

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);

            if (caracter >= 'a' && caracter <= 'z') {
                char nuevoCaracter = (char) ('a' + (caracter - 'a' + desplazamiento) % 26);
                resultado += nuevoCaracter;
            } else if (caracter >= 'A' && caracter <= 'Z') {
                char nuevoCaracter = (char) ('A' + (caracter - 'A' + desplazamiento) % 26);
                resultado += nuevoCaracter;
            } else {
                resultado += caracter;
            }
        }

        return resultado;
    }
}