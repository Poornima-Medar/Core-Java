class ThreadTest extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child Thread");
		}
	}
}


public class ThreadPriorityDemo {

	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		t.setPriority(10);
		t.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread");
		}
		
	}

}
