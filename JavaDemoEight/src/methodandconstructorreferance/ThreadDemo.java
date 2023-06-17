package methodandconstructorreferance;

public class ThreadDemo {
	
	public void m1() {
		for(int i=1;i<10;i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();		
		Runnable r = t::m1;
		
		Thread t1 = new Thread(r);
		
		t1.start();
		

	}

}
