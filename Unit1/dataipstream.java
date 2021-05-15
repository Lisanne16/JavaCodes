package Unit1;//read() is used to read a character
//readline() is used to read a line or string

import java.io.DataInputStream;

public class dataipstream {
    public static void main(String[] args){
        try {
            DataInputStream in = new DataInputStream(System.in);

            int no1, no2, sum;
            char ch;

            do {
                System.out.println("Enter the first number");

                no1 = Integer.parseInt(in.readLine()); //user enters no1 in the form of string

                System.out.println("Enter the second number");
                no2 = Integer.parseInt(in.readLine());

                sum = no1 + no2;
                System.out.println("Sum is " + sum);

                System.out.println("Do you wish to continue? ");
                ch = (char) System.in.read();
            } while (ch == 'y' || ch == 'Y');
        }
        catch(Exception e)
        {}
    }
}