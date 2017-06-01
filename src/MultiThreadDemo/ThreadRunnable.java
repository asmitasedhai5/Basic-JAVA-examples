package MultiThreadDemo;

public class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=5;i++){
			System.out.println("Thread A :"+i);
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
		}
		
	}
	public static void main(String[] args) {
		ThreadRunnable th=new ThreadRunnable();
		Thread thread=new Thread(th);
		thread.start();
		
		for(int i=0;i<=5;i++){
			System.out.println("Thread B :"+i);
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
		}
	}

}
