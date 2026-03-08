import java.util.Scanner;

class College {
    String collegeName;
    String place;

    // constructor of parent class
    College(String name, String place) {
        this.collegeName = name;
        this.place = place;
    }

    void displayCollege() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Place: " + place);
    }
}

// derived class
class Student extends College {
    int rollNo;
    String course;

    // constructor of child class
    Student(String name, String place, int rollNo, String course) {
        super(name, place); // calling parent constructor
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}

// main class
public class InheritanceConstructorDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter College Name:");
        String cname = sc.nextLine();

        System.out.println("Enter Place:");
        String place = sc.nextLine();

        System.out.println("Enter Roll Number:");
        int roll = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Course:");
        String course = sc.nextLine();

        
       //object creation
        Student s = new Student(cname, place, roll, course);

        // calling base class method
        System.out.println("\n ---student Details ---");
        s.displayCollege();
        s.displayStudent();
    }
}