package MultiThreadingTry;

class Process1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+ "  Hello");
		}

	}
}

class Process2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"  World");
		}
	}
}

public class ExceptionThread {
	public static void main(String[] args) throws Exception {
		Process1 p1 = new Process1();
		Process2 p2 = new Process2();
		Thread.sleep(1000);
		p1.start();
		p2.start();

	}
}
