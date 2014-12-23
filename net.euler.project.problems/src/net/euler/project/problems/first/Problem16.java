package net.euler.project.problems.first;

/**
 * Created by jetzen on 23.12.14.
 */

import java.math.BigInteger;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 21000?
 */
public class Problem16 {
    public static void main(String[] args) {
        BigInteger bigInt=new BigInteger("2");
        BigInteger powed=bigInt.pow(1000);
        String values=powed.toString();
        long sum=0;
        for(int i=0;i<values.length();i++){
            sum+=Long.parseLong(values.charAt(i)+"");
        }
        System.out.println("Number is: "+powed);
        System.out.println(" and the sum of the digits is: "+sum);
    }
}
