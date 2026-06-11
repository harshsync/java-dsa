import java.util.*;
public class BInterceptedInputs
{
    public static void dim(int arr[])
    {
        int mul = arr.length - 2;
        Arrays.sort(arr);
        int si = 0, ei = arr.length - 1;
        while(si < ei)
        {
            if(arr[si] * arr[ei] < mul)
            {
                si++;
            }
            else if(arr[si] * arr[ei] > mul)
            {
                ei--;
            }
            else
            {
                System.out.println(arr[si] + " " + arr[ei]);
                break;
            }
        }
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
            dim(arr);
        }    
    }
}