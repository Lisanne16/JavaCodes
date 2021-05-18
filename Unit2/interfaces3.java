package Unit2;

interface table1
{
    void setnum(int x);
    void showtable();
}

class series implements table1
{
    int t;

    @Override// shows that this method is overridden - not necessary to be there

    public void setnum(int x)
    {
        t=x;
    }
    public void showtable()
    {
        for (int i =1; i<10;i++)
            System.out.println(i*t);
    }
}
public class interfaces3 {
    public static void main(String[] args) {

        series s1= new series();
        s1.setnum(5);  //prints 5 times table
        s1.showtable();
    }
}
