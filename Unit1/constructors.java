package Unit1;//constructors program
//special mem fn w/ same name as the class
//when object is created then constructor is called

class mobile
{
    int no;
    String name;
    String colour;

    mobile()
    {
        no=123;
        name="Iphone";
        colour="Pink";
        System.out.println("Constructor called ");
    }

    void display()
    {
        System.out.println(no);
        System.out.println(name);
        System.out.println(colour);
    }
}

public class constructors {
    public static void main(String[] args) {
       mobile m1=new mobile();
       mobile m2=new mobile();
          //2 objects created, so first constructor called twice

        m1.display();
    }
}
