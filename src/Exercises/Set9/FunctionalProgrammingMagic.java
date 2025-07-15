package Exercises.Set9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingMagic {
    /**
     * This method filters out the odd numbers from a given list of integers.
     * @param numbers This is the list of integers from which odd numbers are to be filtered out.
     * @return List<Integer> This returns a list of odd integers.
     */
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> (Math.abs(number)) % 2 == 1)
                .collect(Collectors.toList());
    }

    /**
     * This method generates the cubes of the first n natural numbers.
     * @param n The number of natural numbers for which cubes are to be calculated.
     * @return List<Integer> This returns a list of cubes of the first n natural numbers.
     */
    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        return IntStream
                .range(1, n+1)
                .boxed()
                .map(number -> number * number * number)
                .collect(Collectors.toList());
    }

    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        if (courses == null) {
            return new ArrayList<>();
        }

        return courses.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    public static long sumOfSquares(List<Integer> numbers) {
        if (numbers == null) {
            return 0;
        }

        return numbers.stream()
                .map(number -> number * number)
                .reduce(0, Integer::sum);
    }

    public static int findMaxEvenNumber(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .max(Integer::compare)
                .orElse(0);
    }
}
