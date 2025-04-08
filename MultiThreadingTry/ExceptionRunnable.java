package MultiThreadingTry;

class Test implements Runnable {
	public synchronized void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello");
		}

	}
}

class Test1 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("World");
		}
	}
}

public class ExceptionRunnable {
	public static void main(String[] args) throws Exception {
		Test t = new Test();
		Test1 t1 = new Test1();

		Thread T = new Thread(t);
		Thread T1 = new Thread(t1);

		T.start();
		T1.start();
		// Thread.sleep(1000);
		// int k =Thread.MAX_PRIORITY;
		// int k1 =Thread.MIN_PRIORITY;
		// int k2 =Thread.NORM_PRIORITY;
		// System.out.println(k +" "+ k1 +" "+k2);

	}
}
