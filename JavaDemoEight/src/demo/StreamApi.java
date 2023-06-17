package demo;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Poornima","Medar","ABC","XYZ");
		
	String  s = l.stream().collect(Collectors.joining(", ","[","]"));
		
	System.out.println(s);
		
	}

}
