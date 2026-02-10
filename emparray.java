import java.util.*;
 public class emparray
 {   
    
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
    public static void main(String[]args)
    {
       int i,n=3;
       int No;
       emparray emp[]=new emparray[n];
       for(i=0;i<n;i++){

        emp[i]=new emparray();
        emp[i].get();
       }
       System.out.println("search");
       while(true)
        {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ID:");
        No=Integer.parseInt(sc.nextLine());
        for(i=0;i<n;i++)
            {
            if(emp[i].id==No)
                {
                emp[i].display();
                break;
               
            }
        }
       }
    }
}
