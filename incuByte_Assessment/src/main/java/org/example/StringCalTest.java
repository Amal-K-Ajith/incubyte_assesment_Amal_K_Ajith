package org.example;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringCalTest {
    StringCalculator sc=new StringCalculator();
    @Test
    public void test1() throws Exception {
        assertThat(sc.add("1 1"), is(2));
        assertThat(sc.add("3,4"), is(7));
        assertThat(sc.add("3,4.5"), is(12));
    }
    @Test(expected = Exception.class)
    public void errorTest() throws Exception {
        assertThat(sc.add("3,-4"), is(new Exception()));
    }
}
