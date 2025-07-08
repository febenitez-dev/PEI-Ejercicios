package Exercises.Set4;

public class FactorialCalculator {

    public static int calculateFactorial(int number) {
        if (number < 0) {
            return -1;
        }

        int fact = 1;

        for (int i=1; i<=number; i++) {
            fact*=i;
        }

        return fact;
    }
}
