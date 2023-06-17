class ChildThread3 extends Thread{
	static Thread mainThread;
	public void run() {
		try {
			mainThread.join();
		}catch(InterruptedException e) {	
		}
		for(int i=1;i<11;i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadMainJoin {

	public static void main(String[] args) throws InterruptedException{
		ChildThread3.mainThread = Thread.currentThread();
		ChildThread3 t = new ChildThread3();
		t.start();
		//t.join(); //deadlock
		for(int i=1;i<11;i++) {
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
	
	}

}
