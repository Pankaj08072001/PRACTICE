public class PrintNum implements Runnable
{
    int num;
    public PrintNum(int num)
    {
        this.num=num;
    }
    @Override
    public void run() {
        System.out.println("num="+num+" by "+Thread.currentThread());
    }
}
