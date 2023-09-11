package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }
    @Test
    public void StringWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[lauchcode]"));
    }
    @Test
    public void onlyOpenBracketsReturnsFalse()
    {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[code"));
    }
    @Test
    public void onlyCloseBracketsReturnsFalse()
    {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void mismatchBracketsReturnsFalse()
    {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void unequalBracketsReturnsFalse()
    {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[]"));
    }
    @Test
    public void twoBracketsReturnsTrue()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void withinBracketsReturnsTrue()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void bracketsOfBracketsWithinBracketsReturnsTrue()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][]"));
    }
    @Test
    public void tripleBracketsWithinBracketsReturnsTrue()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
    @Test
    public void twoTripleBracketsWithinBracketsReturnsTrue()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][]]]"));
    }

}