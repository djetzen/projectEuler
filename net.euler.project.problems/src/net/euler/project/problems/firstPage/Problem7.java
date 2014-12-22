package net.euler.project.problems.firstPage;

/**
 * Created by jetzen on 22.12.14.
 */

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class Problem7 {

    public static void main(String[] args) {
        long primeCounter=0;
        long prime=0;
        for(long i=2;i<Long.MAX_VALUE;i++){
            if(isPrime(i)){
                primeCounter++;
                if(primeCounter==10001){
                    prime=i;
                    break;
                }
            }
        }
        System.out.println("the 10001st prime is: "+prime);
    }

    public static boolean isPrime(long number){
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
