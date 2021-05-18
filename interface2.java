package Unit2;

interface i2  //cant be i1 , i1 used earlier in package
{
    int a = 10;
    final int b= 20;
    static final int c = 30;
    StringBuffer s = new StringBuffer("Welcome");
    int arr[]= new int[100];

 /*  for(int i=0;i<10;i++)
    {

    }*/  //not allowed in interface
}

class X1 implements i2
{
    void show()
    {
        System.out.println("a is : "+ a);
        System.out.println("b is : "+ b);
        System.out.println("c is : "+ c);
        System.out.println("s is : "+ s);
        System.out.println("s capacity is : "+ s.capacity()); // s size + 16

        for (int i=0; i<10; i++)
        {
            arr[i]=i+1;
        }
        for (int i=0; i<10; i++)
        {
            System.out.println("Array is : "+arr[i]);
        }

    }
}
public class interface2 {
    public static void main(String[] args) {

        X1 x= new X1();
        x.show();
    }
}
