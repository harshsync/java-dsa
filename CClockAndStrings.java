import java.util.*;
public class CClockAndStrings
{
    public static boolean clockintersect(int a, int b, int c, int d)
    {
        int g,s;
        if(a > b)
        {
            g = a;
            s = b;
        }
        else
        {
            g = b;
            s = a;
        }
        return ((c > s && c < g) ^ (d < g && d > s));
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int a,b,c,d;
            a = ob.nextInt();
            b = ob.nextInt();
            c = ob.nextInt();
            d = ob.nextInt();
            System.out.println(clockintersect(a,b,c,d)?"YES" : "NO");
        }
    }
}