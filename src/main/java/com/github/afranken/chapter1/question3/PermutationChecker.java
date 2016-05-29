package com.github.afranken.chapter1.question3;

import java.util.Arrays;

/**
 * Implements question 3
 */
public class PermutationChecker {

    private PermutationChecker() {
        //private constructor for helper classes
    }

    public static boolean isPermutationSorted(String s1, String s2) {
        if (!stringsHaveSameLength(s1, s2)){
            return false;
        }

        String sorted1 = sort(s1);
        String sorted2 = sort(s2);

        return sorted1.equals(sorted2);
    }

    public static boolean isPermutation(String s1, String s2) {
        if (!stringsHaveSameLength(s1, s2)){
            return false;
        }

        //assuming s1 and s2 are made up of ASCII chars
        int[] chars = new int[256];

        for (char char1 : s1.toCharArray()) {
            chars[char1]++;
        }

        for (char char2 : s2.toCharArray()) {
            if (--chars[char2] < 0) {
                return false;
            }
        }

        return true;
    }

    private static String sort(String toSort) {
        char[] chars = toSort.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    /**
     * strings can only be permutations if the lengths match.
     */
    private static boolean stringsHaveSameLength(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        return true;
    }

}
