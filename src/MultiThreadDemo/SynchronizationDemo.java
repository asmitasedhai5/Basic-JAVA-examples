package MultiThreadDemo;

class Number {
	static int sharedVar=0;
	public synchronized void add() {
		sharedVar=0;
		for (int i = 1; i <= 5; i++) {
			System.out.println(sharedVar+=i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public synchronized void sub() {
		sharedVar=0;
		for (int i = 1; i <= 5; i++) {
			System.out.println(sharedVar-=i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class ThreadNumberOne extends Thread {
	Number n;
	public ThreadNumberOne(Number num) {
		n=num;
	}
	public void run() {
		n.add();
	}

}

class ThreadNumberTwo extends Thread {
	Number n;
	public ThreadNumberTwo(Number num) {
		n=num;
	}
	public void run() {
		n.sub();
	}
}
class ThreadNumberThree extends Thread {
	Number n;

	ThreadNumberThree(Number n) {
		this.n = n;
	}

	public void run() {
		n.add();
	}
}

public class SynchronizationDemo {
	public static void main(String[] args) {
		Number num = new Number(); 
		ThreadNumberOne t1=new ThreadNumberOne(num);  
		ThreadNumberTwo t2=new ThreadNumberTwo(num); 
		ThreadNumberThree t3=new ThreadNumberThree(num);
		t1.start();
		t2.start();
		t3.start();
	}
	
}
