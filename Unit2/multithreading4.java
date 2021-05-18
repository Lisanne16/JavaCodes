package Unit2;

class Thread1 extends Thread
{
    public void run()
    {
        for(int i=1; i<10; i++)
        {
            System.out.println(i);
        }
    }
}
public class multithreading4 {
    public static void main(String[] args) {

        Thread1 t1= new Thread1();
        Thread1 t2=new Thread1();

        System.out.println("Thread Id is: "+t1.getId());
             //Thread Id is: 11 - dynamically assigned values
        System.out.println("Thread name is: "+t1.getName());
             //Thread name is: Thread-0   -> by default

        t1.setName("Thread 1");
        System.out.println("Thread name is: "+t1.getName());
             //Thread name is: Thread 1    -> new name

        t1.stop();
        System.out.println("IsAlive status is: "+t1.isAlive());
             //IsAlive status is: false

        t1.start();
        System.out.println("IsAlive status is: "+t1.isAlive());
             //IsAlive status is: true

    }
}
