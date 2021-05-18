package Unit2;

//thread priority - set the priority of a thread using setPriority(int no) method

class E123 extends Thread
{
    public void run()   //running thread
    {
        System.out.println("Thread E started");
        for (int i=1; i<=10; i++)
        {
            System.out.println("Thread E value "+i);
        }
        System.out.println("Thread E end");
    }
}

class F123 extends Thread
{
    public void run()   //running thread
    {
        System.out.println("Thread F started");
        for (int i=1; i<=10; i++)
        {
            System.out.println("Thread F value "+i);
        }
        System.out.println("Thread F end");
    }
}

class G123 extends Thread
{
    public void run()     //running thread
    {
        System.out.println("Thread G started");

        for (int i=1; i<=10; i++)
        {
            System.out.println("Thread G value "+i);
        }
        System.out.println("Thread G end");
    }
}

class H123 extends Thread
{
    public void run()    //running thread
    {
        System.out.println("Thread H started");
        for (int i=1; i<=10; i++)
        {
            System.out.println("Thread H value "+i);
        }
        System.out.println("Thread H end");
    }
}

public class multithreading5 {
    public static void main(String[] args) {

        E123 e123 = new E123();
        F123 f123 = new F123();
        G123 g123 = new G123();
        H123 h123 = new H123();

        f123.setPriority(10); //F gets most priority
        g123.setPriority(f123.getPriority()-2); //g gets the priority of f means 10 max

        e123.start();
        f123.start();
        g123.start();
        h123.start();

        /*
           In java
             1. Min priority - 1
             2. Norm priority - 5
             3. Max priority - 10

             by default, in java, all have norm priority
         */
    }
}
