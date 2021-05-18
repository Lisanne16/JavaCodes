package Unit2;

//Unit2 package and Package1 are in different places - no relation btw them

import Package1.calculator1;  //importing user defined package
//or  import Package1.*;
import Package1.Apack;


public class packages2_implementing {
    public static void main(String[] args) {

    calculator1 c1= new calculator1();  //using it
         //this is the calculator class object - if there are more classes we need new objects
        System.out.println("Addition is "+c1.addition(10,20));
        System.out.println("Subtraction is "+c1.subtraction(10,20));
        System.out.println("Multiplication is "+c1.multiplication(10,20));
        System.out.println("Division is "+c1.division(10,20));
    //all these fns RETURN answers so we have to put it in a print statement ot assign its value to a variable


    Apack a1 = new Apack(); //need A object cuz c1 is for calculator and cannot access A class
    a1.display();
        // this function does not return and answer so we can call it like this


    }
}
