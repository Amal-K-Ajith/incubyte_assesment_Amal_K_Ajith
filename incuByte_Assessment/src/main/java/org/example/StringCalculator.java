package org.example;

public class StringCalculator {

    int add(String st) throws Exception {
        char deLimiter = ';';
        int d_ind = st.indexOf("//");
        int neg_count=0;
        StringBuilder sb=new StringBuilder();
        if (d_ind != -1) {
            st = st.replaceAll(st.charAt(d_ind + 2) + "", ",").substring(4);
        }
        st = st.replaceAll("\n", ",");
        String[] ch = st.split("[,. ]");
        int sum = 0;
        for (String s : ch) {
            if (s == "") continue;
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
}
