package demo;
interface defaultInterface1{
	public default void method1() {
		System.out.println("first default method");
	}
	
	public default int num() {
		return 10;
	}
}

interface defaultInterface2{
	public default void method1() {
		System.out.println("second default method");
	}
}
public class DefualtMethod implements defaultInterface1,defaultInterface2{
//
//	@Override
//	public void method1() {
//		System.out.println("overided method");
//	}
	
//	@Override
//	public void method1() {
//		// TODO Auto-generated method stub
//		defaultInterface2.super.method1();
//	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		defaultInterface1.super.method1();
	}
	
	
	public static void main(String[] args) {
		DefualtMethod d = new DefualtMethod();
		int a = d.num();
		System.out.println(a);
		d.method1();
	}



}
