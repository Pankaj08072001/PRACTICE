public class MyThread4 extends Thread 
{
    @Override
    public void run() {
        // while (true) {
            System.out.println("Hello world! ");
        // }
    }

    public static void main(String[] args) throws InterruptedException{

        // System.out.println(Thread.currentThread().isDaemon());

        MyThread4 myThread = new MyThread4();
        myThread.setDaemon(true); // myThread is daemon thread ( like Garbage collector ) now
        MyThread4 t1 = new MyThread4();
        t1.start(); // t1 is user thread
        myThread.start();
        // t1.join();
        System.out.println("Main Done");
    }
}
/**
 * The JVM terminates a daemon thread when all non-daemon threads have finished executing. This means that if only daemon threads are running, the JVM will exit, even if the daemon threads haven't completed their tasks.
 */