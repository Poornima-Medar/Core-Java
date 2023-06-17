package optionalclass;

import java.lang.Thread.Builder.OfPlatform;
import java.util.Optional;

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class IfpresentAndIspresent {

	public static void main(String[] args) {

		Person person = new Person("Poornima", 22);
		
		Optional<Person> p = Optional.of(person);
		
		Optional<Person> p2 = Optional.ofNullable(null);
		
		
		if(p.isPresent()) {
			System.out.println(p.toString());
		}else {
			System.out.println("data is not found");
		}
		
		p.ifPresent(p1->System.out.println(p1.toString()));
		
		p2.ifPresent(System.out::println);
		
		
		String a = "";
		
		Optional<String> o = Optional.of(a);
		
		System.out.println(o.get());
		
		
		
		

	}

}
