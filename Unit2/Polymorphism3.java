package Unit2;

//run time polymorphism is overriding

class base
{
    void display()
    {
        System.out.println("Parent class");
    }
    void show()
    {
        System.out.println("show base");
    }
}

class der extends base
{
    void display()  //overridden method
    {
        System.out.println("Derived class");
    }
}
public class Polymorphism3 {
    public static void main(String[] args) {

      //  base b = new base();
        der d = new der();

        d.display(); //Accesses derived class display method
        //JVM decides which method to call child or base depending oon the object used
              //object of child class - child class method

        d.show();  //compiler decides which method to call
        //show is not overridden
    }
}
