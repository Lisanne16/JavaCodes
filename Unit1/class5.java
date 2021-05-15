package Unit1;//method inside a method
//nested functions

class example
{
    void  show1()
    {
        System.out.println("Show 1");
    }
    void  show2()
    {
        System.out.println("Show 2");
        show1();
    }
    void  show3()
    {
        System.out.println("Show 3");
        show2();
    }
}

public class class5 {
    public static void main(String[] args) {

        example obj= new example();
        obj.show3(); //Show 3 2 1

    }
}
