//?? why 0 initial size
package Unit2;

import java.util.ArrayList;

public class array_list3 {
    public static void main(String[] args) {

        ArrayList student = new ArrayList(2);
         // second method usind constructors
        //can specify Integer or String, but if we dont specify then it takes it as an object (no prob)

        System.out.println("Initial size: "+student.size());

        student.add("A");
        student.add("B");
        student.add("C");
        student.add("D");
        System.out.println(student);

        System.out.println("New size: "+student.size());
          //size is extended automatically
    }
}
/*
Initial size: 0
[A, B, C, D]
New size: 4

 */