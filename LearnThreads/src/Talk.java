public class Talk extends Thread
{
    void talking()
    {
        System.out.println("talking.... by "+Thread.currentThread());
    }
    
    @Override
    public void run()
    {
        talking();
    }
}
