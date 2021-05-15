package Unit1;//Datainputstream gives errors sometimes while executing
//Scanner is the best option

import java.io.IOException;
import java.util.Scanner;

class product
{
    int pid;
    String pname;
    Double pprice;
    Scanner in = new Scanner(System.in);

    void getdata()
    {
        System.out.println("ID: ");
        pid=in.nextInt();
        System.out.println("NAME: ");
        pname=in.next();
        System.out.println("PRICE: ");
        pprice=in.nextDouble();
    }

    void display()
    {
        System.out.println(pid);
        System.out.println(pname);
        System.out.println(pprice);
    }
}


public class arrofobjects {
    public static void main(String[] args) throws IOException
    {
        product obj[]=new product[4]; //array of objects
// normal array declaration is int arr[]= new int[5];
        // syntax: datatype array_name [] = new datatype [size];
              //here the datatype is class type

        for(int i=0; i< obj.length; i++)
        {
            obj[i]=new product();
            obj[i].getdata();
            obj[i].display();
        }
    }
}
