package com.github.afranken.chapter1.question4;

public class SpaceReplacer {

    public static char[] replace(char[] array) {
        boolean skipWhitespace = true;
        int currentIndex = array.length-1;

        for (int i = array.length-1; i >= 0 ; i--) {
            char c = array[i];
            if (c != ' ') {
                skipWhitespace = false;
                currentIndex = replace(array, c, currentIndex);
            }
            if (c == ' ') {
                if (!skipWhitespace) {
                    currentIndex = replace(array, '0', currentIndex);
                    currentIndex = replace(array, '2', currentIndex);
                    currentIndex = replace(array, '%', currentIndex);
                } else {
                    //skip
                }
            }
        }

        return array;
    }

    private static int replace(char[] array, char c, int index) {
        array[index] = c;
        return --index;
    }
}
