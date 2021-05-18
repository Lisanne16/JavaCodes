package Unit2;

import java.util.ArrayList;
import java.util.Collections;

public class array_list2 {
    public static void main(String[] args) {

        //import java.util.ArrayList;
        ArrayList<Integer> mynumbers= new ArrayList<Integer>();
            //integer array list
        // Integer - wrapper class

        //mynumbers.add("test");  - gives an error saying required type is Integer

        mynumbers.add(10);
        mynumbers.add(50);
        mynumbers.add(20);
        mynumbers.add(40);
        mynumbers.add(30);

        System.out.println(mynumbers);
         // [10, 50, 20, 40, 30] - collection

        //import java.util.Collections;
        Collections.sort(mynumbers);  //sorts
        System.out.println(mynumbers);
        //[10, 20, 30, 40, 50] - sorted

        for (int i : mynumbers)   //iterating
        {
            System.out.println(i);
        }
        /*
        10
        20
        30
        40
        50
         */


    }
}
