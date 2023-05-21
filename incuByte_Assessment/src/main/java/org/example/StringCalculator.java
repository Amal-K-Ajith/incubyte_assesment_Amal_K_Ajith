package org.example;

public class StringCalculator {

    int add(String st) throws Exception {
        char deLimiter = ';';
        int d_ind = st.indexOf("//");

        if (d_ind != -1) {
            st = st.replaceAll(st.charAt(d_ind + 2) + "", ",").substring(4);
        }
        st = st.replaceAll("\n", ",");
        String[] ch = st.split("[,. ]");
        int sum = 0;
        for (String s : ch) {
            if (s == "") continue;
            int num = Integer.parseInt(s);
            if (num < 0) throw new NegativeNotAllowedException();
            sum = sum + num;
        }
        System.out.println();
        return sum;
    }
}
