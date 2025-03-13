
import Usethreadclass.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //System.out.println(Thread.currentThread());
        //System.out.println(Thread.currentThread().getName());
        //System.out.println(Thread.currentThread());

        PrintNumber p = new PrintNumber();
        p.start();

        Eating E = new Eating();
        E.start();
        
        Sleeping S = new Sleeping();
        S.start();
    
        Watchingtv w = new Watchingtv();
        Sports s = new Sports();
    
        new Thread(w).start();
        new Thread(s).start();
    
    
    }
}
