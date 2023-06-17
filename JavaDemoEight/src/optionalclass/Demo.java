package optionalclass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(23,56,123,2,9,80);
		
		Optional<List<Integer>> list1 = Optional.of(list);
		
		int volume = list1.map(List::size).orElse(0);
		
		if(volume != 0) {
			System.out.println(volume);
		}
		

	}

}
