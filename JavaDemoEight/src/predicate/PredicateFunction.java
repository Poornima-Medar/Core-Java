package predicate;

import java.util.Scanner;
import java.util.function.*;

public class PredicateFunction {
	
	public static void main(String[] args) {
//		Check c = new Check();
//		boolean a = c.test(10);
//		System.out.println(a);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check weather it is even or not");
		int a = sc.nextInt();
		
		Predicate<Integer> p = i -> i%2==0;
		if(p.test(a) == true) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}
		
		System.out.println("------------------------------------------------");
		
		Predicate<Integer> t = I -> I%2==0;
		System.out.println(t.test(10));
		
		Predicate<String> s = name -> name.length()>5;
		System.out.println(s.test("Poorn"));
		
		String[] array = {"Poornima","Medar","Laxmi","Akshata","Jyothi","Nandini"};
		Predicate<String> a1 = s1 -> s1.length()>5;
		for(String s1:array) {
			if(a1.test(s1)) {
				System.out.println(s1);
			}
			
		}
		sc.close();
	}
	
}

//class Check implements Predicate<Integer>{
//	
//	@Override
//	public boolean test(Integer t) {
//		if(t%2==0) 
//			return true;
//		else
//			return false;
//			
//	}
//	
//}
