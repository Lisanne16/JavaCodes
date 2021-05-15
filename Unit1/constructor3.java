package Unit1;
//overloadeed constructors
//constructors with same name but with
          // 1. diff datatypes of parameters
          // 2. diff no of parameters

class employee1
{
    static int empno;
    static String empname; //static- value throughout the program remains the same
    static double esal;

    employee1 (int no)
    {
        empno=no;
        System.out.println(empno);
    }

    employee1(String name)
    {
        empname=name;
        System.out.println(empname);
    }

    employee1(double sal)
    {
        esal=sal;
        System.out.println(esal);
    }

    void display()
    {
        System.out.println(empno);
        System.out.println(empname);
        System.out.println(esal);
    }
}
public class constructor3 {
    public static void main(String[] args) {

        employee1 e1= new employee1(5);
        employee1 e2= new employee1("lisanne");
        employee1 e3= new employee1(50.9);
       // employee1 e4= new employee1();
              // gives error cuz  no default constructor created;

       // e3.display(); // this only does e3 displaying - means e1 and e2 values are lost
                             //empno gives 0 and ename gives null
                             // to avoid this we declare all variables as static
           /*output -> 0
                       null
                       50.9*/

        e3.display(); //after making all variables static, all values are printed
                      /*output-> 5
                                 lisanne
                                 50.9 */

    }
}
