 import java.util.*;
 public class emp {
    
    int id;
    String name;
    float salary;
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id");
        id=sc.nextInt();
        System.out.println("enter name");
        name=sc.next();
        System.out.print("enter monthly salary:");
        salary=sc.nextFloat();
    }

    public void display()
    {
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("monthly salary:"+salary);
    }
    public static void main(String[] args)
     {
        emp e1=new emp();
        e1.get();
        e1.display();

         emp e2=new emp();
        e2.get();
        e2.display();

         emp e3=new emp();
        e3.get();
        e3.display();
    }
}
