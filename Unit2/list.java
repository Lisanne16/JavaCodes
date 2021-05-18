package Unit2;

/*
List is a interface, ArrayList is a class
List - creates list of objects that can be accessed by index number
ArrayList - Dynamic - can change size

Implementing any interface -
   List <datatype> list1 = new ArrayList();

package of both - java.util

List - provides fast manipulation of objects
ArrayList - slow manipulation of objects

List - cannot be instantiated (no objects)
ArrayList - can be instantiated

Namespace -
   List - System.Collection.Generic
   ArrayList - System.Collection

List - extends collection framework
ArrayList - extends Abstract class & implements List interface
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<Integer>();
             //Implementation of List using ArrayList
            //we cant create object of List but we can use reference of arraylist

        l1.add(10);
        l1.add(2);
        l1.add(30);
        l1.add(25);

        for(Integer i : l1)
        {
            System.out.println(i);
        }
/*
10
2
30
25
*/
        for(int i : l1)
        {
            System.out.println(l1);
        }
/*
[10, 2, 30, 25]
[10, 2, 30, 25]
[10, 2, 30, 25]
[10, 2, 30, 25]
*/

        Collections.sort(l1);
        System.out.println(l1);  //[2, 10, 25, 30]

        List books = new ArrayList();
        books.add("Java");
        books.add("C");
        books.add("C++");

        for (Object b : books)
        {
            System.out.println(b);
        }
    }
}
