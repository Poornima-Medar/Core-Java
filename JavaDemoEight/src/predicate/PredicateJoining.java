package predicate;
import java.util.function.*;

public class PredicateJoining {
	public static void main(String[] args) {
		
		int[] array = {20,43,53,11,22,44,67,34,23,655,77,56,75,80,92,66,52};
		
		//predicate to check number is even or not
		Predicate<Integer> p1 = n -> n%2==0;
		
		//perdicate to check a number is greater that 50
		Predicate<Integer> p2 = n -> n>50;
		
		//and(), or(), negate()
		
		System.out.println("A number is even and greater than 50");
		for(int n : array) {
			if(p1.and(p2).test(n)) {
				System.out.print(n+", ");
			}
		}
		
		System.out.println();
		
		System.out.println("A number either even or greater than 50");
		for(int n: array) {
			if(p1.or(p2).test(n)) {
				System.out.print(n+", ");
			}
		}
		System.out.println();
		
		System.out.println("The odd number using negate functoion");
		for(int n: array) {
			if(p1.negate().test(n)) {
				System.out.print(n+", ");
			}
		}
		
		System.out.println();		
		System.out.println("The odd number and greater than 40 using negate functoion");
		for(int n: array) {
			if(p1.negate().and(p2).test(n)) {
				System.out.print(n+", ");
			}
		}
		
		
	}

}
