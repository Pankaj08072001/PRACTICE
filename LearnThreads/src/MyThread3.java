public class MyThread3 extends Thread 
{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) 
        {
            System.out.println(Thread.currentThread().getName() + " is running...");
            Thread.yield();
        }
    }
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3(); 
        MyThread3 t2 = new MyThread3();
        t1.start();
        t2.start();
    }
}