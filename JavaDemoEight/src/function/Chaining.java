package function;
import java.util.function.*;

public class Chaining {

	public static void main(String[] args) {
	
		
		Function<Integer,Integer> f1 = n -> n*2;
		Function<Integer, Integer> f2 = n -> n*n;
		
		System.out.println(f1.andThen(f2).apply(10));
		
		System.out.println(f1.compose(f2).apply(10));
	}

}
