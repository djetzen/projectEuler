package net.euler.project.problems.first;

/**
 * Created by jetzen on 22.12.14.
 */

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product in resources/problem8.txt
 * What is the value of this product?
 */
public class Problem8 {

    public static void main(String[] args) {
        try{
            //read file
            BufferedReader br=new BufferedReader(new FileReader("resources/problem8.txt"));
            String allLines="";
            String line="";
            while((line=br.readLine())!=null){
                allLines+=line;
            }
            //convert to int array
            int[] numberArray=new int[allLines.length()];
            for(int i=0;i<allLines.length();i++){
                numberArray[i]=Integer.parseInt(allLines.charAt(i)+"");
            }
            long largestSum=0;
            //get product of 13 adjacent digits
            for(int i=0;i<numberArray.length-13;i++){
                long sum=productOfNextThirteenElements(numberArray,i);
                if(sum>largestSum){
                    largestSum=sum;
                }
            }

            System.out.println("largest sum: "+largestSum);
            br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static long productOfNextThirteenElements(int[] numberArray,int start){
        long sum=1;
        for(int i=start;i<start+13;i++){
            sum=sum*numberArray[i];
        }
        return sum;
    }
}
