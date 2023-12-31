package demo;

public class LambdaWithMultiThreading {

	public static void main(String[] args) {
		//multithreading with using lamda expression
		Runnable r = () -> {
			for(int i=1;i<=10;i++) {
				System.out.println("Child Thread "+i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread "+i);
		}

	}

}
