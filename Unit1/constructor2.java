package Unit1;//parameterised constructor

class book
{
    int bookid;
    String bname;
    String bauthor;

    book (int no, String name, String auth)
    {
        bookid=no;
        bname=name;
        bauthor=auth;
        System.out.println("Parameterised");
    }

    book ()
    {
        bookid=123;
        bname="eh";
        bauthor="Lis";
        System.out.println("Default");
    }

    void display()
    {
        System.out.println(bookid);
        System.out.println(bname);
        System.out.println(bauthor);
    }
}


public class constructor2 {
    public static void main(String[] args) {

        book b1=new book(); //default
        book b2=new book(1,"yo","harsh"); //parameterised
          //number of parameters need to match or error shows

        b1.display(); //gives default values
          //if we dont give default values it prints values as null or 0

        b2.display(); //gives parameterised values

        book b3=b2; //reference so does not call the constructor
        b3.display();//gives parameterised values

        //constructor is called only twice b1,b2
    }
}
