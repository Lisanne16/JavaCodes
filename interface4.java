package Unit2;

// we can achieve multiple inheritance implementing multiple interfaces

interface p1
{
    int p=10;
    void show1();
}

interface p2
{
    int p = 20;
    void show2();
}

class test1 implements p1, p2
{
    @Override
    public void show1()
    {
        System.out.println("P1");
        System.out.println(p1.p); //same name variables, so interface_name
    }

    @Override
    public void show2()
    {
        System.out.println("P2");
        System.out.println(p2.p); //same name variables, so interface_name . variable_name
    }
}

public class interface4 {
    public static void main(String[] args) {

        test1 t = new test1();
        t.show1();
        t.show2();
    }
}
