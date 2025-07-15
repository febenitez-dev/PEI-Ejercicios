package Exercises.Set8;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Arrays;

public class StringMagic {

    public boolean areAnagrams(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return false;
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArrayStr1 = str1.toLowerCase().toCharArray();
        char[] charArrayStr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(charArrayStr1);
        Arrays.sort(charArrayStr2);

        return Arrays.equals(charArrayStr1, charArrayStr2);
    }

    public String reverseWordsInSentence(String sentence) {
        if (sentence == null) {
            return "INVALID";
        }

        if (sentence.isEmpty()) {
            return "";
        }

         String[] words = sentence.split(" ");

        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}
