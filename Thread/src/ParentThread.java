
public class ParentThread {

	public static void main(String[] args) {
		ChildThread c = new ChildThread();
		//c.start(); //it creates new or separate thread and there are two thread main thread and child thread
		// c.run(); // normal method call and single thread that is main thread
		
		c.start();
		c.run(1);
		  
		  
		
		for(int i=1;i<=10;i++) {
			System.out.println("Parent Thread "+i);
		}
	}

}
