package function;

import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	private String name;
	private int marks;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;

	}

}

public class Demo2 {

	public static void main(String[] args) {
		
		Student[] s = { new Student("Pranav",70),
						new Student("Arav",90),
						new Student("chetan",40),
						new Student("John",80),
						new Student("Nick",50),
						new Student("Tom",66)		
					  };
	
		
		
		Function<Student, String> f = s1 ->{
			int marks = s1.getMarks();
			String grade ="";
			if(marks>=90) 
					grade = "A+[Topper]";
			else if(marks>=80)
				grade = "A[Distiction]";
			else if(marks>=60)
				grade = "B[FirstClass]";
			else 
				grade="C[Failure]";
			return grade;	
		};
		
		Predicate<Integer> p = n -> n>60;
		
		for(Student s1: s) {
			if(p.test(s1.getMarks())) {
			System.out.println(s1.getName());
			System.out.println(s1.getMarks());
			System.out.println(f.apply(s1));
			System.out.println();
			}
		}

	}

}
