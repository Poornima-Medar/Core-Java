class LazyThread extends Thread{
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("I am Lazy thread");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
			System.out.println("I am Intrrupted");
		}
		
	}
}
public class InterruptedThread {

	public static void main(String[] args) throws InterruptedException{	
		LazyThread t = new LazyThread();
		t.start();
		t.interrupt();
		t.join();
		System.out.println("End of for loop");
	}
}
