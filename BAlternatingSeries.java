import java.util.*;
public class BAlternatingSeries
{
    public static void altarray(int n)
    {
        for(int i = 0; i < n - 1; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print("-1 ");
            }
            else
            {
                System.out.print("3 ");
            }

        }
        if(n % 2 == 0)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("-1");
        }
    } 

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            altarray(n);
        }    
    }
}