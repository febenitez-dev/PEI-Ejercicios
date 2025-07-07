package EjerciciosPropuestosFer;

public class AnioBisiesto {

    public static boolean esBisiesto(int year) {
        if(year < 0) {
            throw new AnioNegativo("No se puede calcular un año negativo");
        }

        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }
}

