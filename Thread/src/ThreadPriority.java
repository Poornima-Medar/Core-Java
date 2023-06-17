
public class ThreadPriority extends Thread{

	public static void main(String[] args) {
		//To get Thread Priority
		System.out.println(Thread.currentThread().getPriority());
		
		//To set Priority
		//Thread.currentThread().setPriority(14); // Priority range is 1 to 10
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		
		//child thread inherits the parent thread
		ThreadPriority t = new ThreadPriority();
		System.out.println(t.getPriority());
	
		
		

	}

}
