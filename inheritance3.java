package Unit2;

//hierarchical inheritance and multilevel
//college<- IT <- ITstudent ,  college<- CS <- CSstudent

class college
{
    String cname;
}

class IT extends college
{
    int detid;
    String depname;

    void getitdata(int id, String name)
    {
        cname="SIT";
        detid=id;
        depname=name;
    }
}

class CS extends college
{
    int detid;
    String depname;
    void getcsdata(int id, String name)
    {
        cname="SIT";
        detid=id;
        depname=name;
    }
}

class CSstudent extends CS
{
    String sub1;

    void setcs()
    {
        getcsdata(321, "Computer Science");
        sub1="Java";
    }
    void display()
    {
        System.out.println("Cs dept");
        System.out.println(sub1);
        System.out.println(detid);
        System.out.println(depname);
        System.out.println(cname);

    }

}

class ITstudent extends IT
{
    String sub1;

    void setit()
    {
        getitdata(123,"Info Technology");
        sub1="Sql";
    }
    void display()
    {
        System.out.println("IT dept");
        System.out.println(sub1);
        System.out.println(detid);
        System.out.println(depname);
        System.out.println(cname);

    }
}

public class inheritance3 {
    public static void main(String[] args) {

        CSstudent c = new CSstudent();
        c.setcs();
        c.display();
System.out.println();
        ITstudent i = new ITstudent();
        i.setit();
        i.display();
    }
}
