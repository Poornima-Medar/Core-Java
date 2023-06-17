package optionalclass;

import java.util.Optional;

public class Password {

	public static void main(String[] args) {
		String password = " Password ";
		Optional<String> pass = Optional.of(password);

		boolean b = pass.filter(p -> p.equals("Password")).isPresent();
		
		if(b) {
			System.out.println("Password is correct");
		}else {
			System.out.println("Password is incorrect");
		}
		
		
		
		boolean b1 = pass.map(String::trim).filter(p -> p.equals("Password")).isPresent();
		if(b1) {
			System.out.println("Password is correct");
		}else {
			System.out.println("Password is incorrect");
		}
		

	}

}
