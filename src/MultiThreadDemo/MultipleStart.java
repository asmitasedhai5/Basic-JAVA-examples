package MultiThreadDemo;

public class MultipleStart extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("From Thread First:" + i);
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
		}
	}
	public static void main(String[] args) {
		MultipleStart t1=new MultipleStart();
		MultipleStart t2=new MultipleStart();
		
		t1.start();
		t2.start();
	}
}
