package methodandconstructorreferance;

class Student{
	int id;
	String firstName;
	String lastName;
	
	Student(int id,String firstName, String lastName){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

@FunctionalInterface
interface Inter{
	public Student get(int id,String firstName, String lastName);
}


public class ConstructorReference {

	public static void main(String[] args) {
		
		//lamda Expression
		Inter i = (id,firstName,lastName) -> new Student(id,firstName,lastName);
		Student s = i.get(1, "Poornima", "Medar");
		System.out.println(s.id+" "+s.firstName+" "+s.lastName);
		
		//Constructor Reference
		Inter i1 = Student::new;
		Student s1 = i1.get(2, "Nanda", "XYZ");
		System.out.println(s1.id+" "+s1.firstName+" "+s1.lastName);
		

	}

}
