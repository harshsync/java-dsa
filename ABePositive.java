import java.util.*;
public class ABePositive
{
    public static int minops(int arr[])
    {
        int z = 0, n = Integer.MIN_VALUE, ns = 0;
        int ans = 0;
        for(int x : arr)
        {
            if(x == 0)
            {
                z++;
            }
            else if(x < 0)
            {
                ns++;
                n = Math.max(n,x);
            }
        }
        if(ns % 2 != 0)
        {
            ans += (n * -1) + 1;
        }
        return ans+z;
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
            System.out.println(minops(arr));
        }    
    }
}
