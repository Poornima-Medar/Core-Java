package consumer;
import java.util.function.*;

public class Chaining {

	public static void main(String[] args) {
		
		Consumer<String> c1 = s -> System.out.println("Hi "+s);
		
		Consumer<String> c2 = s -> System.out.println("Hello "+s+"!!");
		
		Consumer<String> c3 = s -> System.out.println("How are you "+s+"?");
		
		c1.andThen(c2).andThen(c3).accept("Poornima");

	}

}
