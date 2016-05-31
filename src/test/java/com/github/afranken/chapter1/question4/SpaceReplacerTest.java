package com.github.afranken.chapter1.question4;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SpaceReplacerTest {
    private static final String ORIGINAL = "Mr John Smith    ";
    private static final String REPLACED = "Mr%20John%20Smith";

    @Test
    public void testReplace() {
        char[] replace = SpaceReplacer.replace(ORIGINAL.toCharArray());
        assertThat(new String(replace), is(REPLACED));
    }
}