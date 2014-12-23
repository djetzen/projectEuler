package net.euler.project.problems.first;

/**
 * Created by jetzen on 22.12.14.
 */

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^2 + b^2 = c^2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.
 */
public class Problem9 {

    public static void main(String[] args) {
        for(int a=0;a<500;a++){
            for(int b=0;b<500;b++){
                double left=Math.pow(a,2)+Math.pow(b,2);
                double right=Math.sqrt(left);
                if(a+b+right==1000){
                    System.out.println("a: "+a+" b: "+b+" c:"+right+" product: "+(a*b*(int)right));
                    break;
                }
            }
        }
    }
}
