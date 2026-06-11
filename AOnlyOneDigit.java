import java.util.*;
public class AOnlyOneDigit
{
    public static int minone(int n)
    {
        int min = Integer.MAX_VALUE;
        while(n > 0)
        {
            int d = n % 10;
            min = Math.min(min, d);
            n = n / 10;
        }
        return min;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            System.out.println(minone(n));
        }    
    }
}