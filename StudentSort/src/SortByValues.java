import java.util.Comparator;
import java.util.Map.Entry;
public class SortByValues implements Comparator<Entry<Integer,Student>>{

	@Override
	public int compare(Entry<Integer, Student> o1, Entry<Integer, Student> o2) {
		return o1.getValue().getFirstName().compareTo(o2.getValue().getFirstName());
	}

}
