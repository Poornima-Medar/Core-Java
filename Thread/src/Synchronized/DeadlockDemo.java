package Synchronized;

class A{
	public synchronized void d1(B b) {
		System.out.println("Thread 1 starts excecution of d1 method");
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("Calling last method of B class");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("last method of class A");
	}
}

class B{
	public synchronized void d2(A a) {
		System.out.println("Thread 2 starts excecution of d2 method");
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("calling last method of A class");
		a.last();
	}
	
	public  void last() {
		System.out.println("last method of class B");
	}
	
}

public class DeadlockDemo extends Thread{
	A a = new A();
	B b = new B();
	public void m1() {
		this.start();
		a.d1(b);
	}
	public void run() {
		b.d2(a);
	}

	public static void main(String[] args) {
		DeadlockDemo d = new DeadlockDemo();
		d.m1();
		
	}

}
