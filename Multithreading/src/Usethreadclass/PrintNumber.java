package Usethreadclass;

public class PrintNumber extends Thread {

	public void run(){
		System.out.println(Thread.currentThread().getName()+" is Running ");
	}

}
