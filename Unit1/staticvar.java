package Unit1;//static variables- variables that have only one value in the entire scope of the program

// real life use - to keep track of the no. of visitors on a webpage

class test1
{
    int no1;
    static int no2;

    test1()
    {
        no1=10;
        no2=10;
    }

    void inc()
    {
        no1=no1+1;
        no2=no2+1;
    }

    void display()
    {
        System.out.println("Number 1 (Non static): "+no1);
        System.out.println("Number 2 (Static): "+no2);
    }
}
public class staticvar {
    public static void main(String[] args) {

        test1 obj1=new test1();
        test1 obj2=new test1();
        test1 obj3=new test1();

        obj1.inc();
        obj1.display();

        obj2.inc();
        obj2.display();

        obj3.inc();
        obj3.display();

        /* without static thus the incremented value is lost
        output:
           11
           11
           11
         */

        /*
        with the use of static for no2: no2 value increments
       output:
        Number 1 (Non static): 11
        Number 2 (Static): 11
        Number 1 (Non static): 11
        Number 2 (Static): 12
        Number 1 (Non static): 11
        Number 2 (Static): 13
         */
    }
}
