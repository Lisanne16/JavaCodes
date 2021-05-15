package Unit1;//inner or nested classes can be static or non static

class A   //outer class
{
    void showA()
    {
        System.out.println("Class A ");
    }
    class B   //inner class or  nested class
    {
        void showB()
        {
            System.out.println("Class B ");
        }
    }

}

public class nestedclass {
    public static void main(String[] args) {

        A obj1 = new A();
        obj1.showA();

        A.B obj2 = obj1.new B(); //for nonstatic class
        obj2.showB();

    }
}
