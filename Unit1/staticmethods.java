package Unit1;//static methods
//can be accessed by the classname - no need for object
//static method belongs to the class and not the object of the class
//static methods can only access static variables and other static methods

class employee2
{
    static int empid;
    static String empname;
    String empcomp;

     static void assign() //can access only static members
    {
        empid=100;
        empname="lis";
        //cannot access empcomp cuz its not static
    }
    void notstatic() //can access all data members- static and non static
    {
        empname="chan";
        empid=50;
        empcomp="Val";
    }

    void display()
    {
        System.out.println(empid);
        System.out.println(empname);
        System.out.println(empcomp);
    }

}

public class staticmethods {
    public static void main(String[] args) {

        employee2 obj1= new employee2();

        //to access static method - no need of object
        employee2.assign();
        obj1.display();
                               /*100
                                 lis
                                 null*/
        obj1.notstatic();
        obj1.display();// displays last changed value
           /*  50
               chan
               Val  */
    }
}
