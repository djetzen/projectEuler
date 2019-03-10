package net.euler.project.problems.second

fun main(vararg args: String) {
    val p44 = Problem44()
    val result = p44.calculate()
    println("result is: " + result)
}

class Problem44 {
    fun calculate():Long{
        val pentagonalNumbersArray=LongArray(size=10000) { i -> calculatePentagonalNumber((i+1).toLong())}
        for(first:Long in pentagonalNumbersArray){
            for(second:Long in pentagonalNumbersArray){
                val sum=first+second
                if(pentagonalNumbersArray.contains(sum)){
                    val difference=second-first
                    if(pentagonalNumbersArray.contains(difference)){
                        return difference
                    }

                }
            }
        }
        println("no number found")
        return 0
    }

    private fun calculatePentagonalNumber(number:Long):Long{
        return (number*((3*number)-1))/2
    }
}