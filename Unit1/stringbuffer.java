package Unit1;

public class stringbuffer {
    public static void main (String[] args){

        StringBuffer str1= new StringBuffer("hello world"); //no declaration required for str
        str1.append(" how"); //string buffer is mutable
        System.out.println(str1);

       System.out.println(str1.insert(4,"hi"));
            //at the 4th index "to" gets inserted

       System.out.println(str1);//it CHANGES str1, not only displaying

        System.out.println(str1.insert(7,"good"));
             //good gets inserted at space and space continues after good

        System.out.println(str1.length()); //length of string after all changes - appending, inserting, etc
        System.out.println(str1.capacity());
          //gives 27 cuz takes the first value of str1 (hello world) in the buffer statement and adds 16 (default capacity) to it
                   //11 + 16 = 27

    }
}
