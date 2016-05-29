package com.github.afranken.chapter1.question3;

import org.junit.Test;

import static com.github.afranken.chapter1.question3.PermutationChecker.isPermutation;
import static com.github.afranken.chapter1.question3.PermutationChecker.isPermutationSorted;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Tests for {@link PermutationChecker}
 */
public class PermutationCheckerTest {

  private static final String ORIGINAL = "abcdefgh";
  private static final String PERMUTATION = "abcdhgfe";
  private static final String NO_PERMUTATION = "abdczzzz";
  private static final String NO_PERMUTATION_SHORT = "abdc";


  @Test
  public void testIsPermutation() {

    assertThat(isPermutation(ORIGINAL, NO_PERMUTATION_SHORT), is(false));

    assertThat(isPermutation(ORIGINAL, NO_PERMUTATION), is(false));

    assertThat(isPermutation(ORIGINAL, PERMUTATION), is(true));
  }

  @Test
  public void testIsPermutationSorted() {

    assertThat(isPermutationSorted(ORIGINAL, NO_PERMUTATION_SHORT), is(false));

    assertThat(isPermutationSorted(ORIGINAL, NO_PERMUTATION), is(false));

    assertThat(isPermutationSorted(ORIGINAL, PERMUTATION), is(true));
  }

}
