package net.euler.project.problems.firstPage;

/**
 * Created by jetzen on 22.12.14.
 */

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * In the 20×20 grid below, four numbers along a diagonal line have been marked in red.
 * The product of these numbers is 26 × 63 × 78 × 14 = 1788696.
 * What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?
 */
public class Problem11 {
    public static void main(String[] args) {
        //read file
        int[][] numberGrid=readFile();
        long largestSum=0;
        //calculate diagonal sums from left top to down right
        for(int i=0;i<numberGrid.length-3;i++){
            for(int j=0;j<numberGrid[i].length-3;j++){
                //calculate...
                long product=numberGrid[i][j]*numberGrid[i+1][j+1]*numberGrid[i+2][j+2]*numberGrid[i+3][j+3];
                if(product>largestSum){
                    largestSum=product;
                }
            }
        }

        //calculate diagonal sums from right top to down left
        for(int i=3;i<numberGrid.length;i++){
            for(int j=0;j<numberGrid[i].length-3;j++){
                long product=numberGrid[i][j]*numberGrid[i-1][j+1]*numberGrid[i-2][j+2]*numberGrid[i-3][j+3];
                if(product>largestSum){
                    largestSum=product;
                }
            }
        }
        //calculate up/down sums
        for(int i=0;i<numberGrid.length-3;i++){
            for(int j=0;j<numberGrid[i].length;j++){
                long product=numberGrid[i][j]*numberGrid[i+1][j]*numberGrid[i+2][j]*numberGrid[i+3][j];
                if(product>largestSum){
                    largestSum=product;
                }
            }
        }
        //calculate left/right sums
        for(int i=0;i<numberGrid.length;i++){
            for(int j=0;j<numberGrid[i].length-3;j++){
                long product=numberGrid[i][j]*numberGrid[i][j+1]*numberGrid[i][j+2]*numberGrid[i][j+3];
                if(product>largestSum){
                    largestSum=product;
                }
            }
        }
        System.out.println("largest sum is: "+largestSum);
    }

    public static int[][] readFile(){
        try{
            //read file
            BufferedReader br=new BufferedReader(new FileReader("resources/problem11.txt"));
            String line="";
            int height=0;
            int width=0;
            br.mark(10000);
            while((line=br.readLine())!=null){
                height++;
                if(width==0){
                    width=line.split(" ").length;
                }
            }
            br.reset();
            int[][] numberArray=new int[height][width];
            int j=0;
            while((line=br.readLine())!=null){
                String[] s=line.split(" ");
                for(int i=0;i<s.length;i++){
                    numberArray[j][i]=Integer.parseInt(s[i]);
                }
                j++;
            }
            br.close();
            return numberArray;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
