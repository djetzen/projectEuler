package net.euler.project.problems.firstPage;

/**
 * Created by jetzen on 23.12.14.
 */

import java.math.BigInteger;

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * Find the sum of the digits in the number 100!
 */
public class Problem20 {

    public static void main(String[] args) {
        BigInteger bigInt=new BigInteger("1");
        for(int i=1;i<=100;i++){
            bigInt=bigInt.multiply(new BigInteger(i+""));
        }
        System.out.println("100! is: "+bigInt);
        //get sum
        long sum=0;
        String digits=bigInt.toString();
        for(int i=0;i<digits.length();i++){
            sum+=Long.parseLong(digits.charAt(i)+"");
        }

        System.out.println("sum is: "+sum);
    }
}
