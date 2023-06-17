package dateapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		System.out.println("Enter date in the formatt yyyy/MM/dd");
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		
		LocalDate localdate = LocalDate.parse(date);
		
		LocalDate s = localdate.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
		
		System.out.println(s);
	}

}
