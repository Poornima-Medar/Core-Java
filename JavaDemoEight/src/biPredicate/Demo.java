package biPredicate;
import java.util.function.*;

public class Demo {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> b = (n1,n2) -> n1==n2;
		
		System.out.println(b.test(3, 3));
		
	}

}
