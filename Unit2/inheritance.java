package Unit2;
/*
parent class / base class / existing class / super class
child class / derived class / sub class
child class accesses parent class members : reusability concept
 */

//Single level inheritance

class A   //parent
{
    int i, j;
    private int t;
    void showA()
    {
        System.out.println("i and j are: "+ i + j);
    }
}

class B extends A //child  // gets inherited in public mode always
{
    int k,sum;
    private int s;
    void showB()
    {
        System.out.println("k is : "+ k);
    }
    void add()
    {
        sum=i+j+k;   //can directly access
        System.out.println("Sum : "+sum);
    }
}


public class inheritance {
    public static void main(String[] args) {

        B b1 = new B();

        // b1 can access i,j,k,sum, show1, show2 , add
        //cuz by default all these are public
        //b1 cannot access s and t cuz it is private
        b1.i=10;
        b1.j=20;
        b1.k=30;
        b1.showA();
        b1.showB();
        b1.add();

    }
}
