package Unit1;//outer class CANT access inner class data w/o objects
//inner class CAN access outer class data w/o objects

class outer   //to access the data of inner class, we need to create an object of inner class in the outer class
{
    int no=10;

    inner1 obj1 = new inner1();

    void displayout()
    {
        // System.out.println(no2); // outer class cannot access inner class data
        //displayin() - doesnt work

        System.out.println(obj1.no2);   // works
        obj1.displayin();   //works
    }

      class inner1
     {   int no2=100;
         void displayin()
         {
             System.out.println(no); //inner class can access the members of outer class
         }
     }

}

public class nestedclass3 {
    public static void main(String[] args) {

        outer obj = new outer();
        outer.inner1 obj2= obj.new inner1();

        obj2.displayin(); //cant access outer class stuff from here
        obj.displayout(); //cant access inner class stuff from here
    }
}
