package methodandconstructorreferance;
@FunctionalInterface
interface Interf{
	
	public void add(int a, int b);
	
}
public class Demo {
	
	public static void sum(int x,int y) {
		System.out.println("The sum is "+(x+y));
	}

	public static void main(String[] args) {
		
		Interf i = (a,b) -> System.out.printf("The addition of %d and %d is %d\n",a,b,(a+b));
		i.add(2, 8);
		
		Interf n = Demo::sum;
		n.add(10, 5);

	}

}
