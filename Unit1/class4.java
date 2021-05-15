package Unit1;//access specifiers

// by default classes, data members and member fns are public

class employee  //cant write anything as 'private class employee'
{
    private int empno=10;

    private void displaypriv()
    {
        System.out.println(empno);
    }

    void displaypub()
    {
        System.out.println(empno);
    }

}

public class class4 {
    public static void main(String[] args) {

        employee e1=new employee();

        //System.out.println(e1.empno);
            // wont work cuz we cant access private members with object

        //e1.displaypriv();
            // wont workk cuz displaypriv is a private function not accessible by object

        e1.displaypub(); //works cuz public

    }
}
