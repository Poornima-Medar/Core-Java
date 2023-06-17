package Synchronized;

class DisplayBoard{
	public void diplay(String name) {
		;;;;;;;;;// 1 Lack of Code
		synchronized(this) {
		for(int i=1;i<=10;i++) {
			System.out.println("Good Morning : "+name);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
		}
		;;;;;;;;;;// 1 Lack of Code
	}
	}
}

class MyThread extends Thread{
	DisplayBoard d;
	String name;
	MyThread(DisplayBoard d,String name){
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.diplay(name);
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		DisplayBoard d = new DisplayBoard();
		MyThread t1 = new MyThread(d, "Poornima");
		MyThread t2 = new MyThread(d, "Sakshi");
		t1.start();
		t2.start();
		
		
	}

}
