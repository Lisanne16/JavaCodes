package Unit1;//program on finally block
//finally block- compulsary the things are executed even if there are exceptions

public class finallyblock {
    public static void main(String[] args) {

        int arr1[]={2,3};
        int x=50;
        try
        {
            int res=x/arr1[3];
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.toString());
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.toString());
        }
        finally
        {
          System.out.println("Finally block reached");
        }
        /*java.lang.ArrayIndexOutOfBoundsException: 3
          Finally block reached*/

        //finally block executed though there is error
    }
}

