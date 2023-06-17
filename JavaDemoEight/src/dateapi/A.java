package dateapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class A {

	public static void main(String[] args) {		
		LocalDateTime now = LocalDateTime.now();
		ZoneId zone = ZoneId.of("Europe/Berlin") ;
		ZoneOffset zoneOffSet = zone.getRules().getOffset(now);
		System.out.println(zoneOffSet);
	}

}
