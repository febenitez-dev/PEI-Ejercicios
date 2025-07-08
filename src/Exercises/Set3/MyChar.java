package Exercises.Set3;

public class MyChar {
    // Method to determine if a character is a vowel
    public static boolean isVowel(char ch) {

        // Use a switch statement to check for each vowel, both lowercase and uppercase
        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
