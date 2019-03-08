package net.euler.project.problems.third;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem52 {
    /**
     * It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.
     *
     * Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
     */
    public static void main(String[] args) {

        for(long i=1;i<1_000_000;i++){
            if(productsHaveSameDigits(i,6)){
                System.out.println("smallest number: "+i);
                break;
            }
        }

    }

    private static boolean productsHaveSameDigits(long numberToCheck, int limitMultiplier) {
        for(int multiplier=1;multiplier<limitMultiplier;multiplier++){
            var firstNumber=multiplier*numberToCheck;
            var secondNumber=(multiplier+1)*numberToCheck;
            if(!hasSameDigits(firstNumber,secondNumber)){
                return false;
            }
        }
        return true;
    }

    private static boolean hasSameDigits(long first, long second) {
        var firstSortedLong=getSortedLong(first);
        var secondSortedLong=getSortedLong(second);
        return firstSortedLong==secondSortedLong;
    }

    private static long getSortedLong(long unsortedLong) {
        var allLongs=getListOfLongs(unsortedLong+"");
        List<Long> sortedLongs = allLongs.stream().sorted().collect(Collectors.toList());
        var sortedString="";
        for(Long s:sortedLongs){
            sortedString+=s.longValue()+"";
        }
        return Long.parseLong(sortedString);
    }

    private static List<Long> getListOfLongs(String listOfLongs){
        List<Long> singleLongs=new ArrayList<>();
        for(int i=0;i<listOfLongs.length();i++){
            var s=Character.toString(listOfLongs.charAt(i));
            singleLongs.add(Long.parseLong(s));
        }
        return singleLongs;
    }
}
