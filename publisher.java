import java.util.*;
public class publisher
 {
    String publisher;
    publisher(String publi)
    {
        this.publisher = publi;
    }
    
}
class book{
    String name;
    publisher publisher;
    book(){}
    public book(String name,publisher publisher)
    {
        this.name = name;
        this.publisher = publisher;
    }
}
class litrature extends book
{
   String lit_type = "Litrature";
    litrature(String name, publisher publisher)
    {
         super(name, publisher);
    }
    void display()
    {
        System.out.println(" name: " + name);
        System.out.println("Publisher: " + this.publisher.publisher);
        System.out.println("Type: " + this.lit_type);
    }
}
class fiction extends book
{
    String lit_type = "Fiction";
    fiction(String name, publisher publisher)
    {
         super(name, publisher);
    }
    void display()
    {
        System.out.println(" name: " + super.name);
        System.out.println("Publisher: " + this.publisher.publisher);
        System.out.println("Type: " + this.lit_type);
    }


        public static void main(String[] args)
    {
        publisher p1 = new publisher("s.chanth");
        litrature l1 = new litrature("To Kill a Mockingbird", p1);
        l1.display();

        publisher p2 = new publisher("HarperCollins");
        fiction f1 = new fiction("The Great Gatsby", p2);
        f1.display();
        
       
    }
}