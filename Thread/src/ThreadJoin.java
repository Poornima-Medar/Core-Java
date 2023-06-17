class ChildThread2 extends Thread{
	public void run() {
		for(int i=1;i<11;i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException{
		ChildThread2 t = new ChildThread2();
		t.start();
		t.join();
		for(int i=1;i<11;i++) {
			System.out.println("Main Thread");
		}

	}

}
