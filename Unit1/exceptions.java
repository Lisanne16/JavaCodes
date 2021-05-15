package Unit1;//exception handling = error handling
//class not found exception, io exception, sql exception, remote exception

/* try
{  code
        }
  catch(Exception classname obj)
  {
   catches the error
  }
 */

//with try and catch all other lines are executed except the exception line
//without try and catch the whole program wont execute

 class exceptions {
    public static void main(String[] args) {
try{
        int a[]=new int[5];

        a[5]=10;
        a[4]=20;
        System.out.println(a[5]);
        System.out.println("hello"); //this in the try block with error wont print
     }

catch (Exception e)// we use base class i.e. Exception cuz we dont know what type of exception will occur
 //catch (ArrayIndexOutOfBoundsException e) - can write this also
{
    System.out.println(e.getMessage());
 System.out.println("Check array index");
}
        System.out.println("hi"); //this prints
    }
}
