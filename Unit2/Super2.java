package Unit2;

class B1
{
    int x;
    B1()
    {
        x=10;
        System.out.println("B1 class");
    }
    B1(int k)
    {
        x=k;
    }
}
class B2 extends B1
{
    int y;
    int sum;
    B2()
    {   //super() must be the first statement in the derived constructor
        super(5); //calling the base class constructor in the derived class
        y=20;
    }
    void showAdd()
    {
        sum=x+y;
        System.out.println("sum: "+sum);
    }
}
public class Super2 {
    public static void main(String[] args) {

        B2 obj1 = new B2();
        //as soon as object is created, constructor is called
        obj1.showAdd();
        //first sum was 30 -> x=10 y=20
        //after super() sum is 25 -> x=k=5 y=20
    }
}
