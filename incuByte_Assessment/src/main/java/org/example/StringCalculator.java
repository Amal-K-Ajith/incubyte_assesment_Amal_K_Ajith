package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;


public class StringCalculator {

    int add(String st) throws Exception {
        char[] ch =st.toCharArray();
        int sum=0;
        for(char c:ch){
            if(c>='0' && c<='9')
             sum+=Integer.parseInt(c+"");
        }
        return sum;
    }
}
