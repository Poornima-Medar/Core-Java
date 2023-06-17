package demo;
/*
 * valid
@FunctionalInterface
interface A{
	public void m1();
}

@FunctionalInterface
interface B extends A{
}

*/

/*
 * valid
 
@FunctionalInterface
interface A{
	public void m1();
}

@FunctionalInterface
interface B extends A{
	public void m1();
}

*/

/*
 * invalid because B can't be functional interface
@FunctionalInterface
interface A{
	public void m1();
}

@FunctionalInterface
interface B extends A{
	public void m2();
}

*/

//it is valid because interface B not considerd as functional interface
@FunctionalInterface
interface A{
	public void m1();
}

interface B extends A{
	public void m2();
}

public class FunctionalInterfaceWithInheritance {
	public static void main(String[] args) {
		
	}

}
