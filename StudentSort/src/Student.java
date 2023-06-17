import java.util.Objects;

public class Student implements Comparable<Student> {
	private String firstName;
	private String lastName;
	private String birthDate;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName.toLowerCase();
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Student [Fname=" + firstName + ", Lname=" + lastName + ", birthDate=" + birthDate + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthDate, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(birthDate, other.birthDate) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}

	@Override
	public int compareTo(Student that) {
		return this.birthDate.compareTo(that.birthDate);
	}

}
