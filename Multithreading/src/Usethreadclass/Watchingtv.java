package Usethreadclass;

public class Watchingtv implements Runnable {
	public void run(){
		System.out.println(Thread.currentThread().getName()+"Watching movies :");
	}
}

