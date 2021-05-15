package Unit1;

import java.util.Locale;

public class strings {
    public static void main(String args[])
    {
        String str1a="Hello ";
        str1a=str1a+"World";// string concatenation
        System.out.println(str1a);

        //string class methods
        String str1="Whatever ";
        String str2="Idk ";
        String res;

        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());

        System.out.println(str1.concat(str2));//str1 + str2
        System.out.println(str1);// concatenation does not change the value of str1, only displays
        System.out.println(str2.concat(str1));//str2 + str1

        res=str1.concat(str2);
        System.out.println(res);
        System.out.println(res.charAt(5));// index loc 5

        System.out.println(res.charAt(8)+" k");//spaces are included in the string
        System.out.println(res.contains("idk"));//case sensitive
        System.out.println(res.contains("Id"));//evaluates to true or false
        System.out.println(res.length());
    }
}
