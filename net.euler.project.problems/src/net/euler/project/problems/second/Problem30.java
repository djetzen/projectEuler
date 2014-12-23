package net.euler.project.problems.second;

/**
 * Created by jetzen on 23.12.14.
 */

/**
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
 * 1634 = 1^4 + 6^4 + 3^4 + 4^4
 * 8208 = 8^4 + 2^4 + 04 + 8^4
 * 9474 = 9^4 + 4^4 + 7^4 + 4^4
 * As 1 = 1^4 is not a sum it is not included.
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
public class Problem30 {
    public static void main(String[] args) {
        long sum=0;
        for(long i=2;i<1_000_000;i++){
            long digitPow=getFifthDigitPows(i);
            if(i==digitPow){
                sum+=i;
                System.out.println("same: "+i);
            }
        }
        System.out.println("sum: "+sum);
    }

    private static long getFifthDigitPows(long number){
        long digitPow=0;
        String s=number+"";
        for(int i=0;i<s.length();i++){
            digitPow+=Math.pow(Integer.parseInt(s.charAt(i)+""),5);
        }
        return digitPow;
    }
}
