package Unit2;
/*
Java interface is a collection of constants and abstract methods
abstract method- method header w/o a method body
all methods in the interface are abstract, so we dont need to write the abstract modifier (abstract keyword)
all methods in an interface have public visibility / scope by default
in the interface, all member fns and data members end with ' ; '
interface is a reserved word
 */

interface i1
{
    void show1(); //declaration
    void show2();  //public and abstract by default
}

class Abc implements i1 //compulsory to define all methods in the interface
{    //extends keyword - while creating a child class
     //implements keyword - using interface - its not a class or a child class

    void display()
    {
        System.out.println("Class Abc method");
    }
    public void show1()   //has to be public
    {
        System.out.println("Interface method 1");
    }
    public void show2()
    {
        System.out.println("Interface method 2");
    }

}

/*class def implements i1
{
    public void show2()
    {
         System.out.println("Interface method 2");
    }
}*/
//def wont work cuz it will have to implement show1 also

public class interface1 {
    public static void main(String[] args) {

        Abc a1= new Abc();
        a1.display();
        a1.show1();
        a1.show2();

    }
}
