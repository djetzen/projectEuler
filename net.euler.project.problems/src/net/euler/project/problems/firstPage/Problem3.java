package net.euler.project.problems.firstPage;

/**
 * Created by jetzen on 21.12.14.
 */

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {

    public static void main(String[] args) {
        //check if 600851475143 can be divided through a certain number
        System.out.println("sieve now: ");
        long n=600851475143L;
        long startValue=(long)Math.floor(Math.sqrt(n));
        long largestPrimeFactor=0;
        for(long i=startValue;i>1;i--){
            if(n%i==0){
                if(isPrime(i)){
                    largestPrimeFactor=i;
                    break;
                }
            }
        }
        System.out.println("largest prime factor is: "+largestPrimeFactor);
    }

    public static boolean isPrime(long number){
       for(int i=2;i<=Math.floor(Math.sqrt(number));i++){
           if(number%i==0){
               return false;
           }
       }
        return true;
    }
}
