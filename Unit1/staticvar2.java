package Unit1;//static variables are called class variables
//static variables can be accessed by class name directly

class test2
{
    static int no1=10;
    static int no2=20;
    int no3=5;
}
public class staticvar2 {
    public static void main(String[] args) {

        //obj1.no3; non static can be accessed directly by the object of the class
        //obj1.no1 or obj1.no2; static variables cannot be directly accessed by the object of the class

        test2 obj1=new test2();

        int sum= test2.no1+test2.no2;
        System.out.println("sum of statics are: "+sum);
        //static members can be directly accessed by using class name
        //we dont require object of the class

        int sum2=test2.no1+test2.no2+ obj1.no3;
        System.out.println("Sum of all var is: "+sum2);
    }
}
