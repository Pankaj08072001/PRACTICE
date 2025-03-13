package MultiThreadingTry;

class Process3 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("World ");
		}
	}
}

public class ThreadPerority {
	public static void main(String[] args) throws InterruptedException {
		// System.out.println(Thread.MAX_PRIORITY);
		// System.out.println(Thread.MIN_PRIORITY);
		// System.out.println(Thread.NORM_PRIORITY);
		// System.out.println(Thread.currentThread().getName());
		// System.out.println(Thread.currentThread().getClass());
		// Thread.currentThread().setName("Pankaj");
		// System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.activeCount());

		Process1 p1 = new Process1();
		p1.start();
		p1.setPriority(5);
		Thread.sleep(2000);
		System.out.println(p1.getState());

		Process3 p3 = new Process3();
		p3.run();
		Thread.sleep(1000);
		System.out.println(p3.getState());

	}
}
