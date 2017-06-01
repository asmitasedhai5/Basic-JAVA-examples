package MultiThreadDemo;

class Multiplication {

	synchronized static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}

class MulOne extends Thread {
	public void run() {
		Multiplication.printTable(1);
	}
}

class MulTwo extends Thread {
	public void run() {
		Multiplication.printTable(10);
	}
}

class MulThree extends Thread {
	public void run() {
		Multiplication.printTable(100);
	}
}

class MulFour extends Thread {
	public void run() {
		Multiplication.printTable(1000);
	}
}

public class StaticSynchronizationTest {
	public static void main(String args[]){  
		MulOne t1=new MulOne();  
		MulTwo t2=new MulTwo();  
		MulThree t3=new MulThree();  
		MulFour t4=new MulFour();  
		t1.start();  
		t2.start();  
		t3.start();  
		t4.start();  

		
}
}
