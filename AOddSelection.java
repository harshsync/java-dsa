import java.util.Scanner;
public class AOddSelection
{
    public static boolean oddcount(int arr[], int x)
    {
       int e = 0;
        for(int n : arr)
        {
            if(n % 2 != 0)
            {
                e++;
            }
        }
        if(e % 2 == 0 && arr.length - 1 >= x)return true;
        else if(e % 2 != 0  && arr.length >= x)return true;
        
        return false;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            int x = ob.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = ob.nextInt();

            }
            System.out.println(oddcount(arr, x)?"Yes" : "No");
        }    
    }
}