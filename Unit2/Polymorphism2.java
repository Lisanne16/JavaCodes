package Unit2;

class Employee
{
    void getdata(String dname)
    {
        System.out.println("worker");
    }
    void getdata(String dname, String cname)
    {
        System.out.println("supervisor");
    }
    void getdata(String dname, String cname, int emp)
    {
        System.out.println("engineer");
    }

}
public class Polymorphism2 {
    public static void main(String[] args) {

        Employee obj1 = new Employee();
        obj1.getdata("lis");
        obj1.getdata("lis","har");
        obj1.getdata("lis","har",10);
    }
}
