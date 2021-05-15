package Unit1;

class A1
{
    void showA1()
    {
        System.out.println("Class A1");
    }

    class B1
    {
        void showA2()
        {
            System.out.println("Class A2");
        }

        //cannot be created as A2 class is not a static class
        /* static void statshowA2()
        {
            System.out.println("static A2");
        } */
    }

    public static class B2 //static class
    {     //can have both ststic functions and non static function
        void showA3()
        {
            System.out.println("Non ststic A3");
        }
        static void statshowA3()
        {
            System.out.println("Static A3");
        }

    }
}

public class nestedclass2 {
    public static void main(String[] args) {

        A1 obj1= new A1();  //non static outer class
        obj1.showA1();

        A1.B1 obj2= obj1.new B1() ;  //non static inner class
        obj2.showA2();

        A1.B2 obj3 = new A1.B2();  //static inner class
        obj3.showA3(); //cant access static fn statshowA3

        A1.B2.statshowA3();  //to access static function
           //no need of objects to access static methods
    }
}
