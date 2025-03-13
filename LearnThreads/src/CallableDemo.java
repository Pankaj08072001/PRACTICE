import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> 
{
    int num;
    int sum;
    CallableDemo(int num)
    {
        sum=0;
        this.num=num;
    }
    @Override
    public Integer call() throws Exception 
    {
        for (int i = 1; i <= num; i++) 
        {
            sum+=i;
            System.out.println("sum="+sum+" by "+Thread.currentThread());
        }
        return sum;
    }
}