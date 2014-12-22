package net.euler.project.problems.firstPage;

/**
 * Created by jetzen on 22.12.14.
 */

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
public class Problem10 {
    public static void main(String[] args) {
        long sum=0;
        for(long i=2;i<2_000_000;i++){
            if(i%100_000==0){
                System.out.println(i+" cycles run");
            }
            if(isPrime(i)){
                sum+=i;
            }
        }
        System.out.println("sum: "+sum);
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
