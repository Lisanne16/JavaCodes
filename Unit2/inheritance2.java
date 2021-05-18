package Unit2;

//private can only be accessed in that class
//protected can be accessed in the inherited class and by objects also
//public can be accessed in the inherited class and by objects also

//Single level inheritance

class A1
{
    private int i;
    protected int k;
}

class A2 extends A1
{
    int j;
    void setdata(int x, int y)  //cannot access i here as it is private
    {
        j=x;
        k=y;
    }
    void show ()
    {
        System.out.println(j);
        System.out.println(k);
    }
}
public class inheritance2 {
    public static void main(String[] args) {

        A2 obj = new A2();
        obj.setdata(5,8);
        obj.show();

    }
}
