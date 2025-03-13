package Usethreadclass;

public class Sports implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"Sports....");
	}
}
