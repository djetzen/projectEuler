package net.euler.project.problems.firstPage;

/**
 * Created by jetzen on 21.12.14.
 */

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {
    public static void main(String[] args) {
        int number=0;
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(isDivisible(i)){
                number=i;
                break;
            }
        }
        System.out.println("Smallest number divisible by 1 to 20 is: "+number);
    }

    public static boolean isDivisible(int number){
        boolean isDivisible=true;
        for(int i=1;i<=20;i++){
            if(number%i!=0){
                return false;
            }
        }
        return true;
    }
}
