package EjerciciosPropuestosFer;

public class AnioBisiesto {

    public static boolean esBisiesto(int year) {
        if(year < 0) {
            throw new AnioNegativo("No se puede calcular un año negativo");
        }

        boolean esBisiesto = year % 4 == 0 && year % 100 == 0;

        if (esBisiesto) {
            System.out.printf("El año %d es bisiesto", year).println();
        } else {
            System.out.printf("El año %d no es bisiesto", year).println();
        }

        return esBisiesto;
    }
}

