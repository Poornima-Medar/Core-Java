package optionalclass;

import java.util.Optional;

public class DefaultValue {
	
	public static String getDefaultValue() {
		System.out.println("Default value");
		return "Default";
	}

	public static void main(String[] args) {
		
		String s = null;
		String s1 = "Hello";
		
		Optional<String> o = Optional.ofNullable(s);
		Optional<String> o1 = Optional.ofNullable(s1);
		
		System.out.println(o.orElse(getDefaultValue()));
		System.out.println(o1.orElse(getDefaultValue()));
		
		System.out.println(o.orElseGet(()->getDefaultValue()));
		System.out.println(o1.orElseGet(()->getDefaultValue()));

	}

}
