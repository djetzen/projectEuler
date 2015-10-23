package net.euler.project.problems.first;

import java.time.LocalDate
import java.time.DayOfWeek
class Calculator19 {

	def static main(String[] args){
		calculate
	}

	private def static void calculate(){
		var sundays=0;
		for(year:1901 ..2000)
			for(month:1 ..12)
				if(LocalDate.of(year, month, 1).dayOfWeek==DayOfWeek.SUNDAY)
					sundays++
		println("number of sundays on first of month: "+sundays)
	}
}