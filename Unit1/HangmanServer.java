package Unit1;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class HangmanServer {
    public static void main (String[] args)
    {
        try {
            ServerSocket ss = new ServerSocket(4999);
            Socket s = ss.accept();
            String word;
            System.out.println("Client connected");


            Scanner st = new Scanner(System.in);
            System.out.println("Enter a word");
            word = st.nextLine().toUpperCase();
            char[] wordGuess = word.toCharArray();
            char[] hide = word.toCharArray();
            for (int i = 0; i < word.length(); i++) {

                hide[i] = '*';

            }

            System.out.println("The word is " + word);

            BufferedOutputStream bro = new BufferedOutputStream(s.getOutputStream());
            ObjectOutputStream ob = new ObjectOutputStream(bro);
            ob.writeObject(word);
            ob.flush();




        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

