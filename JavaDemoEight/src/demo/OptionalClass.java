package demo;
import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		// the argument passed to the of() method can't be null. Otherwise, we'll get a
		// NullPointerException:
		//String name = null;
		String name = "Poornima";
		Optional.of(name);
		System.out.println(name);
		
		//But in case we expect some null values, we can use the ofNullable() method:
		String name1 = null;
	    Optional<String> opt = Optional.ofNullable(name1);
	    boolean l =  opt.isPresent();
	    boolean l1 = opt.isEmpty();
	    System.out.println(l);
	    System.out.println(l1);

	    
	    //Conditional Action With ifPresent()
	    Optional<String> s = Optional.ofNullable("Poornima");
	    s.ifPresent(s1-> System.out.println(s1.length()));
	    
	    //Default Value With orElse()
	    String n = null;
	    String n1 = Optional.ofNullable(n).orElse("Poornima");
	    if(n1=="Poornima") {
	    	System.out.println("Hi");
	    }else {
	    	System.out.println("Bye");
	    }
	    
	    //Exceptions With orElseThrow()
	    String nullName = null;
	    //String s1 = Optional.ofNullable(nullName).orElseThrow();
	    //String na = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
	    
	    
	    //Returning value with get()
	    //get() can only return a value if the wrapped object is not null; otherwise, it throws a no such element exception:
	    Optional<Integer> num = Optional.ofNullable(10);
	    Integer num1 = num.get();
	    System.out.println(num.get());
	    System.out.println(num1);
	    
	    
	    //Conditional Return With filter()
	    Optional<Integer> age = Optional.ofNullable(18);
	    boolean flag = age.filter(a->a==18).isPresent();
	    System.out.println(flag);
	    
	    boolean flag1 = age.filter(a -> a>18).filter(a->a==18).isPresent();
	    
	    System.out.println(flag1);
	    
	}


}
