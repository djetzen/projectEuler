package net.euler.project.problems.first;

/**
 * Created by jetzen on 22.12.14.
 */

/**
 * The sum of the squares of the first ten natural numbers is,1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,(1 + 2 + ... + 10)^2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {
    public static void main(String[] args) {
        //get sum of the squares
        long sumSquare=0;
        for(int i=1;i<=100;i++){
            sumSquare+=(long)Math.pow(i,2);
        }
        //get square of the sum
        long squareSum=0;
        for(int i=1;i<=100;i++){
            squareSum+=i;
        }
        squareSum=(long)Math.pow(squareSum,2);
        long diff=squareSum-sumSquare;
        System.out.println("the difference is: "+diff);
    }
}
