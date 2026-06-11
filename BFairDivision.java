import java.util.*;
public class BFairDivision
{
    public static boolean dividecheck(int arr[])
    {
        int sum = 0;
        int ones = 0, twos = 0;
        for(int x : arr)
        {
            sum += x;
            if(x == 1)
            {
                ones++;
            }
            else
            {
                twos++;
            }
        }
        if(sum % 2 != 0)
        {
            return false;
        }
        int dem = sum/2;
        if((dem % 2 != 0) && ones == 0)
        {
            return false;
        }
        return true;
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
            System.out.println(dividecheck(arr)?"YES":"NO");
            
        }    
    }
}