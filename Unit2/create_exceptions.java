package Unit2;
//creating our own exceptions
//  import java.lang.Exception;  - imported by default even when not explicitly written
//Exception class is in ^ this

import java.util.Scanner;

class excep extends Exception
{
    excep(String msg)  //constructor of excep (child class)
    {
        super(msg);  //calls to the parent/ super class ( Exception) constructor
             //Exception class already by default has a parameterised constructor in it
    }
}

public class create_exceptions {
    public static void main(String[] args) {

        int age;
        Scanner in = new Scanner(System.in);

        try
        {
            System.out.println("Enter age");
            age = in.nextInt();
            if(age>60)
            {
                throw new excep("Not allowed");
                   // we need constructor in the excep class or else this string will not be accepted
            }
            else
            {
                System.out.println("Allowed");
            }
        }
        catch(excep e)
        {
             System.out.println("The answer is: "+e.getMessage());
        }
    }
}
/*
   //does not trigger catch so " the answer is " is not printed
Enter age
45
Allowed

   //triggers catch block
Enter age
67
The answer is: Not allowed
 */