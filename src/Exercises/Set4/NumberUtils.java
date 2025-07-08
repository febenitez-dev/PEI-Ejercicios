package Exercises.Set4;

public class NumberUtils {

    public static int getLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        return number % 10;
    }

    /**
     * This method calculates and returns the number of digits in a given integer.
     * If the number is negative, it returns -1.
     * If the number is zero, it returns 1 as zero is considered to have one digit.
     * @param number: an integer
     * @return number of digits in number, or -1 if number is negative, or 1 if number is zero.
     */
    public static int getNumberOfDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int digits = number == 0 ? 1 : 0;

        while (number > 0) {
            number = number / 10;
            digits++;
        }
        return digits;
    }

    public static int getSumOfDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            sum += (number % 10);

            number = number / 10;
        }

        return sum;
    }

    /**
     * This method reverses a given integer and returns the reversed number.
     * If the number is negative, it returns -1 as the reverse of a negative number is undefined.
     * If the number is zero, it returns 0 as the reverse of 0 is 0.
     * @param number: an integer
     * @return reversed number, or -1 if number is negative, or 0 if number is zero.
     */
    public int reverseNumber(int number) {
        if (number < 0) {
            return -1;
        }

        int reversedNumber = 0;

        while (number > 0) {
            int digit = (number % 10);

            reversedNumber = reversedNumber * 10 + digit;

            number = number / 10;
        }

        return reversedNumber;
    }
}
