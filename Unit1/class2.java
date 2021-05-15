package Unit1;

class student
{
    String name;
}

public class class2 {
    public static void main(String[] args) {

        student s1= new student();
        //reference to object s1
        student s2=s1;

        s2.name="lisanne";

        //both refer to the same thing
        System.out.println(s2.name);
        System.out.println(s1.name);
    }
}
