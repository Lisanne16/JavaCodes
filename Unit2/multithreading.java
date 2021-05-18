package Unit2;

/*
Process- Program in execution
multithreading- multiple processes in execution simultaneously/ in parallel
thread- lightweight process
advantages- doesn't block the user
            saves time
            threads are independent, so doesn't affect other threads
Java multithreading - mostly used in games , animations

Life cycle of a thread-
     1. Newborn state   (New thread)    [not yet scheduled for running]
     2. Runnable state  (Active thread)  [resume / notify - thread ready for execution, waiting for availability of processor]
     3. Running state   (Active thread)  [resume / notify - in execution till stops on its own or taken over by other threads]
     4. Blocked state   (Ideal thread / not runnable) [can run when resumed , blocked by suspend / sleep / wait methods, prevented from running / runnable state]
     5. Dead state (Killing the thread / stopping it) [running thread completed - natural death, thread can be killed anytime - premature death, stop() method]

Creating thread- implemented in the form of objects, run(), start()
   by 1. extending thread class
      2. implementing runnable interface

run() & start() - inbuilt methods
 */

class firstThread extends Thread //in java.lang
{
    public void run()    //has to be "run" , cant be run1 or any other name
             //executing thread means executing run method
             //heart and soul of any thread
             //gets initialised using start() method
    {
        System.out.println("Thread has started");
    }

    public void display ()    //does not get called automatically with start()
    {
        System.out.println("I am in display");
    }
    //if we call display() in the run() method then it will get displayed

}

public class multithreading {
    public static void main(String[] args) {

        firstThread t1= new firstThread();
        t1.start();  //starts the thread , this start method is in the Thread class
             //Now firstThread becomes a thread. Earlier it was a class
//OUTPUT- Thread has started - run method is called







    }
}
















