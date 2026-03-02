import java.util.*;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double r;

    Circle(double r)                        /*constructor method */
     {
        this.r = r;
    }

    public double area() {
        return 3.14 * r * r;
    }

    public double perimeter() {
        return 2 * 3.14 * r;
    }
}

class Rectangle implements Shape {
    double l, b;

    Rectangle(double l, double b)                        /*constructor method */
    
    {
        this.l = l;
        this.b = b;
    }

    public double area() {
        return l * b;
    }

    public double perimeter() {
        return 2 * (l + b);
    }
}

public class interfacearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  your choice:, 1  for circle and 2 for rectangle: ");

        int ch = sc.nextInt();
      

        if (ch == 1)                                /*simgle  time user choice */
            {

            System.out.print("Enter radius: ");
            double r = sc.nextDouble();

            Circle c = new Circle(r);                               /*object creation ..constuctor method object instantiation */

           
            System.out.println("Area = " + c.area());
            System.out.println("Perimeter = " + c.perimeter());
        } 



        else if (ch == 2) {
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter breadth: ");
            double b = sc.nextDouble();

                    
            Rectangle r = new Rectangle(l, b);                          /*object creation ..constuctor method object instantiation  object is r*/

            System.out.println("Area = " + r.area());
            System.out.println("Perimeter = " + r.perimeter());             /*object .method in recatngle class */
        } 


        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
