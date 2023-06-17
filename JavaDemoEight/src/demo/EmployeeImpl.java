package demo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeImpl {



	public static void main(String[] args) throws ParseException {
		
		List<Employee> emp = new ArrayList<>();
		
		emp.add(employee("Poornima","Medar","CSE",new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2000"),100000));
		emp.add(employee("Nanda","Nayak","ISE",new SimpleDateFormat("dd/MM/yyyy").parse("11/6/2000"),50000));
		emp.add(employee("Rahul","M","ECE",new SimpleDateFormat("dd/MM/yyyy").parse("21/3/2005"),25000));
		emp.add(employee("John","Shetter","MECH",new SimpleDateFormat("dd/MM/yyyy").parse("30/6/2001"),39000));
		emp.add(employee("Emma"," Watson","ISE",new SimpleDateFormat("dd/MM/yyyy").parse("9/9/1998"),50000));
		emp.add(employee("Jim","Parker","CSE",new SimpleDateFormat("dd/MM/yyyy").parse("21/11/2002"),28000));
		emp.add(employee("Sophia","Ran","ECE",new SimpleDateFormat("dd/MM/yyyy").parse("4/5/1999"),32000));
		emp.add(employee("Pratiksha","U","MECK",new SimpleDateFormat("dd/MM/yyyy").parse("2/1/1999"),40000));
		emp.add(employee("Megha","M","EEE",new SimpleDateFormat("dd/MM/yyyy").parse("20/3/1998"),65000));
		emp.add(employee("Preeti","Patil","CIVIL",new SimpleDateFormat("dd/MM/yyyy").parse("14/7/2000"),20000));
		emp.add(employee("Poornima","Medar2","CSE",new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2000"),100000));
		 //long total = emp.stream().count();
		 
		
	
		 
		int sum =  emp.stream().map( e -> e.getSalary()).reduce(0, (total, sal) -> total +sal);
		List<Employee> obj = emp.stream().filter(e -> "Poornima".equals(e.getFirstName())).collect(Collectors.toList());
		System.out.println(sum);
		
		OptionalDouble ang = emp.stream().mapToInt(e -> e.getSalary()).average();
	
		
		
		obj.stream().forEach(System.out::print);
	}
	
	
	public static Employee employee(String firstName, String lastName, String department, Date dob, int salary) {
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setDepartment(department);
		employee.setDob(dob);
		employee.setSalary(salary);
		return employee;
	}

}
