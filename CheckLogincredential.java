import java.util.*;
class usernameException extends Exception
{
    public usernameException(String message)
    {
        super(message);
    }
}
class passwordException extends Exception
{
    public passwordException(String message)
    {
        super(message);
    }
}
public class CheckLogincredential
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String username,password;
        System.out.println("Enter username:");
        username= s.nextLine();
        System.out.println("Enter password:");
        password = s.nextLine();
        
        int length = username.length();
        try
         {
            if (length<6) 
                throw new usernameException("Username must be greater than 6 characters long.");
                else if(!password.equals("hello"))
                    throw new passwordException("Incorrect password \n Type correct password??");
                else
                    System.out.println("Login successful!");
                }
            catch (usernameException u) 
            {
            u.printStackTrace();
            }
            catch (passwordException p) 
            {            p.printStackTrace();
        }
        finally
        {
            System.out.println("Login process completed.");
        }
    }
}