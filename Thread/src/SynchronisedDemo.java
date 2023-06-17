class Display{
	public synchronized void wish(String name) {
		for(int i=1;i<=10;i++) {
			System.out.println("Good Morning : "+name);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}


class MyThrread extends Thread{
	Display d;
	String name;
	MyThrread(Display d,String name){
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
	
}

public class SynchronisedDemo {

	public static void main(String[] args) {
		Display d = new Display();
		MyThrread  t1 = new MyThrread(d, "Poornima");
		MyThrread  t2 = new MyThrread(d, "Nanda");
		MyThrread  t3 = new MyThrread(d, "Akshata");
		
		t3.start();
		t1.start();
		t2.start();
		

	}

}
