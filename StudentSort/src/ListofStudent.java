import java.util.*;
class Students implements Comparable<Students>{
	String fname;
	String lname;
	int rollno;
	
	public Students(String fname, String lname, int rollno) {
		this.fname = fname;
		this.lname = lname;
		this.rollno = rollno;
	}
	
	public String toString() {
		return fname+" "+lname+" "+rollno;
	}
//	Annotation
	@Override
	public int compareTo(Students obj) {
		return this.rollno-obj.rollno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fname, lname, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(fname, other.fname) && Objects.equals(lname, other.lname) && rollno == other.rollno;
	}
	
}



public class ListofStudent {
 public static void main(String args[]) {
	 
 Students st1 = new Students("John","K",3);
 Students st3 = new Students("John","K",3);
	 
	 List<Students> students = new ArrayList<>();
	 students.add(new Students("Poornima","Medar",2));
	 students.add(new Students("John","K",3));
	 students.add(new Students("Anu","B",1));
	 students.add(new Students("Megha","M",4));
	 students.add(new Students("Preeti","P",6));
	 students.add(new Students("Pavan","Lr",5));
	 students.add(new Students("Sakshi","U",7));
	 students.add(new Students("Amit","H",9));
	 students.add(new Students("Amit","H",8));
	 students.add(new Students("Jhon","M",10));
	 
	Collections.sort(students);
	System.out.println(students);
	
	Collections.sort(students,new sortByFnamethenLnamethenrollno());
	System.out.println("Comparator\n"+students);
	
	
 }
}

class sortByFnamethenLnamethenrollno implements Comparator<Students>{
	@Override
	public int compare(Students o1,Students o2) {
		if(o1.fname.equals(o2.fname) && o1.lname.equals(o2.lname)) {
			return o1.rollno - o2.rollno;
		}else if(o1.fname.equals(o2.fname)) {
			return o1.lname.compareTo(o2.lname);
		}else {
			return o1.fname.compareTo(o2.fname);
		}
	}
}
