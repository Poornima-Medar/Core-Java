class MyThread extends Thread{
	public void start() {
		super.start();
		System.out.println("Start Method");
	}
	public void run() {
		System.out.println("Run method");
	}
}
public class OvverridingStartMethod {

	public static void main(String[] args) {
	MyThread t = new MyThread();
	t.start();
	t.start();
	System.out.println("Main method");
	}

}
