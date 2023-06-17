import java.util.Comparator;
import java.util.Map.Entry;
public class SortByValueInReverseOrder implements Comparator<Entry<Integer,Student>>{

	@Override
	public int compare(Entry<Integer, Student> o1, Entry<Integer, Student> o2) {
		return o2.getValue().getFirstName().compareTo(o1.getValue().getFirstName());
	}
	
	

}
