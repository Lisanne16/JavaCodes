package Unit1;//????????? doubt

//try in a try
// each try needs atleast one catch

public class nestedtry {
    public static void main(String[] args) {

    int no1=10;
    int no2=2;
    int div;

    int arr[]={11,12};

    try  //outer try
    {
        div=no1/no2;
        System.out.println(div);

        try  //inner try
        {
            arr[1]=100;
           System.out.println(arr[1]);
        }
        catch(Exception e)   //inner catch
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Inner finally");
        }
    }
    catch(Exception e)  //outer catch
        {
            System.out.println(e.getMessage());
        }
    finally
        {
            System.out.println("Outer finally");
        }


    }
}
