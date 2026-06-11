import java.util.*;
public class AAddAndDivide
{
    public static int operations(int a, int b)
    {
        if(a < b)
        {
            return 1;
        }
        int ops = 0;
        if(b % 2 == 0)
        {
            ops++;
            b++;
        }
        if(b == 1)
        {
            ops += 2;
            b += 2;
        }
        while(a > 0)
        {
            a = a / b;
            ops++;
        }
        return ops;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int a = ob.nextInt();
            int b = ob.nextInt();
            System.out.println(operations(a, b));
        }     
    }
}