package Unit2;

interface div1
{
    final int maxs1 = 500;
    void showmess1();
}

interface div2
{
    final int maxs2 = 200;
    void showmess2();
}

class CSb implements div1
{
    @Override
    public void showmess1() {
        System.out.println("1 div only : "+ maxs1);
    }
}

class CSa implements div1, div2
{
    @Override
    public void showmess1() {
        System.out.println("1 div : "+maxs1+"\n2 div : "+maxs2);
             // we can use data of other interfaces which are implemented in another
           // p1 and p2 has to be implemented for this to happen
    }

    @Override
    public void showmess2() {

    }
}

public class interface5 {
    public static void main(String[] args) {

        CSa a = new CSa();
        a.showmess1();
        a.showmess2();

        CSb b = new CSb();
        b.showmess1();
    }
}
