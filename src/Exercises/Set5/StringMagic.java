package Exercises.Set5;

public class StringMagic {
    /**
     * This method counts the number of uppercase letters in a given string.
     *
     * @param str The string to count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public int countUppercaseLetters(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;

        for (int i=0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasConsecutiveDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i=0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }

        int lastDigit = -1;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isDigit(str.charAt(i))) {
                return Character.getNumericValue(str.charAt(i));
            }
        }

        return lastDigit;
    }
}
