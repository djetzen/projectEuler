package net.euler.project.problems.first;

/*
 * Let d(n) be defined as the sum of proper divisors of n(numbers less than n which dived evenly into 
 * n). if d(a)=b and d(b)=a and a!=b, then a and b are an amicable pairs and each of a and b are 
 * called amicable numbers.
 * Example:
 * d(220)=284 (divisors: 1,2,4,5,10,11,20,22,44,55,110) d(284)=220 (divisors: 1,2,4,71,142)
 * Evaluate the sum of all the amicable numbers under 100000
 */
class Calculator21 {
	def static main(String[] args){
		calculate
	}
	private def static void calculate() {
		val getTotalSumFunction = [ int[] allSums |
			var totalSum = 0
			for(i:0 ..<allSums.length){
				val n=i+1 //Index + 1, because array starts at 0
				val d_n=allSums.get(i)
				if(d_n<allSums.length && d_n!=n && d_n>0)
					if(allSums.get(d_n-1)==n) //-1, because array starts at 0
						totalSum+=n
			}
			totalSum
		]
		println(getTotalSumFunction.apply(allSums))
	}

	private def static int[] getAllSums() {
		val sumOfDivisorsFunction = [ int k |
			var sum = 0
			for (j : 1 ..< (k / 2)+1)
				if (k % j == 0)
					sum += j
			sum
		]
		val allSums = newIntArrayOfSize(10000)
		for (i : 0 ..< allSums.length)
			allSums.set(i,sumOfDivisorsFunction.apply(i+1))//+1 because array starts at 0
		allSums
	}
}