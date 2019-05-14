
class Harry
{
    String name;
    int age;
    double salary;

    Harry(String x,int y,double z)                                      //parameterized constructor
    {
        name=x;
        age=y;
        salary=z;                                                       // setting variables values
    }
}
public class HarryDetails{

    public static void main(String[] args)
    {
        Harry harry=new Harry("Harry Potter",30,2500.3);        //assigning values
        System.out.println("Members name:"+harry.name);
        System.out.println("Members age:"+harry.age);
        System.out.println("Members salary:"+harry.salary);
    }
}