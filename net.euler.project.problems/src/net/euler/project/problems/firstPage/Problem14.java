package net.euler.project.problems.firstPage;

/**
 * Created by jetzen on 23.12.14.
 */

/**
 * The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 *
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * Which starting number, under one million, produces the longest chain?
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Problem14 {
    public static void main(String[] args) {
        long[] elements=new long[2];
        for(int i=1;i<1_000_000;i++){
            long length=getNumberOfElements(i);
            if(elements[1]<length){
                elements[0]=i;
                elements[1]=length;
            }
        }
        System.out.println("element with longest is: "+elements[0]+" and the number is: "+elements[1]);
    }

    /**
     * This method gets the number of elements using the collatz sequence
     */
    public static long getNumberOfElements(long number){
        int numberOfElements=0;
        if(number==1){
            return 1;
        }
        if(number%2==0){
            numberOfElements++;
            numberOfElements+=getNumberOfElements(getNextSequence(number));
        }
        else{
            numberOfElements++;
            numberOfElements+=getNumberOfElements(getNextSequence(number));
        }
        return numberOfElements;
    }

    public static long getNextSequence(long n){
        if(n%2==0){
            return n/2;
        }
        else{
            return (3*n)+1;
        }
    }
}
