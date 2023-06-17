package dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Demo {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();	
		System.out.println(dd+"/"+mm+"/"+yy);
		
		int totalDays = date.lengthOfMonth();
		System.out.println(totalDays);
		
		LocalTime time  = LocalTime.now();
		System.out.println(time);
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		
		System.out.println(h+"h:"+m+"m:"+s+"s:"+n+"n");
		
		
		//Above methods are used to get seperate values
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		
		//insert our own date
		LocalDate dto = LocalDate.of(2000,Month.JUNE,11);
		System.out.println("Own date"+dto);	
		
		LocalTime to = LocalTime.of(2, 30, 30);
		System.out.println(to);
		
		LocalDateTime ldto = LocalDateTime.of(2000,06,11,5,30);
		System.out.println(ldto);
	

	}

}
