package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.CoreMatchers.*;

import static org.hamcrest.CoreMatchers.is;

public class StringCalTest {
    @Test
    public void test1(){
        StringCalculator sc=new StringCalculator();
        Assert.assertThat(sc.add("1 1"), is(2));
    }
}
