package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

public class StringCalTest {
    StringCalculator sc=new StringCalculator();
    @Test
    public void test1() throws Exception {
        assertEquals(sc.add("1 1"), 2);
        assertEquals(sc.add("3,4"), 7);
        assertEquals(sc.add("3,4.5"), 12);
        assertEquals(sc.add("12 1"),13);
        NegativeNotAllowedException thrown = Assertions.assertThrows(NegativeNotAllowedException.class, () -> {
            sc.add("3,-4");
        });
        Assertions.assertEquals("Negative Not Allowed", thrown.getMessage());
        assertEquals(sc.add("10\n 12"),22);
        assertEquals(sc.add("//;\n 1;2"),3);
    }
}
