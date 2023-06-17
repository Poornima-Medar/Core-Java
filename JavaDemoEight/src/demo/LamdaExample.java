package demo;

interface Shape {
	public void draw();
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle draw method");
	}
}

class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Square draw method");
	}
}
class Triangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Triangle draw method");
	}
}



public class LamdaExample {

	public static void main(String[] args) {
		
//		Rectangle r = new Rectangle();
//		r.draw();
		
		//Using Lamda Expression
		Shape rectangle = () -> System.out.println("Rectangle draw method");
		rectangle.draw();
		
		Shape square = () -> System.out.println("Square draw method");
		square.draw();
		
		Shape triangle = () -> System.out.println("Triangle draw method");
		triangle.draw();

		
	}
	public static void m1(int a, int b) {
		System.out.println("the sum is"+a+b);
	}
	
	

}



