package org.example;

import java.util.Objects;

public class StringCalculator {

    int add(String st) throws Exception {
        st=regexFixed(st);
        int neg_count=0;
        StringBuilder sb=new StringBuilder();
        st = st.replaceAll("\n", ",");
        String[] ch = st.split("[, ]");
        int sum = 0;
        for (String s : ch) {
            if (s.equals("")) continue;
            int num = Integer.parseInt(s);
            if(num>1000)continue;
            if (num < 0){
//                throw new NegativeNotAllowedException();
                neg_count++;
                sb.append(num+",");
                continue;
            }
            sum = sum + num;
        }
        if(neg_count>0){
            if(neg_count>1)throw new NegativeNotAllowedException(sb.toString());
            throw new NegativeNotAllowedException();
        }
        return sum;
    }
    String regexFixed(String st){
        int d_ind = st.indexOf("//");
        if (d_ind != -1) {
            if(st.charAt(d_ind+2)=='['){
                String rem=st.substring(3,st.indexOf(']'));
                st= st.substring(st.indexOf(']')+1).replaceAll("\\"+rem,",");
            }else{
               st = st.replaceAll(st.charAt(d_ind + 2) + "", ",").substring(4);
            }
        }
        return st;
    }
}
