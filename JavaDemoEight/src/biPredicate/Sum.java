package biPredicate;

import java.util.function.BiPredicate;

public class Sum {

	public static void main(String[] args) {
		
		BiPredicate<Float, Float> b = (n1,n2) -> (n1+n2)%2==0;
		
		System.out.println(b.test(10.5f, 5.5f));
	}

}
