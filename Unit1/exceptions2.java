package Unit1;// we can write multiple catch statements
//e.tostring() tells us what the error is

//if the proper name of the exception class is there then no need to go to the common "Exception e" class

//we write one try and multiple catch
public class exceptions2 {
    public static void main(String[] args) {

   try {
       int no1 = 100;
       int res = no1 / 0;
       System.out.println("The result is " + res);
       }

   catch(ArrayIndexOutOfBoundsException e)
   {
       System.out.println(e.toString());  // or e.getMessage()
   }
   catch(ArithmeticException e)
   {
       System.out.println(e.toString());
   }
    }  //java.lang.ArithmeticException: / by zero - gives this exception
}
//e is the object of the different classes
//whichever exception comes first, that gets caught first
     //only one catch block executes at a time