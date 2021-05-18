//using command line ???????
//Integer.parseInt();       wrapper class to convert string to integer
//Double.parseDouble();     wrapper class to convert string to double
//Byte b = Byte.parseByte(s);
package Unit2;

import java.io.DataInputStream;
import java.io.IOException;

public class wrapper2 {
    public static void main(String[] args) throws IOException
    {

        DataInputStream in = new DataInputStream(System.in);

        String no1,no2,no3; //numbers are strings
        double avg;

        System.out.println("Enter no1 ");
        no1=in.readLine();    //reading as strings

        System.out.println("Enter no2 ");
        no2=in.readLine();

        System.out.println("Enter no3 ");
        no3=in.readLine();

        //using Double wrapper class to do calculation or to convert strings to double
        avg= (Double.parseDouble(no1) + Double.parseDouble(no2) + Double.parseDouble(no3))/3;
        System.out.println("AVG : "+ avg);

    }
}
