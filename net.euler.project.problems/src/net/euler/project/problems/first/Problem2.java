package net.euler.project.problems.first;

/**
 * Created by jetzen on 21.12.14.
 */

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four
 * million, find the sum of the even-valued terms.
 */
public class Problem2 {

    public static void main(String[] args) {
        int firstValue=1;
        int secondValue=2;
        int sum=0;
        int evenSum=0;
        while(sum<4000000){
            if(secondValue%2==0){
                evenSum+=secondValue;
            }
            //do a triple swap, to get the fibonacci list
            sum=firstValue+secondValue;
            firstValue=secondValue;
            secondValue=sum;
        }
        System.out.println("the sum of all even elements is: "+evenSum);
    }
}
