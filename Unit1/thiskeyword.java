package Unit1;//this keyword

class cal
{
   int no1=10;
   int no2=20;

   cal()
   {
       System.out.println("no1 is " +no1);
       System.out.println("no2 is "+no2);
   }

   //white no1 no2 - formal parameters of the constructor cal
   //purple no1 no2 - data members of the class cal
   //"this" can access only data members and member functions
   //"this" keyword resolves ambiguity

   cal(int no1, int no2)
   {
       no1=this.no1;  //this has access to the data members of the class
       no2=this.no2;  //white no1 and no2 belongs to the formal parameters of the constructor
          //by using "this" keyword we make white no1 no2 into the purple no1 no2

       System.out.println("no1 is "+no1);
       System.out.println("no2 is "+no2);
   }
}

public class thiskeyword {
    public static void main(String[] args) {

        cal obj1= new cal(100,200); // without "this" pointer it prints 100 200, not 10 and 20
        cal obj2=new cal(); //prints 10 and 20

        /* no1=no1;
           no2=no2;

        output:
          no1 is 100
          no2 is 200  without this keyword
          no1 is 10
          no2 is 20*/

        /* no1=this.no1;
           no2=this.no2;

      output:
        no1 is 10
        no2 is 20     with this keyword
        no1 is 10
        no2 is 20*/

       /* this.no1=no1;
          this.no2=no2;

      output:
        no1 is 100
        no2 is 200
        no1 is 10
        no2 is 20
        */
    }
}
