package demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collections {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		intList.add(9);
		intList.add(-1);
		
		Set<Integer> intList2 = intList.stream().filter(number -> number > 0)
		.filter(number -> number >5).collect(Collectors.toSet());
		//.forEach(System.out::print);
		//
		
		//ntList2.forEach(System.out::println);
		
		
		List<Integer> l1 = Arrays.asList(12,3,4,2);
		List<Integer> l2 = Arrays.asList(1,5,7,8);
		List<Integer> l3 = Arrays.asList(9,0,8,6);
		
		List<List<Integer>> l = new ArrayList<>();
		l.add(l1);
		l.add(l2);
		l.add(l3);
		
		System.out.println(l);
		
		List<Integer> list = l.stream().flatMap(ll -> ll.stream()).collect(Collectors.toList());
		
		System.out.println(list);
		
		
		
		
		
		
		
	}


}

