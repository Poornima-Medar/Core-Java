
public class ChildThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("child thread "+i);
		}
	}
	public void run(int i) {
		System.out.println("Argument method");
	}
}
