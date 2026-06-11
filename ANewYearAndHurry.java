import java.util.*;
public class ANewYearAndHurry
{
    public static int partycheck(int n, int k)
    {
        int time = 240 - k;
        int sum = 0;
        int i;
        for(i = 1; i <= n; i++)
        {
            sum += 5 * i;
            if (sum > time)
            {
                break;
            }
        }
        return i-1;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n,k;
        n = ob.nextInt();
        k = ob.nextInt();
        System.out.println(partycheck(n, k));    
    }
}