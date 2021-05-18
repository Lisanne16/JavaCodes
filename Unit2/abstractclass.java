package Unit2;

/*abstraction is the process of hiding the implementation details and showing obly functionality to the user
it only shows the essential things to the user and hides the internal details
two ways 1. abstract class (0% to 100%)
         2. Interface(100%)

class which contains abstract keyword in it is called abstract class
may or may not contain abstract methods
if even one abstract method is there , class much be declared abstract

abstract classes cannot be instantiated - we cannot create an object of an abstract class

to use abstract class, we have to INHERIT it from another class
if you inherit it, you HAVE TO provide implementations to all the methods in it
 */

//Correct->
abstract class T1
{
    void show() //not an abstract method, has to have abstract keyword to be abstract
    {
        System.out.println("Abstract class");
    }
}

//Not Correct-> we have to put abstract before class because it contains an abstract method
/* class T1
{
    void show() //not an abstract method, has to have abstract keyword to be abstract
    {
        System.out.println("Abstract class");
    }

    abstract void temp();
}*/

//Correct->
abstract class T2
{
    void show() //not an abstract method, has to have abstract keyword to be abstract
    {
        System.out.println("Abstract class");
    }
    abstract void temp();
    {

    }
}

class T3 extends T1
{ //no problem cuz no abstract methods in T1
}

class T4 extends T2 //gives error cuz we have to implement the abstract method in T2
{
    //T4 inherited abstract class T2 and uses its temp and show
    void temp()
    {
        System.out.println("In class T4 and implementing temp abstract method");
    }
}


public class abstractclass {
    public static void main(String[] args) {

        // T1 obj= new T1();  -> cannot be done
        T4 obj1 = new T4();
        obj1.temp();
        obj1.show();

        }
    }

