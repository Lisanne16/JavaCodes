package Unit2;

interface first
{
    int a= 5;
    void firstmeth();
}
interface sec
{
    int b=10;
    void secmeth();
}

class use implements first , sec //implement multiple interfaces
{
    public void firstmeth()
    {
        System.out.println("First: "+a);
    }
    public void secmeth()
    {
        System.out.println("Sec: "+b);
    }
}
public class multipleinterface3 {
    public static void main(String[] args) {

    }
}
