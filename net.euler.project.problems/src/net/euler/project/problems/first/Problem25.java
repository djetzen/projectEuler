package net.euler.project.problems.first;

/**
 * Created by jetzen on 23.12.14.
 */

import java.math.BigInteger;

/**
 * What is the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class Problem25 {
    public static void main(String[] args) {
        BigInteger firstValue=new BigInteger(1+"");
        BigInteger secondValue=new BigInteger(2+"");
        BigInteger bigInt=new BigInteger("1");
        for(long i=0;i<Long.MAX_VALUE;i++){
            bigInt=firstValue.add(secondValue);
            firstValue=secondValue;
            secondValue=bigInt;
            if(bigInt.toString().length()>=1000){
                //delay of 4 because of first values
                System.out.println("term: "+(i+4)+" number "+bigInt);
                break;
            }
        }
    }
}

