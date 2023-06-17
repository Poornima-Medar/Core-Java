
public class MainThreadDeadLock {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().join();
	}

}
