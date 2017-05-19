package net.euler.project.problems.first

/**
 * Created by jetzen on 19.05.17.
 */

fun main(args: Array<String>) {
    var sum=0;
    for (i in 1..999){
        if(i%3==0 || i%5==0){
            sum+=i
        }
    }
    println("kotlin: "+sum)
}
