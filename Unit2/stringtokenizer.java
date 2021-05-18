package Unit2;

/* java.util.StringTokenizer allows u to break the string into tokens
   3 ways- constructor->
              1. StringTokenizer(String str)
              2. StringTokenizer(String str, String delim)
              3. StringTokenizer(String str, String delim, boolean returnvalue)
 */

import java.util.StringTokenizer;

public class stringtokenizer {
    public static void main(String[] args) {

        StringTokenizer str1 = new StringTokenizer("I am a dell laptop and working well");
           //first way

        int count1 = str1.countTokens(); //number of words
        System.out.println("Count 1 is: "+count1);

        while(str1.hasMoreTokens())
        {
            System.out.print(str1.nextToken());
           // Iamadelllaptopandworkingwell
               //goes next till all tokens are over
            //spaces are not tokens

        }//has more elements and has more tokes are DIFFERENT
        //here delimiter be default is " " space

        StringTokenizer str2 = new StringTokenizer("A:book:is:very:good",":");
        //second way - sentence and delimiter is :

        int count2= str2.countTokens();
        System.out.println("Count 2 is "+count2);

        while (str2.hasMoreTokens())
        {
            System.out.println(str2.nextToken());
        }  //here delimiter is ":"

        StringTokenizer str3 = new StringTokenizer("Mobile*is*working*well","*",true);
        //third way - sentence and delimiter is * returns delimiter as a token

        int count3= str3.countTokens();
        System.out.println("Count 2 is "+count2);

        while (str3.hasMoreTokens())
        {
            System.out.println(str3.nextToken());
        }

/*
Mobile
*
is           //when TRUE it returns the delimiter also - delimiter is a token
*
working
*
well
 */
        StringTokenizer str4 = new StringTokenizer("Mobile*is*working*well","*",false);
        //third way - sentence and delimiter is * does not return delimiter as a token cuz false

        int count4= str4.countTokens();
        System.out.println("Count 2 is "+count4);

        while (str4.hasMoreTokens())
        {
            System.out.println(str4.nextToken());
        }
/*
Mobile
is          works nomally WITHOUT delimiter when FALSE
working
well

 */



    }
}
