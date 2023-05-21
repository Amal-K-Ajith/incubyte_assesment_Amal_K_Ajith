package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.assertEquals;

public class StringCalTest {
    StringCalculator sc=new StringCalculator();
    @Test
    public void test1() throws Exception {
        assertEquals(0,sc.add(""));
        assertEquals(2,sc.add("1 1"));
        assertEquals(7,sc.add("3,4"));
        assertEquals(12,sc.add("3,4,5"));
        assertEquals(13,sc.add("12 1"));
        NegativeNotAllowedException thrown;
        thrown = Assertions.assertThrows(NegativeNotAllowedException.class, () -> {
            sc.add("3,-4");
        });
        assertEquals("Negative Not Allowed", thrown.getMessage());
        assertEquals(25,sc.add("10\n 12 \n 3"));
        assertEquals(20,sc.add("10\n 6,4"));
        assertEquals(3,sc.add("//;\n 1;2"));
        assertEquals(32,sc.add("//:\n10:12:10"));
        assertEquals(sc.add("1001 3"),3);
        thrown = Assertions.assertThrows(NegativeNotAllowedException.class, () -> {
            sc.add("//#\n-3#-4#5#-6");
        });
        assertEquals("Negative Not Allowed and numbers are -3,-4,-6,", thrown.getMessage());
    }
}
