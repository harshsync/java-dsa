import java.util.*;
public class BUnconventionalPairs
{
    public static int maxdif(int arr[])
    {
        int maxdif = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i += 2)
        {
            int dif = arr[i] - arr[i-1];
            maxdif = Math.max(maxdif,dif);
        }
        return maxdif;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int n = ob.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = ob.nextInt();
            }
            System.out.println(maxdif(arr));
        }    
    }
}