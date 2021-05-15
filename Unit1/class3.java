package Unit1;//parameterised methods

class box1
{
    double width,height,depth;
    double v;

    void getdata(double w, double h, double d)
    {
        width=w;
        height=h;
        depth=d;
    }

    void calcvol()
    {
        v=width*height*depth;
    }

    void display()
    {
        System.out.println("Volume is "+v);
    }
}


public class class3 {
    public static void main(String[] args) {

        box1 b1= new box1();
        b1.getdata(10,5,10);
        b1.calcvol();
        b1.display();

    }
}
