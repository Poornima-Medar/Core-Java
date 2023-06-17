package consumer;

import java.util.function.Consumer;
import java.util.function.Predicate;

class Student {
	String name;
	String address;

	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

}

public class PrintStudent {

	public static void main(String[] args) {
		
		Student[] s = {
				new Student("A","B"),
				new Student("C", "D"),
				new Student("E","F")			
		};
		
		
		Predicate<String> p = p1 -> p1!="A";
		
		Consumer<Student> c = student -> {
			if(p.test(student.name)) {
			System.out.println(student.name+" "+student.address);
			}
		};
		
		for(Student s1:s) {
			
			c.accept(s1);
		}

	}

}
