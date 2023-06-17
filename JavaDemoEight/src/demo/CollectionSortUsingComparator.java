package demo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class CollectionSortUsingComparator {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(23);
		l.add(2);
		l.add(7);
		l.add(1);
		System.out.println(l);
		
		
		//implementing comparator using lambda functions.
		 
		Comparator<Integer> c = (I1,I2) -> (I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(l,c);
		System.out.println(l);
		l.stream().forEach(System.out::println);
		l.stream().filter(i->i>10).forEach(System.out::println);
		
		List<Student> s = new ArrayList<Student>();
		s.add(new Student("Poornima",4));
		s.add(new Student("Nanda",2));
		s.add(new Student("Laxmi",6));
		s.add(new Student("Akshata",5));
		s.add(new Student("Sravani",1));
		s.add(new Student("Bindu",3));
		
		Collections.sort(s, (s1,s2)-> s1.getName().compareTo(s2.getName()));
		System.out.println(s);
		
		
		
		
		

	}

}
