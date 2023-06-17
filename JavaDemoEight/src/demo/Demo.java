package demo;
@FunctionalInterface
interface AB{
	public void m();
}

public class Demo{

	public static void main(String[] args) {
		AB i  = () -> System.out.println("FI");
		i.m();

	}


}
