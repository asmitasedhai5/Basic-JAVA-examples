package MultiThreadDemo;

class MyThread extends Thread {
	public MyThread() {
		super("MyThread");
	}

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
}

class ThreadFirst {
	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException ie) {
			System.out.println(ie);
		}
		}

	}
}
