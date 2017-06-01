package MultiThreadDemo;

public class ThreadExampleOne extends Thread {
	public void run(){
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		ThreadExampleOne th=new ThreadExampleOne();
		th.start();
		//th.start();we cannot start a thread twice..
	}
}
