import java.util.*;
public class C1TheCunningSellerEasyVersion
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int n = ob.nextInt();
            int f= 1;
            int i = 0;
            while(f <= n)
            {
                f *= 3;
                i++;
            }
            i--;
            long p = 0;
            f /= 3;
            int q = n / f;
            p = p +((long) Math.pow(3,i) * (3 + (i/3))) * q;
            n -= (int)Math.pow(3,i)*q;
            p += 3 * n;
            System.out.println(i == 0?p-3 : p);
        }    
    }
}