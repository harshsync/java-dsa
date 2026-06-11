import java.util.*;
public class CAlternatingSubsequence
{
    public static long maxsum(int arr[])
    {

        int maxp = Integer.MIN_VALUE;
        int maxn = Integer.MIN_VALUE;
        long sum = 0;
        boolean b = true;
        if(arr[0] < 0)
        {
            b = false;
        }

        for(int x : arr)
        {
            if(x > 0)
            {
                maxp = Math.max(maxp,x);
                if(!b)
                {
                    sum += maxn;
                    maxn = Integer.MIN_VALUE;
                    b = true;
                }
            }
            else
            {
                maxn = Math.max(maxn,x);
                if(b)
                {
                    sum += maxp;
                    maxp = 0;
                    b = false;
                }
            }
        }
        if(b)
        {
            sum += maxp;
        }
        else
        {
            sum += maxn;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();

        while(tests-- > 0)
        {
            int n = ob.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = ob.nextInt();
            }
            System.out.println(maxsum(arr));
        }    
    }
}