import java.util.*;

class Employee{
     int empid;
        String name;
        float salary;
        String address;
        Employee(){

        }
        Employee(int empid,String name,float salary,String address){
            this.empid=empid;
            this.name=name;
            this.salary=salary;
            this.address=address;
        }
}
class Teacher extends Employee{
    String dept,sub;
    Teacher(int empid,String name,float salary,String address,String dept,String sub)
    {
        super(empid,name,salary,address);
        this.dept=dept;
        this.sub=sub;
    }
    public void display(){
        System.out.println("Employee id\n:"+empid);
        System.out.println("Name\n:"+name);
        System.out.println("Salary\n:"+salary);
        System.out.println("Address\n:"+address);
        System.out.println("Department\n:"+dept);
        System.out.println("Subject\n:"+sub);
    }
}
public class Teacharrays
{
    public static void main(String args[]){
        System.out.println("Enter the number of teachers");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter  teacher details one by one");
        Teacher teacher[]=new Teacher[n];
        Scanner sc1=new Scanner(System.in);
        int tid;
        String name;
        float salary;
        String add;
        String dept,sub;
        for(int i=0;i<n;i++){
            System.out.println("Enter the teacher id");
            tid=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the teacher name");
            name=sc.nextLine();
            System.out.println("Enter the teacher salary");
            salary=sc.nextFloat();
            System.out.println("Enter the teacher address");
            add=sc.nextLine();
            sc.nextLine();
            System.out.println("Enter the teacher department");
            dept=sc.nextLine();
            System.out.println("Enter the teacher subject");
            sub=sc.nextLine();
            teacher[i]=new Teacher(tid,name,salary,add,dept,sub);
        }
        System.out.println("Teacher details are");
        for(int i=0;i<n;i++){
            teacher[i].display();
        }
    }
}