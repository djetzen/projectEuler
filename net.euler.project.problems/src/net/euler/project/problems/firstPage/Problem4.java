package net.euler.project.problems.firstPage;

/**
 * Created by jetzen on 21.12.14.
 */

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    public static void main(String[] args) {
        int largestPalindrome=0;
        //create numbers
        for(int i=100;i<1000;i++){
            for(int j=100;j<1000;j++){
                if(isPalindrome(i*j)&&((i*j)>largestPalindrome)){
                    largestPalindrome=i*j;
                }
            }
        }
        System.out.println("largest palindrome is: "+largestPalindrome);
    }

    public static boolean isPalindrome(int number){
        int n=number;
        int reverse=0;
        while(n!=0){
            reverse=reverse*10;
            reverse=reverse+(n%10);
            n=n/10;
        }
        return (reverse==number);
    }
}
