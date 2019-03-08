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
            if(productsHaveSameDigits(i)){
                System.out.println("smallest number: "+i);
                break;
            }
        }

    }

    private static boolean productsHaveSameDigits(long i) {
        for(int multiplier=1;multiplier<6;multiplier++){
            if(!hasSameDigits(multiplier*i,(multiplier+1)*i)){
                return false;
            }
        }
        return true;
    }

    private static boolean hasSameDigits(long first, long second) {
        long firstSortedLong=getSortedLong(first);
        long secondSortedLong=getSortedLong(second);
        return firstSortedLong==secondSortedLong;
    }

    private static long getSortedLong(long unsortedLong) {
        String unsortedString=unsortedLong+"";
        List<Long> singleLongs=new ArrayList<>();
        for(int i=0;i<unsortedString.length();i++){
            singleLongs.add(Long.parseLong(Character.toString(unsortedString.charAt(i))));
        }
        Stream<Long> sortedLongs = singleLongs.stream().sorted();
        String sortedString="";
        for(Long s:sortedLongs.collect(Collectors.toList())){
            sortedString+=s.longValue()+"";
        }
        return Long.parseLong(sortedString);
    }
}
