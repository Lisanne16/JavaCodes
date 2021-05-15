package Package1;

//if we want to iuse this anywhere, we have to make this public
   //that is why all functions are public
public class calculator {
   public int addition(int no1, int no2)
    {
        return no1+ no2;
    }
    public int subtraction(int no1, int no2)
    {
        return no1 - no2;
    }
    public int multiplication(int no1, int no2)
    {
        return no1 * no2;
    }
    public int division(int no1, int no2)
    {
        return no1/ no2;
    }

   /* public static void main(String[] args) {
        A a= new A();
        a.show();
    } */
    // W O R K S
    // HERE SHOW CAN BE ACCESSED, THOUGH IT IS PROTECTED AS PROTECTED HAS A SCOPE WITHIN THE PACKAGE

}

//here main not necessary - we are importing this