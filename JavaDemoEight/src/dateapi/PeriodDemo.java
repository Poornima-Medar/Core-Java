package dateapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		
		LocalDate birthDate = LocalDate.of(2017, Month.MARCH, 3);
		
		LocalDate presentDate = LocalDate.now();
		
		Period p = Period.between(birthDate, presentDate);
		
		System.out.println(p.getYears()+"Y  "+p.getMonths()+"M  "+p.getDays()+"D");

	}

}
