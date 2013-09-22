package com.github.afranken.chapter1.question1;

import com.github.afranken.chapter1.question1.CharacterHelper;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Tests for {@link com.github.afranken.chapter1.question1.CharacterHelper}
 */
public class CharacterHelperTest {

  private static CharacterHelper testling = new CharacterHelper();

  @Test
  public void testOnlyUniqueCharacters(){

    String unique = "uniq";
    assertTrue("unique string",testling.containsOnlyUniqueCharacters(unique));

    String nonUnique = "aaabbb";
    assertFalse("non-unique string",testling.containsOnlyUniqueCharacters(nonUnique));
  }

  @Test
  public void testOnlyUniqueCharactersWithoutDatastructure(){

    String unique = "uniq";
    assertTrue("unique string",testling.containsOnlyUniqueCharactersWithoutDatastructure(unique));

    String nonUnique = "aaabbb";
    assertFalse("non-unique string",testling.containsOnlyUniqueCharactersWithoutDatastructure(nonUnique));
  }

}
