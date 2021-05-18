package Unit2;

//interface cannot be extended by a *class* BUT one interface can extend another interface

interface product  //product is parent here
{
    String pname=" pen ";
    int pcost = 10;
}

interface productdetails extends product //productdetails is the child
{
    void show();
}

class customer implements productdetails
{
    @Override
    public void show() {
        System.out.println("Name is: "+pname); //only implementing the child class but we can use the data of the parent class
        System.out.println("Cost is : "+pcost);
    }
}

public class interface6 {
    public static void main(String[] args) {

        customer c = new customer();
        c.show();
    }
}
