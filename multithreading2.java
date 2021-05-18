package Unit2;
//   by 1. extending thread class

class A123 extends Thread
{
    public void run()   //running thread
    {
        System.out.println("Thread A started");
        for (int i=1; i<=10; i++)
        {
            System.out.println("Thread A value "+i);
        }
        System.out.println("Thread A end");
    }
}

class B123 extends Thread
{
    public void run()   //running thread
    {
        System.out.println("Thread B started");
        for (int i=1; i<=10; i++)
        {
            System.out.println("Thread B value "+i);
        }
        System.out.println("Thread B end");
    }
}

class C123 extends Thread
{
    public void run()     //running thread
    {
        System.out.println("Thread C started");

for (int i=1; i<=10; i++)
        {
            System.out.println("Thread C value "+i);
        }
        System.out.println("Thread C end");
    }
}

class D123 extends Thread
{
    public void run()    //running thread
    {
        System.out.println("Thread D started");
        for (int i=1; i<=10; i++)
        {
            System.out.println("Thread D value "+i);
        }
        System.out.println("Thread D end");
    }
}
public class multithreading2 {
    public static void main(String[] args) {

        A123 a123 = new A123();
        B123 b123 = new B123();
        C123 c123 = new C123();
        D123 d123 = new D123();

        a123.start();
        b123.start();
        c123.start();
        d123.start();

/*
RANDOM OUTPUT - CHANGES EVERYTIME - WHOEVER GETS ALLOCATED IT COMES
MULTIPLE THREADS ARE INDEPENDENT

 */
    }
}
