package Exercises.Set6;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic {
    /**
     * This method returns all factors of a given number in an ArrayList.
     *
     * @param number the number to find factors of
     * @return a List of factors of the number
     */
    public List<Integer> determineAllFactors(int number) {
        List<Integer> factors = new ArrayList<Integer>();

        if (number <= 0) {
            return factors;
        }

        factors.add(1);

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }

        return factors;
    }

    /**
     * This method generates a list of multiples of a given number less than a specified limit.
     *
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public List<Integer> determineMultiples(int number, int limit) {
        List<Integer> factors = new ArrayList<Integer>();

        if ( number <= 0 || limit <= 0) {
            return factors;
        }

        for (int i = 1; number*i < limit; i++) {
            factors.add(number*i);
        }

        return factors;
    }
}
