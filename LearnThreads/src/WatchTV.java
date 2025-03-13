public class WatchTV extends Thread
{
    void watching()
    {
        System.out.println("watching tv.... by "+Thread.currentThread());
    }
    
    @Override
    public void run()
    {
        watching();
    }
}
