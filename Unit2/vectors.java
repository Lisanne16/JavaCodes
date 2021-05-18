//vector class is like dynamic array
//size should be <= capacity(max space reserved for an array )
//increment by how much specified by you
//if dont specify, automatically doubles in size (new capacity + Initial capacity)

/*Vector constructors can be

1. public Vector();

2. public Vector(int initialCapacity);

3.public Vector(int initialCapacity, int capacityIncrement)
 */
package Unit2;

import java.util.Vector;

public class vectors {
    public static void main(String[] args) {

        Vector v1 = new Vector();

     //if we put v1.addElement("A"); here then initial size would be 1
        System.out.println("Initial size : "+v1.size()); //size is no. of elements
        System.out.println("Initial capacity : "+v1.capacity());
        //by default size is 0 , capacity is 10

        v1.addElement("A");
        System.out.println("Size after adding an element : "+v1.size());

        for(int i=0; i<5; i++)
        {
            v1.addElement(i);
        }
        System.out.println(v1);
        System.out.println("Size after for loop : "+v1.size());
        System.out.println("Capacity after for loop : "+ v1.capacity());
        /*Initial size : 0
          Initial capacity : 10
          Size after adding an element : 1
                [A, 0, 1, 2, 3, 4]
          Size after for loop : 6
          Capacity after for loop : 10
         */
        //here size is 6, capacity is 10 : size < capacity
        //if size > capacity (run for loop till i =10), capacity becomes 20
        //next time capacity becomes 30 , 40, 50 (double of initial capacity)

        for(int i=0; i<5; i++)
        {
            v1.addElement(i);
        }
        System.out.println(v1);
        System.out.println("Size after 2nd for loop : "+v1.size());
        System.out.println("Capacity after 2nd for loop : "+ v1.capacity());
   // next capacity will be 30

        v1.remove("A");   //removes A
        System.out.println(v1);

    }
}
