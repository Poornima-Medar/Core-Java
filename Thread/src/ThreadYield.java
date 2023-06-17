class ChildThread1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child method");
			Thread.yield();
		}
	}
}
public class ThreadYield {

	public static void main(String[] args) {
	     ChildThread1 t = new ChildThread1();
	     t.start();
	     
	     for(int i=1;i<=10;i++) {
	    	 System.out.println("Main method");
	     }

	}

}
