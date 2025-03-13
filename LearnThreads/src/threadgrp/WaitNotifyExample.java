package threadgrp;

class SharedResource 
{
    private boolean ready = false;

    public synchronized void waitForReady() throws InterruptedException {
        while (!ready) {
            wait();  // Releases the lock and waits
        }
        System.out.println("Resource is ready, proceeding...");
    }

    public synchronized void makeReady() {
        ready = true;
        notify();  // Wakes up one waiting thread
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        // Thread to wait for the resource
        Thread waitingThread = new Thread(() -> {
            try {
                resource.waitForReady();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Thread to signal readiness
        Thread notifyingThread = new Thread(() -> {
            try {
                Thread.sleep(1000);  // Simulate some work
                resource.makeReady();
                System.out.println("Resource is now ready.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        waitingThread.start();
        notifyingThread.start();

        waitingThread.join();
        notifyingThread.join();
    }
}
