package Unit2;

//****I M P O R T A N T****
/* OVERLOADING requires only 1 class, can have more
   OVERRIDING requires a base and derived class
 */
//"final", "static", "private" methods cannot be overridden
//private can be overridden but gives error at the time of accessing members with object
//constructors cannot be overridden

class parent
{
    void show()
    {
        System.out.println("Parent");
    }
}
class child extends parent
{
    void show()
    {
        System.out.println("Child class");
    }
}
public class Polymorphism4 {
    public static void main(String[] args) {

        //dynamic dispatch method OR upcasting - trying to refer to the child class using the parent class
        parent p = new child();
        p.show(); //child class method accessed - parent object referring to child
           //decision taken by JVM

      //  child c = new parent(); cannot be done

        parent p1 = new parent();
        child c1 = new child();

        p1=c1;  //p1 has object reference of c1
            //p1 is now pointing to the child class
        p1.show(); // child class method is accessed

      //  c1=p1; does not work cuz parent cannot be converted to child

        /* DO NOT WORK :
             1. child c = new parent();
             2. c1=p1;
         */
        parent p2 = new parent();
        p2.show(); //accesses parent class show
          //decided by JVM
    }
}
