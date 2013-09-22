package com.github.afranken.chapter1.question2;

import org.junit.Test;

import static com.github.afranken.chapter1.question2.StringReverser.reverseString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Tests for {@link StringReverser}
 */
public class StringReverserTest {

  private static final String ORIGINAL = "abcdefgh";
  private static final String REVERSED = "hgfedcba";

  @Test
  public void testReverseString() {

    char[] actual = ORIGINAL.toCharArray();
    reverseString(actual);

    assertThat(REVERSED.toCharArray(), is(equalTo(actual)));

  }

}
