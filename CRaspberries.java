import java.util.*;
public class CRaspberries
{
    public static int minops(int arr[], int k)
    {
        int mincount = Integer.MAX_VALUE;
        int fcount = 2;

        for(int i = 0; i < arr.length; i++)
        {
            int r = (arr[i] % k) + (k - );
            mincount = Math.min(r,mincount);
            if(k == 4)
            {
                int right = arr[i] + r;
                if((2 >= arr[i] && 2 <= right)||(6 >= arr[i] && 6 <= right)||(10 >= arr[i] && 10 <= right))
                {
                    fcount--;
                }
                if(fcount == 0)
                {
                    return 2;
                }
            }
        }
        return mincount;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            int k = ob.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = ob.nextInt();

            }
            System.out.println(minops(arr, k));
        }    
    }
}