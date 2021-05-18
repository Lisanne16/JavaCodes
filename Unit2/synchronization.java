
package Unit2;

//Synchronisation - helps us use data and methods outside the threads run() method
//they may compete for same resources and may lead to problems so we need synchronisation
//deadlock - 2 or more threads are blocked forever waiting for each other

class Table12
{
    synchronized void printtable(int n)    //synchronized method - use the synchronized keyword
    {                              //whoever comes first finishes first
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

class mythread3 extends Thread
{
    Table12 tt;
    mythread3(Table12 tt)
    {
        this.tt=tt;
    }
    public void run()
    {
        tt.printtable(5);
    }
}

class mythread4 extends Thread
{
    Table12 tt;
    mythread4(Table12 tt)
    {
        this.tt=tt;
    }
    public void run()
    {
        tt.printtable(100);
    }
}
public class synchronization {
    public static void main(String[] args) {

        Table12 obj1 = new Table12();

        mythread3 t3 = new mythread3(obj1);   //passing table class object in thread
        mythread4 t4 = new mythread4(obj1);   //both threads are sharing the data of table

        t3.start();
        t4.start();
        //both executing at the same time and referring the same object - locked concept

       //now we get 5 times table first then 100 everytime

    }
}
