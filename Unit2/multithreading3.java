package Unit2;
//   by 1. extending thread class

class W123 extends Thread
{
    public void run()    //code inside run() is running thread
    {
        System.out.println("Thread W started");
        for (int i=1; i<=10; i++)
        {
            System.out.println("Thread W value "+i);
            if(i==5)
            {
                System.out.println("W yield");
                Thread.yield();    //Runnable state
                   // yield() changes from running state to runnable state
            }   //yield() - not terminating, just pausing for sometime
        }
        System.out.println("Thread W end");
    }
}

class X123 extends Thread
{
    public void run() // throws InterruptedException - CANNOT do this
           //'run()' in 'Unit2.X123' clashes with 'run()' in 'java.lang.Thread'; overridden method does not throw 'java.lang.InterruptedException'
        //overridden methods cannot throw exception , so other option is to use try catch
    {
        System.out.println("Thread X started");
        for (int i=1; i<=10; i++)
        {
            System.out.println("Thread X value "+i);
            if(i==5)
            {
               try
               {
                   System.out.println("Thread X Sleep"); //Sleep for 10 sec or 10000 milli sec
                   sleep(10000); //throws java.lang.InterruptedException
                   System.out.println("Thread X out of sleep");

                   /*

                   sleep(t)    -> blocked for t seconds
                    OR
                   suspend()   -> blocked until resume() is invoked
                    OR
                   wait()      -> blocked until notify() is invoked

                    */
               }
               catch (InterruptedException e)
               {

               }
            }
        }
        System.out.println("Thread X end");
    }
}

class Y123 extends Thread
{
    public void run()
    {
        System.out.println("Thread Y started");

        for (int i=1; i<=10; i++)
        {
            System.out.println("Thread Y value "+i);
            if(i==5)
            {
                System.out.println("Y stopped");
                stop();  //overriding the method that's why line on stop
                 //does not continue
            }
        }
        System.out.println("Thread Y end");
    }
}

class Z123 extends Thread
{
    public void run()
    {
        System.out.println("Thread Z started");
        for (int i=1; i<=10; i++)
        {
            System.out.println("Thread Z value "+i);
        }
        System.out.println("Thread Z end");
    }
}
public class multithreading3 {
    public static void main(String[] args) {

        W123 w= new W123();
        X123 x= new X123();
        Y123 y= new Y123();
        Z123 z=new Z123();

        w.start();
        x.start();
        y.start();
        z.start();
    }
}
