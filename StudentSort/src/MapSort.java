import java.util.*;
import java.util.Map.Entry;

public class MapSort {

	public static void main(String[] args) {

		Map<Integer, Student> studentMap = new HashMap<>();
		studentMap.put(123, getStudentData("Poornima", "M", "2/2/2000"));
		studentMap.put(546, getStudentData("Sakshi", "U", "12/3/2000"));
		studentMap.put(876, getStudentData("Pratiksha", "U", "12/3/2000"));
		studentMap.put(35, getStudentData("Jhons", "M", "4/5/2001"));
		studentMap.put(88, getStudentData("Poorni", "L", "5/10/2018"));
		studentMap.put(345, getStudentData("Manoj", "C", "10/10/2018"));
		studentMap.put(989, getStudentData("Aman", "D", "4/8/2000"));
		studentMap.put(234, getStudentData("Anuj", "K", "12/2/2000"));
		studentMap.put(768, getStudentData("Om", "D", "30/12/2000"));
		studentMap.put(111, getStudentData("Aman", "D", "4/8/2000"));

		System.out.println("The student data before sorting..");
		System.out.println(studentMap);

		Set<Entry<Integer, Student>> studentSet = studentMap.entrySet();

		List<Entry<Integer, Student>> studentList = new ArrayList<>(studentSet);

		Collections.sort(studentList, new SortByValues());
		System.out.println("Student data sorted based on FirstName");
		System.out.println(studentList);

		Collections.sort(studentList, new SortByValueInReverseOrder());
		System.out.println("Student data sorted in a reverse order based on FirstName");
		System.out.println(studentList);

	}

	private static Student getStudentData(String firstName, String lastName, String birthDate) {
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setBirthDate(birthDate);
		return student;
	}

}
