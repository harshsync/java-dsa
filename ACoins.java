import java.util.*;
public class ACoins
{
    public static boolean xysatisfy(long n, long k)
    {
        if(n % 2 == 0 || n % k == 0)
        {
            return true;
        }
        n -= k;
        long xrem = n % 2;
        long yrem = xrem % k;
        if(yrem == 0)
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
            long n,k;
            n = ob.nextLong();
            k = ob.nextLong();
            System.out.println(xysatisfy(n, k)?"YES":"NO");
        }    
    }
}