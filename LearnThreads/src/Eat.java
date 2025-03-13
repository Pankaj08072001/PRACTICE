// public class Eat extends Thread
public class Eat implements Runnable
{
    void eat()
    {
        System.out.println("eating.... by "+Thread.currentThread());
        try {
            Thread.sleep(5000);// 5s
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("eating finished...");
    }
    @Override
    public void run()
    {
        eat();
    }
}
