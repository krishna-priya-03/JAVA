interface student
{
    int score=10;
    void displayscore();
}
interface sports
{
    int score=25;
    void displaysports();
}
class result implements student,sports
{
    public void displayscore()
    {
        System.out.println("academic score: "+student.score);
    
    }
    public void displaysports()
    {
        System.out.println("sports score is : "+sports.score);
    
    }
}
public class sportresult
{
    public static void main(String[] args) {
        result r=new result();
        r.displayscore();
        r.displaysports();
    }
}