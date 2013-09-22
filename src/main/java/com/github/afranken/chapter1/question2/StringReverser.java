package com.github.afranken.chapter1.question2;

/**
 * Implements question 1.2 in Java
 */
public class StringReverser {

  private StringReverser(){
    //private constructor for helper classes
  }

  /**
   * Reverse string in char array in place.
   * @param string
   */
  public static void reverseString(char[] string) {

    //the last character in the string is the first to replace
    int toReplace = string.length-1;

    //switch first and last char, then move one element further into the middle.
    for(int i = 0; i < 4; i++) {
      char temp = string[toReplace];
      string[toReplace] = string[i];
      string[i] = temp;
      toReplace = toReplace - 1;
    }

  }

}
