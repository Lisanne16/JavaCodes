package Unit2;

import java.util.Vector;

public class vectors2 {
    public static void main(String[] args) {

        int size;

        Vector v1 = new Vector();

        System.out.println("Initial size : "+v1.size()); //size is no. of elements
        System.out.println("Initial capacity : "+v1.capacity());

        v1.addElement("A");
        System.out.println("Size after adding an element : "+v1.size());

        for(int i=0; i<10; i++)
        {
            v1.addElement(i);
        }
        System.out.println(v1);
        System.out.println("Size after for loop : "+v1.size());
        System.out.println("Capacity after for loop : "+ v1.capacity());


        v1.remove("A");   //removes A
        System.out.println(v1);

        //copy vector array into the object array by using copyInto method
        size=v1.size();
        Object obj1[]= new Object[size]; //Object class is inbuilt

        v1.copyInto(obj1);

        for(int i=0; i<size; i++)
        {
            System.out.println(obj1[i]);
        }

        /*
        0
        1
        2
        3
        4
        5
        6
        7
        8
        9
         */
        for(int i=0; i<size; i++)
        {
            System.out.print("\t"+obj1[i]);
        }
        System.out.println();
        for(int i=0; i<size; i++)
        {
            System.out.print("\t"+v1.elementAt(i));
        }
       /*
    0	1	2	3	4	5	6	7	8	9
	0	1	2	3	4	5	6	7	8	9
        */

        System.out.println("\nVector contains 2 ? "+v1.contains(2));
        //Vector contains 2 ? true

        System.out.println("\nAfter clearing: ");
        v1.clear();
        System.out.println("Is the vector empty? "+v1.isEmpty());

        /*After clearing:
        Is the vector empty? true*/

    }
}

