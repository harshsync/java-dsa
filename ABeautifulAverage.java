import java.util.*;
public class ABeautifulAverage
{
    public static int maxavg(int arr[])
    {
        int sum = 0;
        int maxavg = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum = 0;
            for(int j = i; j < arr.length; j++)
            {
                sum += arr[j];
                maxavg = Math.max(maxavg,sum/(j-i+1));
            }
        }
        return maxavg;
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
            System.out.println(maxavg(arr));
        }    
    }
}