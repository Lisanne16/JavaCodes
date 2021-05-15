package Unit1;/* check indataipstream program, there we use try and catch and they remove the io excepions
while not using try and catch we have to use throws for the io exception
if we dont use try & catch OR throws, the readline, read, give errors
 */

import java.io.DataInputStream;
import java.io.IOException;

public class throwsprog {
    public static void main(String[] args) throws IOException
            //if you comment the throws IOException then it will not work
    {

        DataInputStream in = new DataInputStream(System.in);

        int no;
        System.out.println("Enter a number");
        no=Integer.parseInt(in.readLine());
        System.out.println(no);
    }
}
