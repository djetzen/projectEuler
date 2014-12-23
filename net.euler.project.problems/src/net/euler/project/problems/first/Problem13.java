package net.euler.project.problems.first;

/**
 * Created by jetzen on 23.12.14.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.HashSet;

/**
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers from resources/problem13.txt
 */
public class Problem13 {
    public static void main(String[] args) {
        try {
            //read file
            BufferedReader br = new BufferedReader(new FileReader("resources/problem13.txt"));
            HashSet<String> allLines=new HashSet<>();
            String line="";
            while((line=br.readLine())!=null){
                allLines.add(line);
            }
            //get into long array
            BigInteger[] allNumbers=new BigInteger[allLines.size()];
            int k=0;
            for(String l:allLines){
                allNumbers[k]=new BigInteger(l);
                k++;
            }
            //build sum
            BigInteger bigInt=new BigInteger("0");
            for(int i=0;i<allNumbers.length;i++){
                bigInt=bigInt.add(allNumbers[i]);
            }

            System.out.println("value of all numbers is: "+bigInt);
            br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
