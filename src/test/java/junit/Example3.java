package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Example3 {
    @Test
    public void testAssertEquals() {
        assertEquals(64, 2*32); //PASS
        assertEquals(1,2); //FAIL

    }

    @Test
    public void testAssertTrueFalse(){
        assertTrue(3 == 3); // PASS assertEquals (3, 3)
        assertFalse("Hello".equals("Not Hello")); // PASS
    }

    @Test
    public void testArrayEquals() {
        int[] first = {1,2,3};
        int[] second = {4,5,6};
        assertArrayEquals(first, second, "Arrays are not equal"); //FAIL
    }

    @Test
    public void testAssertNull() {
        String s = null;
        assertNull(s); //PASS
    }

    @Test
    public void testAssertSame() {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        assertSame(c1, c2); // FAIL
    }

    //TODO: Please investigate why these two s1 and s2 String objects holding the same value are equal brlow?
    //Hint: Google "Java String Pool"

    @Test
    public void testAssertSameForStrings() {
        String s1 = "abc";
        String s2 = "abc";
        assertSame(s1, s2); // PASS
    }
}
