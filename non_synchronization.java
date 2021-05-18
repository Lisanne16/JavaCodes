package Unit2;

//Synchronisation - helps us use data and methods outside the threads run() method
//they may compete for same resources and may lead to problems so we need synchronisation
//deadlock - 2 or more threads are blocked forever waiting for each other

class Table
{
    void print(int n)    //non synchronized method
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println(n*i);
        }
        try
        {
            Thread.sleep(400);
        }
        catch (InterruptedException e)
        {

        }
    }
}

class mythread1 extends Thread
{
    Table t;
    mythread1(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(5);
    }
}

class mythread2 extends Thread
{
    Table t;
    mythread2(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(100);
    }
}
public class non_synchronization {
    public static void main(String[] args) {

    Table obj = new Table();

    mythread1 t1 = new mythread1(obj);   //passing table class object in thread
    mythread2 t2 = new mythread2(obj);   //both threads are sharing the data of table

    t1.start();
    t2.start();

    //random execution , no synchronization , sometimes deadlock may occur


    }
}
