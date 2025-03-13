import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // System.out.println(1/0);
        // System.out.println(Thread.currentThread().getName());
        // System.out.println(Thread.currentThread());
        // Eat e=new Eat();
        // WatchTV w=new WatchTV();
        // Talk t=new Talk();

        // e.eat();
        // w.watching();
        // t.talking();
        // e.start();
        // Thread et=new Thread(e, "eat thread");
        // Thread wt=new Thread(w, "watch thread");
        // Thread tt=new Thread(t, "talk thread");
        // et.start();
        // wt.start();
        // tt.start();

        // et.join();
        // wt.join();
        // tt.join();
        // System.out.println("All Task Done!");

        // Thread t = new Thread(new Runnable() {
        // @Override
        // public void run() {
        // System.out.println("thread is running by " + Thread.currentThread());
        // }
        // });
        // t.start();
        // new Thread(new Runnable() {
        // @Override
        // public void run() {
        // System.out.println("thread is running by " + Thread.currentThread());
        // }
        // }).start();
        // new Thread(() -> {
        // System.out.println("thread is running by " + Thread.currentThread());
        // }).start();
        // new Thread(() -> {
        // System.out.println("thread is running by " + Thread.currentThread());
        // }).start();

        // ThreadGroup tGroup = new ThreadGroup("My Thread Group");
        // new Thread(tGroup, () -> {
        //     System.out.println("thread is running by "
        //      + Thread.currentThread());
        // }).start();
        // new Thread(tGroup, () -> {
        //     System.out.println("thread is running by "
        //      + Thread.currentThread());
        // }).start();
        // new Thread(tGroup, () -> {
        //     System.out.println("thread is running by "
        //      + Thread.currentThread());
        // }).start();
        // new Thread(tGroup, () -> {
        //     System.out.println("thread is running by "
        //      + Thread.currentThread());
        // }).start();
        // new Thread(tGroup, () -> {
        //     System.out.println("thread is running by "
        //      + Thread.currentThread());
        // }).start();;
        // System.out.println("Active Threads :" + tGroup.activeCount());
        


        // ExecutorService e=Executors.newSingleThreadExecutor();
        // ExecutorService e=Executors.newFixedThreadPool(5);
        // for (int i = 1; i <= 1000; i++)
        // {
        //     e.submit(new PrintNum(i));
        // }
        // e.shutdown();

        // CallableDemo cd=new CallableDemo(10);
        // ExecutorService eService=Executors.newSingleThreadExecutor();
        // Future<Integer> res=eService.submit(cd);
        // System.out.println("result ="+res.get());
        // System.out.println("Thank you");
        // eService.shutdown();

        ArrayList<Integer> numbersList=new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) 
        {
            int temp=(int)(1000*Math.random()+1);
            numbersList.add(temp);    
        }
        System.out.println("Random data:"+numbersList);
        ExecutorService eService=Executors.newSingleThreadExecutor();
        Future<List<Integer>> futr=eService.submit(new ArraySorter(numbersList));
        System.out.println("Sorted data:"+futr.get());
        eService.shutdown();
    }
}
