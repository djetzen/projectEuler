package net.euler.project.problems.secondPage;

/**
 * Created by jetzen on 23.12.14.
 */

import java.math.BigInteger;

/**
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
 * Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 */
public class Problem48 {
    public static void main(String[] args) {
        BigInteger bigInt=new BigInteger("0");
        for(int i=1;i<=1000;i++){
            //get new element
            BigInteger self=new BigInteger(i+"");
            self=self.pow(i);
            bigInt=bigInt.add(self);
        }
        String s=bigInt.toString();
        for(int i=s.length()-10;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
    }
}
