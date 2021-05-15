package Package1;

public class A {

    public void display()
    {
        System.out.println("Public ");
    }
    void show()
    {
        System.out.println("Protected");
        //Never accessible outside package cuz its not public - by default protected
    }

}
