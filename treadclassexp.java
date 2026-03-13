class multiple5 extends Thread
{
    public void run()
    {
        int num = 5;
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("Thread1-Table5: %d * %d = %d\n", num, i, num * i);
        }
    }
}

class primeN extends Thread
{
    public void run()
    {
        int ct = 0, n = 0, i = 1, j;

        while(n < 5)
        {
            j = 1;
            ct = 0;

            while(j <= i)
            {
                if(i % j == 0)
                    ct++;
                j++;
            }

            if(ct == 2)
            {
                System.out.printf("Thread2-Prime: %d\n", i);
                n++;
            }
            i++;
        }
    }
}

public class treadclassexp
{
    public static void main(String[] args)
    {
        multiple5 m5 = new multiple5();
        primeN pn = new primeN();

        m5.start();
        pn.start();
    }
}