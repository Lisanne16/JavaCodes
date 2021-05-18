package Unit2;
//final variable but not initialized, initialized in the constructor
//cannot be initialized in another method, ONLY CONSTRUCTOR

//static blank final variables can be initialised in the static block only
class X
{
    final int count; //declaring not defining or initializing so we need to initialize in a constructor only
     //here count is called blank final variable or uninitialized final variable

    X(int a)
    {
        count = a;  //initializing or defining
        System.out.println(a);
    }
    void show()
    {
       // count+=1; cant be done - constant
      //  count=12; // this error is given- Cannot assign a value to final variable 'count'
    }

}
public class final2 {
    public static void main(String[] args) {

        X obj = new X(10);

    }
}
