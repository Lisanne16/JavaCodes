//??????????
package Unit2;

/*operator overloading is not allowed  in java
polymorphism - one name, many forms
method overloading is done in java

1.Compile time / Static polymorphism- (Early binding) -> taking decision at compile time
2.Run time / Non static polymorphism- (Late binding) -> taking decision at run time

1.Method Overloading(type or no of parameters change)- performs Compile time polymorphism
2.Method Overriding(same name in base and derived)- perform run time polymorphism
 */

class ABC
{   double areacircle;
    double areatrangle;

    void Area(double r)
    {
        areacircle = (3.14) * r * r;
        System.out.println("Circle: " + areacircle);
    }
    //diff no. of parameters or diff datatypes

    void Area(double l, double b)
    {
        areatrangle= (0.5)* l* b;
        System.out.println("Traingle: "+areatrangle);
    }

}
public class Polymorphism {
    public static void main(String[] args) {
        ABC obj1 = new ABC();
        obj1.Area(6.2);
        obj1.Area(4.0,5.1);
    }

}
