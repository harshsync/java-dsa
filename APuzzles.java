import java.util.*;
public class APuzzles
{
    public static int mizpuzzle(int n, int arr[])
    {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = n-1; i < arr.length; i++)
        {
            min = Math.min(min,(arr[i] - arr[i-(n-1)]));
        }
        return min;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int m = ob.nextInt();
        int arr[] = new int[m];
        for(int i = 0; i < m; i++)
        {
            arr[i] = ob.nextInt();
        }  
        System.out.println(mizpuzzle(n, arr));
    }
}