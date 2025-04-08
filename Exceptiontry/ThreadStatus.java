package Exceptiontry;

class pankaj extends Thread{
	public void run() {
		Thread.currentThread().setName("Rajan");
		
		for (int i = 0; i < 10; i++) {
			// try {
			// 	Thread.sleep(5000);
			// } catch (InterruptedException e) {
			// 	e.printStackTrace();
			// }
			//System.out.println(Thread.currentThread().getName() +" === "+ i);
		}
	}

}

class Raman extends Thread {
	public void run() {
		// try {
		// 	Thread.sleep(2000);
		// } catch (InterruptedException e) {
		// 	e.printStackTrace();
		// }
		Thread.currentThread().setName("Suraj");
		
		// for (int i = 0; i < 10; i++) {
		// 	try {
		// 		Thread.sleep(2000);
		// 	} catch (InterruptedException e) {
		// 		e.printStackTrace();
		// 	}
			//System.out.println(Thread.currentThread().getName() +" === "+ i);
		}
	}

public class ThreadStatus {
	public static void main(String[] args) {
		pankaj p = new pankaj();
		Raman r = new Raman();
		System.out.println(p.getState());
		p.start();
		System.out.println(p.getState());
		System.out.println(r.getState());
		r.start();
		System.out.println(r.getState());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(p.getState());
		System.out.println(r.getState());
	}
}
