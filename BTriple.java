import java.util.*;
public class BTriple
{
    public static int trip(int arr[])
    {
        Arrays.sort(arr);
        int c = 1;
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                c++;
            }
            else
            {
                c = 1;
            }
            if(c == 3)
            {
                return arr[i];
            }

        }
        return -1;
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
            System.out.println(trip(arr));
        }
        
    }
}