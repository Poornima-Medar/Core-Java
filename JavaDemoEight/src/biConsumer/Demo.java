package biConsumer;

import java.util.function.*;

public class Demo {

	public static void main(String[] args) {
		
		BiConsumer<String, String> bc = (s1,s2) -> {
			System.out.println(s1+" "+s2);
		};
		
		bc.accept("Poornima", "Medar");

	}

}
