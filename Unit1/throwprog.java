package Unit1;

class Test
{

    void calculate(int age)
    {
        if(age<18)
        {
            throw new ArrayIndexOutOfBoundsException("You are not Eligible for Voting");
        }

        else
        {
            System.out.println("You are eligible for Voting");
        }
    }
}
public class throwprog {

    public static void main(String[] args) {

        Test obj1 = new Test();
        obj1.calculate(19);

    }
}


