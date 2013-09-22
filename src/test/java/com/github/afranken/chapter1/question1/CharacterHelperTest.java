package com.github.afranken.chapter1.question1;

import org.junit.Test;

import static com.github.afranken.chapter1.question1.CharacterHelper.containsOnlyUniqueCharacters;
import static com.github.afranken.chapter1.question1.CharacterHelper.containsOnlyUniqueCharactersWithoutDatastructure;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Tests for {@link com.github.afranken.chapter1.question1.CharacterHelper}
 */
public class CharacterHelperTest {

  @Test
  public void testOnlyUniqueCharacters(){

    String unique = "uniq";
    assertTrue("unique string", containsOnlyUniqueCharacters(unique));

    String nonUnique = "aaabbb";
    assertFalse("non-unique string", containsOnlyUniqueCharacters(nonUnique));
  }

  @Test
  public void testOnlyUniqueCharactersWithoutDatastructure(){

    String unique = "uniq";
    assertTrue("unique string", containsOnlyUniqueCharactersWithoutDatastructure(unique));

    String nonUnique = "aaabbb";
    assertFalse("non-unique string", containsOnlyUniqueCharactersWithoutDatastructure(nonUnique));
  }

}
