import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudentData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<>();
		studentList.add(getStudentData("Poornima", "M", "2/2/2000"));
		studentList.add(getStudentData("Sakshi", "U", "12/3/2000"));
		studentList.add(getStudentData("Pratiksha", "U", "12/3/2000"));
		studentList.add(getStudentData("Jhon", "M", "4/5/2001"));
		studentList.add(getStudentData("Jhon", "Mr", "2/2/2018"));
		studentList.add(getStudentData("Poorni", "M", "5/10/2018"));
		studentList.add(getStudentData("Raksha", "B", "30/6/2017"));
		studentList.add(getStudentData("Anuj", "K", "12/2/2000"));
		studentList.add(getStudentData("Aman", "G", "19/11/2000"));
		studentList.add(getStudentData("Aman", "D", "4/8/2000"));

		System.out.println("The student data before sorting..");
		System.out.println(studentList);

		Collections.sort(studentList);
		System.out.println("Using Comparable\n");
		System.out.println("Sorted StudentData data on birthDate\n" + studentList);

		Collections.sort(studentList, new SortByFirstNmae());
		System.out.println("Using Comparator");
		System.out.println("Sorted StudentData data on firstName\n" + studentList);

		Collections.sort(studentList, new SortByLastName());
		System.out.println("Using Comparator");
		System.out.println("Sorted StudentData data on lastName\n" + studentList);

		Collections.sort(studentList, new SortByfirstNamethenlastName());
		System.out.println("Using Comparator");
		System.out.println("Sorted StudentData data \n" + studentList);
		
	}

	private static Student getStudentData(String firstName, String lastName, String birthDate) {
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setBirthDate(birthDate);
		return student;
	}
	
	
}
