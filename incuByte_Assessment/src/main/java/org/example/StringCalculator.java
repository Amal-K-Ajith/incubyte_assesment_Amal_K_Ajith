package org.example;



public class StringCalculator {

    int add(String st) throws Exception {
        st=st.replaceAll("\n",",");
        String [] ch =st.split("[,. \n]");
        int sum=0;
        for(String s:ch){
            if(s=="")continue;
            int num=Integer.parseInt(s);
            if(num<0)throw new NegativeNotAllowedException();
            sum=sum+num;
        }
        System.out.println();
        return sum;
    }
}
