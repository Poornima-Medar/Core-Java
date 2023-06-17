package dateapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneTimeDate {

	public static void main(String[] args) {

		ZoneId z = ZoneId.systemDefault();
		System.out.println(z);
		
		ZonedDateTime zdt1 = ZonedDateTime.ofInstant(Instant.now(),ZoneId.systemDefault());
		System.out.println(zdt1);
		
		Set<String> allZoneId = ZoneId.getAvailableZoneIds();
//		
//		int count = 0;
//		for (String string : allZoneId) {
//			System.out.println(string);
//			count++;
//		}
//		System.out.println(count);
//		
		
		ZoneId id = ZoneId.of("America/Rosario");
		
		
		
		ZonedDateTime zdt = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), id);
		
		System.out.println(zdt);
		
		ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");
		
		ZoneOffset offset = ZoneOffset.of("+02:00");

		OffsetDateTime offSetByTwo = OffsetDateTime
		  .of(LocalDateTime.now(), offset);
		
		System.out.println(offSetByTwo);
		
	}

}
