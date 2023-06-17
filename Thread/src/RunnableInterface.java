class ThreadDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child method " + i);
		}
	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); //main
		ThreadDemo r = new ThreadDemo();
		Thread t = new Thread(r);
		System.out.println(t.getName());
		t.start();
		
		Thread.currentThread().setName("Poornima");
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(10/0);
		for(int i=1;i<=10;i++) {
			System.out.println("Main Method "+i);
		}
		
		

	}

}
