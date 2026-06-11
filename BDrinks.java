import java.util.*;
public class BDrinks
{
    public static double drink(int arr[])
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        double ans = (double)sum/arr.length;
        return (ans);
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = ob.nextInt();
        }  
        System.out.printf("%.12f", drink(arr));  
    }
}