package net.euler.project.problems.third;


import java.math.BigInteger

class Calculator56 {
	def static main(String[] args){
		calculate
	}
	private def static void calculate() {
		var greatestSum = 0
		for (a : 1 .. 100) {
			for (b : 1 .. 100) {
				var localSum = getSum(new BigInteger(a + "").pow(b))
				if (localSum > greatestSum)
					greatestSum = localSum
			}
		}
		println("largest sum is: " + greatestSum)
	}

	private def static int getSum(BigInteger integer) {
		var zero = new BigInteger("0")
		var ten = new BigInteger("10")
		var value = integer
		var sum = 0
		while (value.compareTo(zero) > 0) {
			var digit = value.mod(ten)
			sum += digit.intValue
			value = value.divide(ten)
		}
		sum
	}
}