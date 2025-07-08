package Exercises.Set4;

public class BiNumber {
    private int number1;
    private int number2;

    /**
     * Constructor that initializes the two numbers.
     * @param number1 The first number.
     * @param number2 The second number.
     */
    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    /**
     * Calculates and returns the least common multiple (LCM) of the two numbers.
     * If either number is negative, returns -1 as the LCM for negative numbers is undefined.
     * If either number is zero, returns 0 as the LCM of 0 and any other number is 0.
     * @return LCM of the two numbers, or -1 if either number is negative, or 0 if either number is zero.
     */
    public int calculateLCM() {
        if (number1 < 0 || number2 < 0) {
            return -1;
        }

        if (number1 == 0 || number2 == 0) {
            return 0;
        }

        int lcm = Math.max(number1, number2);

        while (true) {
            if (lcm % number1 == 0 && lcm % number2 == 0) {
                return lcm;
            }
            lcm++;
        }
    }

    /**
     * Calculates and returns the greatest common divisor (GCD) of the two numbers.
     * Edge case: If either number is negative, returns 1 as the GCD for negative numbers is 1.
     * Edge case: If either number is zero, returns 0 as the GCD of 0 and any other number is 0.
     * Edge case: If two numbers are equal, returns the number as the GCD of two equal numbers is the number itself.
     * @return GCD of the two numbers, or 1 if either number is negative, or 0 if either number is zero.
     */
    public int calculateGCD() {
        if (number1 < 0 || number2 < 0) {
            return 1;
        }

        if (number1 == 0 || number2 == 0) {
            return 0;
        }

        if (number1 == number2) {
            return number1;
        }

        int gcd = 1;

        for (int i = 1; i < number1 && i < number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}

