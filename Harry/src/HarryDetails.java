
class Harry
{
    String name;
    int age;
    double salary;

    Harry(String x,int y,double z)
    {
        name=x;
        age=y;
        salary=z;
    }
}
public class HarryDetails{

    public static void main(String[] args)
    {
        Harry harry=new Harry("Harry Potter",30,2500.3);
        System.out.println("Members name:"+harry.name);
        System.out.println("Members age:"+harry.age);
        System.out.println("Members salary:"+harry.salary);
    }
}