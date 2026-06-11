import java.util.*;
public class CSimpleRepetition
{
    public static boolean isPrime(int x)
    {
        if(x < 2)
        {
            return false;
        }
        for(int i = 2; i * i <= x; i++)
        {
            if(x % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean checkp(int n, int k)
    {
        boolean prime = isPrime(n);
        if(k == 1 && prime)
        {
            return true;
        }
        else if(n == 1 && k == 2)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int x,k;
            x = ob.nextInt();
            k = ob.nextInt();
            System.out.println(checkp(x,k)? "YES" : "NO");
        }    
    }
}