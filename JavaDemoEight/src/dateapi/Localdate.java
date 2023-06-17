package dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Localdate {

	public static void main(String[] args) {

		LocalDate d = LocalDate.parse("2020-03-01").minus(1, ChronoUnit.MONTHS);
		System.out.println(d);

		boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));

		boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));

		System.out.println(notBefore);
		System.out.println(isAfter);

		LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
		LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());

		System.out.println(beginningOfDay);
		System.out.println(firstDayOfMonth);
		
		LocalDate dd = LocalDate.MIN;
		
		System.out.println(dd);
	}

}
