package dateapi;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Predicate;

public class Diffrence {

	public static void main(String[] args) {
		
		LocalDate curentDate = LocalDate.now();
		LocalDate previousDate = LocalDate.of(2000, 06,11);
		
		if(curentDate.equals(previousDate)) {
			System.out.println("Yes");
		}else {
			System.out.println("no");
		}
		
		long days =  Duration.between(curentDate.atStartOfDay(), previousDate.atStartOfDay()).toDays();
		
		System.out.println(days);
		
		Period p = Period.between(curentDate, previousDate);
		
		//System.out.println((p.getYears()*365) + (p.getMonths()*12)+ (p.getDays()*30) );
		
		LocalDate d = LocalDate.of(2000,06,11);
		
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyy");
		
		System.out.println(formatter.format(d));
		
		int s = d.with(TemporalAdjusters.firstDayOfMonth()).getDayOfMonth();
		
		System.out.println(s);

	}

}
