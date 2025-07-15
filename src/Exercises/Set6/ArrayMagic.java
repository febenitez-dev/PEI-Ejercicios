package Exercises.Set6;

public class ArrayMagic {
    /**
     * This method determines whether there's an element greater than a given number in an array.
     *
     * @param array The array to search through.
     * @param number The number to compare with the array elements.
     * @return True if there's an element greater than the given number in the array, false otherwise.
     */
    public boolean doesHaveElementGreaterThan(int[] array, int number) {
        for (int value : array) {
            if (value > number) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method finds and returns the second largest element in the given array.
     *
     * @param array the array in which to find the second largest element
     * @return the second largest element in the array
     */

    public int findSecondLargestElement(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int largestElement = Integer.MIN_VALUE;
        int sndLargestElement = Integer.MIN_VALUE;

        for (int value : array) {
            if (value > largestElement) {
                sndLargestElement = largestElement;
                largestElement = value;
            } else if (value > sndLargestElement && value != largestElement) {
                sndLargestElement = value;
            }
        }

        if (sndLargestElement == Integer.MIN_VALUE) {
            return -1;
        }

        return sndLargestElement;
    }

    /**
     * This method checks if the input array is sorted in ascending order.
     *
     * @param array the array to check
     * @return true if the array is sorted, false otherwise
     */
    public boolean isSorted(int[] array) {
        if (array == null) {
            return true;
        }

        for (int i=0; i < array.length - 1; i++) {
            if (array[i+1] < array[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * This method reverses an array.
     *
     * @param array the array to reverse
     * @return a new array with elements in reverse order
     */
    public int[] reverseArray(int[] array) {
        if (array == null) {
            return null;
        }

        int aux;
        for (int i = 0; i < array.length / 2; i++) {
            aux = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = aux;
        }

        return array;
    }
}
