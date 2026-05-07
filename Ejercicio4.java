package resol.TestaP;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio4 {

    public static void ejecutar(Scanner sc) {
        System.out.println("Ingrese la primera fecha:");
        System.out.print("Anio: ");
        int anio1 = Integer.parseInt(sc.nextLine());

        System.out.print("Mes: ");
        int mes1 = Integer.parseInt(sc.nextLine());

        System.out.print("Dia: ");
        int dia1 = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese la segunda fecha:");
        System.out.print("Anio: ");
        int anio2 = Integer.parseInt(sc.nextLine());

        System.out.print("Mes: ");
        int mes2 = Integer.parseInt(sc.nextLine());

        System.out.print("Dia: ");
        int dia2 = Integer.parseInt(sc.nextLine());

        LocalDate fecha1 = LocalDate.of(anio1, mes1, dia1);
        LocalDate fecha2 = LocalDate.of(anio2, mes2, dia2);

        if (fecha1.isBefore(fecha2)) {
            long dias = calcularDiasEntreFechas(fecha1, fecha2);
            System.out.println("La cantidad de dias entre ambas fechas es: " + dias);
        } else {
            System.out.println("Error: la primera fecha debe ser anterior a la segunda.");
        }
    }

    public static long calcularDiasEntreFechas(LocalDate fecha1, LocalDate fecha2) {
        return ChronoUnit.DAYS.between(fecha1, fecha2);
    }
}