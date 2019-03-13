package net.euler.project.problems.first;

import java.awt.*;
import java.math.BigInteger;

public class Problem15 {
    public static void main(String[] args) {
        System.out.println(calculate(20).toString());
    }
    //simple combinatorics, for each square there are 2*square options of | or -

    public static BigInteger calculate(int squareDimension) {
        BigInteger numerator=calculateFaculty(2*squareDimension);
        System.out.println(numerator);
        BigInteger denominator=calculateFaculty(squareDimension);
        System.out.println(denominator);
        return numerator.divide(denominator.multiply(denominator));
    }

    public static BigInteger calculateFaculty(long number){
        BigInteger result=new BigInteger("1");
        for(int i=1;i<=number;i++){
            result=result.multiply(new BigInteger(i+""));
        }
        return result;
    }
}
