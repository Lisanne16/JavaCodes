package Unit2;
//can be inherited but you cannot override it

/* CAN BE DONE WHEN NOT FINAL ->
class xyz
{
    void show()
    {
        System.out.println("Class xyz");
    }
}

class abc extends xyz
{
    void show()
    {
        System.out.println("Class D");
    }
}*/

//CANNOT BE DONE WHEN SHOW IS FINAL METHOD
class xyz
{
    final void show()
    {
        System.out.println("Class xyz");
    }
}

class abc extends xyz
{
   /* void show()    - cant be done , avoids ambiguity
    {
        System.out.println("Class D");
    }*/

   // void show(int a) this is allowed, polymorphism works

}

public class finalmethod {
    public static void main(String[] args) {

        /*If derived class defines same function as defined in its base class, it is known as function overriding
          xyz obj1 = new xyz();
          xyz obj2 = new xyz();

        System.out.println(obj1.equals(obj2)); //overriding the method
  */

        xyz obj1 = new xyz();
    }
}
