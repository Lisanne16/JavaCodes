package Unit2;

/*
arrays are of fixed length - after creation they cannot grow
ArrayList - resizable array
ArrayList class extends AbstractList & implements List interface
defined in Java.util package
supports dynamic arrays
created with a initial size , when size exceeds it automatically enlarges
removal of objects may shrink it
3 constructors-
    1. ArrayList()
    2. ArrayList(int capacity)
    3. ArrayList(Collection c)
 */

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {

        ArrayList city = new ArrayList();  //first method

        city.add("Pune");   //methods of ArrayList
        city.add("Mumbai");
        city.add("Kolkata");
        city.add("Delhi");
        city.add("Bangalore");

        System.out.println(city);

        //[Pune, Mumbai, Kolkata, Delhi, Bangalore] - collection

        for (Object c : city)  // for each object c in city  - iterating
        {
            System.out.println(c);
        }
        /*
        Pune
        Mumbai
        Kolkata
        Delhi
        Bangalore
         */
        System.out.println("Size is "+city.size());   //Size is 5


    }
}

/*
IMPORTANT:
  1. Both arraylist and vectors can have different data types in each vector / arraylist
  2. DIFFERENCE: Vector is synchronized , arraylist is not synchronized
      synchronized- at a time only one can access the data , if its being used then until the use is complete no one else can access it
      not synchronized- all can access a shared data at the same time
 */












