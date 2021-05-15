package Unit1;
//scanner is a in built class in java
import java.util.Scanner;

public class scannerip {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       int no1,no2,sum; char ch;

       do{
           System.out.println("Enter first no");
           no1= in.nextInt();

           System.out.println("Enter second no");
           no2= in.nextInt();

           sum=no1+no2;
           System.out.println("Sum is "+ sum);
           System.out.println("Do you wish to continue?");
           ch=in.next().charAt(0);
       }while(ch=='y');

    }
}
