//??? why did order change
package Unit2;

//HashSet is a collection , like ArrayList , StringTokenizer, Vectors

import java.util.ArrayList;
import java.util.HashSet;

public class array_list4 {
    public static void main(String[] args) {

        HashSet s1 = new HashSet();  //import java.util.HashSet;

        s1.add("Lisanne");
        s1.add("Harsh");
        s1.add("Ryan");

        System.out.println(s1);
        //[Lisanne, Ryan, Harsh]

        ArrayList a1 = new ArrayList(s1);
          //3rd method - ArrayList(Collection c)
            // what is in the hash list goes to the array list

        for (Object c : a1)
        {
            System.out.println(c);
        }
/*
Lisanne
Ryan
Harsh
 */

   a1.add("Lis");
   System.out.println(a1);
   //[Lisanne, Ryan, Harsh, Lis]


    }
}
