import java.util.*;
public class BBooks
{
    public static int maxbook(int arr[], int t)
    {
        Arrays.sort(arr);
        int c  = 0;
        for(int x : arr)
        {
            if((t-x) < 0)
            {
                break;
            }
            t -= x;
            c++;
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int b = ob.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = ob.nextInt();
        } 
        System.out.println(maxbook(arr, b));   
    }
}