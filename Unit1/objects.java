package Unit1;//passing objects as parameters

class test {
    int a, b;

    test () //empty default constructor
    {  }

    test(int i, int j)
    {
        a = i;  //obj1
        b = j;  //obj1
    }

    boolean equals(test o) // function with returntype boolean and takes object as parameter
    {
        if (o.a == a && o.b == b)   //obj2- o.a o.b , obj1- a b
            return true;
        else
            return false;
    }

    void display(test t1)
    {
        System.out.println(t1.a);
        System.out.println(t1.b);
    }

}

public class objects {
    public static void main(String[] args) {

        test obj1= new test (10,5);
        test obj2= new test (20,5);

        System.out.println("Are they equal? "+ obj1.equals(obj2));
           //obj1 has to call the equals function as it is a class function
              // so obj2 is sent as parameter
                 //so to pass an object to member functions we require 2 objects. eg: obj1.equals(obj2);
                 //to pass an object to a non member function we require 1 object. eg: equals(obj2);

        test obj3=new test();
        obj3.display(obj1);

    }
}
