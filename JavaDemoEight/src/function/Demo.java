package function;
import java.util.function.*;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Enter a number to get cube of a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Function<Integer, Integer> cube = n -> n*n*n;
		
		System.out.printf("The cube root of %d is %d\n",num,cube.apply(num));
		
		System.out.println("Enter any chacter or word to calculate its length");
		String s = sc.next();
		
		Function<String, Integer> l = s1 -> s1.length();
		
		System.out.printf("Thet length of %s is %d\n",s,l.apply(s));
		
		Function<String, String> l1 = s1 -> s1.toUpperCase();
		System.out.println(l1.apply(s));
		
		sc.close();
	}

}
