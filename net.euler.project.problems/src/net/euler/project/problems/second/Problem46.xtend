package net.euler.project.problems.second

/**
 * Created by jetzen on 16.10.15.
 */
class Problem46 {
    static def main(String[] args){
        println(calculate)
    }

    private static def calculate(){
        for(i:2 ..<1000000) {
            if(i%2==1) {
                if(!i.isPrime) {
                    if(!i.isGoldBach) {
                        return i
                    }
                }
            }
        }
    }

    private static def isPrime(long number){
        for(var long i=2;i<= Math.floor(Math.sqrt(number));i++) {
            if(number%i==0) {
                return false;
            }
        }
        return true;
    }

    private static def isGoldBach(int number){
        for(i:2 ..<number) {
            if(i.isPrime) {
                for(var long j=1;j<number-i;j++){
                    if(j*j*2==number-i)
                        return true
                }
            }
        }
        false
    }
}