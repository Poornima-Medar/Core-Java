package demo;
interface interf{
	public static void demo() {
		System.out.println("Static method");
	}
}
public class StaticMethod implements interf{

	public static void main(String[] args) {
		interf.demo();
	}
}
