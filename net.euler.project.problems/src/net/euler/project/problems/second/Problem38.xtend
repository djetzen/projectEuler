package net.euler.project.problems.second

import java.math.BigInteger
/**
 * Created by jetzen on 23.10.15.
 */
/**
 Take the number 192 and multiply it by each of 1,2 and 3:
 192*1=192
 192*2=384
 192*3=576
 By concatenating each product we get the 1 to 9 pandigital 192384576. We will call 192384576 the concatenated
 product of 192 and (1,2,3).
 The same can be achieved by starting with 9 and multiplying by 1,2,3,4 and 5. giving the pandigital 918273645 which is
 the concatenated product of 9 and (1,2,3,4,5).
 What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with
 (1,2,...n) where n>1?
*/
class Problem38 {

    def static void main(String[] args){
        println("largest: "+calculate)
    }

    def static calculate(){
        var long largestDigital=0
        //calculate --> just take half the size, should be enough
        for(var long i=1;i<50000;i++){
            var s=""
            //take only 5, because more does not make sens as soon as we are over 10 in i
            for(var long j=1;j<5;j++){
                if((s.length+(i*j).toString.length<=9)){
                    s=s+(i*j).toString
                }
                if(s.checkIf9PanDigital){
                    if(largestDigital<(Long.parseLong(s)))
                        largestDigital=(Long.parseLong(s))
                }
            }
        }
        return largestDigital
    }

    def static checkIf9PanDigital(String number){
        if(number.length>9)
            return false
        for(i:1 ..<10){
            if(!number.contains(i.toString))
                return false
        }
        return true
    }
}