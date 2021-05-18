package Unit2;

import java.util.ArrayList;
import java.util.HashSet;

public class array_list5 {
    public static void main(String[] args) {

        HashSet h1 = new HashSet();
        h1.add("A");
        h1.add("B");
        h1.add("C");

        //IMPORTANT
        HashSet h2 = new HashSet();
       // h2=null;  //if h2 is null , it throws a null pointer exception
          //java.lang.NullPointerException
          //use if else statements and ONLY if it is not null then add to arraylist


        h2.add(1);
        h2.add(2);
        h2.add(3);


        ArrayList colours = new ArrayList();

        colours.add("Pink");  //index 0
        colours.add("Blue");  //index 1
        colours.add("Red");   //index 2

       // colours.add(4,"Purple");
          //java.lang.IndexOutOfBoundsException - this error is given cuz we need to add at index 3

        colours.add(1,"Purple");
         //does not replace blue, its adds purple BEFORE blue

        System.out.println(colours);
          // [Pink, Purple, Blue, Red]

        colours.addAll(h1);  // adding all elements of h1 to colours
        System.out.println(colours);
        //[Pink, Purple, Blue, Red, A, B, C]

        colours.addAll(2,h2);
        System.out.println(colours);
        //[Pink, Purple, 1, 2, 3, Blue, Red, A, B, C] - h2 gets inserted at index location 2

        colours.remove("B");  //remove an object
        System.out.println(colours);

        colours.remove(4); //removes element at an index
        System.out.println(colours);

        ArrayList arr= new ArrayList();

        arr.add("data");
        arr.add("data");
        arr.add("data");  //adding same element in the array list

        System.out.println(arr.lastIndexOf("data"));
          //returns the index number of the last occurrence of the word data


    }
}
