package com.github.afranken.chapter1.question1;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements question 1.1
 *
 * This helper class contains methods to determine if a string has only unique characters.
 */
public class CharacterHelper {

  /**
   * Implement first part of the question.
   *
   * check whether the given String contains a unique character sequence.
   *
   * @param testString the string to test
   *
   * @return true if characters are unique
   */
  protected boolean containsOnlyUniqueCharacters(String testString) {
    boolean unique = false;

    List<Character> encounteredChars = new ArrayList<>();

    for(char c : testString.toCharArray()) {
      if(!encounteredChars.contains(c)) {
        encounteredChars.add(c);
        unique = true;
      }
      else {
        unique = false;
        break;
      }
    }

    return unique;
  }


  /**
   * Implement second part of the question.
   *
   * check whether the given String contains a unique character sequence without additional data structures
   *
   * @param testString the string to test
   *
   * @return true if characters are unique
   */
  protected boolean containsOnlyUniqueCharactersWithoutDatastructure(String testString) {
    boolean unique = true;

    for(int i = 0; i < testString.length(); i++) {

      char c = testString.charAt(i);

      for(int j = 0; j < testString.length(); j++) {

        //skip position of char c
        if(i != j) {

          if(c == testString.charAt(j)) {
            unique = false;
          }

        }

      }

    }

    return unique;
  }

}
