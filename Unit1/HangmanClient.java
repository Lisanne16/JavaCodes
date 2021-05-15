package Unit1;

import java.net.*;
import java.io.*;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class HangmanClient {
    public static void main(String[] args)  {
        try {
            Socket s = new Socket("localhost", 4999);
            Scanner sc = new Scanner(System.in);
            Set<String> previousGuesses = new HashSet<>();
            int attempt=0,k=0;

            BufferedInputStream br = new BufferedInputStream(s.getInputStream());//Object joining the server and client program using Socket
            ObjectInputStream obj = new ObjectInputStream(br);
            Object value = obj.readObject();//The word is migrated from server to client using Object class


            String g =value.toString();//Converting the migrated object to String
            char[] hide = g.toCharArray();
            char[] wordToGuesschars = g.toCharArray();
            int length = g.length();
            System.out.println("The word is ");
            for(int i=0;i<length;i++)
            {
                hide[i] = '*';
            }


            System.out.println();

            System.out.println("The word is of "+length+" letters");

            while(!String.valueOf(hide).equals(g)) {
                boolean repeated = false;
                boolean correct = false;

                for (int a = 0; a < length; a++) {
                    System.out.println(hide[a]);
                }

                System.out.println();
                System.out.println("Type your guess");

                String currentGuess = sc.next().toUpperCase().substring(0, 1);
                char c = currentGuess.charAt(0);
                if (previousGuesses.contains(currentGuess)) {
                    System.out.println("You already guessed this letter! Guess again. Your previous guesses were: ");
                    System.out.println(previousGuesses.stream().reduce("", String::concat));
                    repeated = true;
                }
                previousGuesses.add(g);

                if (!repeated) {
                    int times = 0;
                    for (int i = 0; i < length; i++) {
                        if (wordToGuesschars[i] == c) {
                            hide[i] = c;
                            correct = true;
                            times++;
                        }
                    }
                    if (correct) {
                        System.out.println("The letter " + c + " is in the word to be found. There are " + times + " " + c + " 's in the word. Revealing the letter/s :");
                    } else {
                        System.out.println("Sorry, the letter does not belong in this word. ");
                    }
                    System.out.println();

                }
                attempt++;

            }
            if(attempt<=7) {
                System.out.println("You guessed the word " + g + " in " + attempt + " attempts");
                System.out.println("Congratulations! You won the game.");


            }
            else
            {
                System.out.println("The Hangman was hung as you took too many attempts.");
                System.out.println("Better luck next time! You lost the game.");

            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}

