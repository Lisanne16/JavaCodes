package Unit2;

/*
similar to "this" keyword
1.used to differentiate members of superclass and subclass if the have same names
2.used to invoke superclass constructor from subclass
 */

class Base
{
    int x, y, total;
    void showbase()
    {
        total=x+y;
       System.out.println("Base sum : "+total);
    }
}

class derived extends Base  //without the super keyword, the local variables are used
       // x=100 and y= 200 will be used
{
    int x=100, y=200, sum;
    void calc()
    {
        super.x=10;  //accesses base class members
        super.y=20;  //accesses base class members

        sum= x+ y;
        System.out.println("Derived sum: "+ sum); //uses local x y 100 200, gives sum 300
             //without super, local var would become 10 20 and sum 30

        showbase();  //uses base class x y 10 20, gives sum 30
            // without using super, the show base would give you 0 as sum
    }
    void allcalc()
    {
        int sum;
        sum=x+y+super.x+super.y;
        System.out.println("Total sum : "+sum);
    }
}


public class SuperKeyword {
    public static void main(String[] args) {

        derived D = new derived();
        D.calc();
        D.allcalc();
    }
}
