package Unit1;

class box
{
    double length;
    double height;  //data members
    double width;
    String check;
    double ar;
    void area()
    { //variables used here should be part of the class or takes in as parameters
        //double perimeter= 2* length - not allowed, perimeter is not a data member nor a parameter
        ar=length*width;
        check=" done";
    }
    void disp()
    {
        System.out.println("Area : "+ar + check);
    }
}

//declaration - classname objectname;
//initialisation - classname objectname
//initialisation - classname objectname = new classname();

public class class1
{
    public static void main ( String[] args)
    {
        box b1; //declaration
        // b1.height=10; cant do this w/o allocation of memory or initialisation
        b1= new box(); //initialization / memory allocation

        //can do declaration and initialization on same line :
             // box b1= new box();

        b1.height=10; //can do now
        b1.length=20;
        b1.width=30;

        double vol=b1.height*b1.width*b1.length;
        System.out.println("Volume: "+ vol);

       // call the display function to get msg
        b1.area(); // need to call this first of display gives nothing
        b1.disp();
    }
}
