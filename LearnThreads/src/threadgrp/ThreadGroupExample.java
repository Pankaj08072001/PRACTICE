package threadgrp;

public class ThreadGroupExample {
    public static void main(String[] args) {
        // Create a ThreadGroup
        ThreadGroup group = new ThreadGroup("My Thread Group");

        // Create threads within the group
        Thread t1 = new Thread(group, new MyRunnable(), "Thread-1");
        Thread t2 = new Thread(group, new MyRunnable(), "Thread-2");

        // Start the threads
        t1.start();
        t2.start();

        // Get information about the group
        System.out.println("Active thread count: " + group.activeCount());

        // Interrupt all threads in the group
        group.interrupt();
    }
}

class MyRunnable implements Runnable {
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Re-set interrupted status
                System.out.println(Thread.currentThread().getName() + " is interrupted");
            }
        }
    }
}
