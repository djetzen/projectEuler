package net.euler.project.problems.first;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by jetzen on 09.01.15.
 */
public class Problem22 {

    public static void main(String[] args) {
        List<String> namesMappedToLineNumber=new ArrayList<>();
        try{
            String line="";
            BufferedReader br=new BufferedReader(new FileReader("resources/p022_names.txt"));
            line=br.readLine();
            for(String s:line.split(",")){
                namesMappedToLineNumber.add(s.replace("\""," ").trim());
            }
            Collections.sort(namesMappedToLineNumber, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
            br.close();
            BigInteger overallSum=new BigInteger("0");
            int number=1;
            for(String s:namesMappedToLineNumber){
                int count=getLetterSum(s);
                int sum=count*number;
                overallSum=overallSum.add(new BigInteger(sum+""));
                number++;
            }
            System.out.println("overall sum is: "+overallSum);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static int getLetterSum(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
           sum+=getLetterCount(((Character) s.charAt(i)).toString());
        }
        return sum;
    }

    private static int getLetterCount(String s){
        switch (s.toLowerCase()){
            case "a":return 1;
            case "b":return 2;
            case "c":return 3;
            case "d":return 4;
            case "e":return 5;
            case "f":return 6;
            case "g":return 7;
            case "h":return 8;
            case "i":return 9;
            case "j":return 10;
            case "k":return 11;
            case "l":return 12;
            case "m":return 13;
            case "n":return 14;
            case "o":return 15;
            case "p":return 16;
            case "q":return 17;
            case "r":return 18;
            case "s":return 19;
            case "t":return 20;
            case "u":return 21;
            case "v":return 22;
            case "w":return 23;
            case "x":return 24;
            case "y":return 25;
            case "z":return 26;
            default: return 0;
        }
    }
}
