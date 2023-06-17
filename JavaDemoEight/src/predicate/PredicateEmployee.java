package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

class Employee {
	private String name;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class PredicateEmployee {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<Employee>();
		
		employee.add(new Employee("Poornima", 10000));
		employee.add(new Employee("Nanda", 20000));
		employee.add(new Employee("Akshata", 30000));
		employee.add(new Employee("Pavan", 100000));
		employee.add(new Employee("Mahesh", 87000));
		employee.add(new Employee("Sakshi", 56000));
		employee.add(new Employee("Sam", 25000));
		
		Predicate<Employee> e = e1 ->e1.getSalary()>50000;
		
		for(Employee e1:employee) {
			if(e.test(e1)) {
				System.out.println(e1.getName()+" : "+ e1.getSalary());
			}
		}

	}

}
