import java.util.*;
class shape
{
    void calculateArea(float side)
    {
       System.out.println("Area of square is: " + (side * side));
    }
    void calculateArea(int length, int breadth)
    {
        System.out.println("Area of rectangle is: " + (length * breadth));
    }
    void calculateArea(double radius)
    {
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle is: " + area);
    }
    public static void main(String[] args)
    {
        shape s = new shape();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the side of square: ");
       float side = sc.nextFloat();
       s.calculateArea(side);


       System.out.print("Enter the length and breadth of rectangle: ");  
        int length = sc.nextInt();
       int breadth = sc.nextInt();
       s.calculateArea(length ,breadth);


        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        s.calculateArea(radius);
       
       
    }

}