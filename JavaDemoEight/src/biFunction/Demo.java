package biFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class Employee{
	int eno;
	String name;
	
	public Employee(int eno,String name) {
		this.eno = eno;
		this.name = name;
	}
}

public class Demo {

	public static void main(String[] args) {
		
		List<Employee> l = new ArrayList<>();
		
		BiFunction<Integer, String, Employee> bf = (eno,name) ->  new Employee(eno, name);
		
		l.add(bf.apply(1, "Poornima"));
		l.add(bf.apply(4, "Pooja"));
		l.add(bf.apply(2, "Pranitha"));
		
	
		for(Employee l1: l) {
			System.out.println(l1.eno);
			System.out.println(l1.name);
			System.out.println();
			
		}
		
		
	}

}
