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
    public void regularBracketsPasses(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void regularBracketsNotInWordPasses(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void noBracketsPasses(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void justBracketsPasses(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void muliplePairsPasses(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }
    @Test
    public void regularBracketsInMiddlePasses(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void singleBracketFails(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));

    }

    @Test
    public void singleBracketNoWordFails(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));

    }
    @Test
    public void reversedBracketNoWordFails(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));

    }
@Test
    public void reversedBracketsFails(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
}

    @Test
    public void multipleReversedBracketsFails(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][][]["));
    }
}