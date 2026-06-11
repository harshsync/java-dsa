import java.util.*;
public class A_Sieve_of_Erato_67_henes
{
    public static boolean erato(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 67)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
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
            System.out.println(erato(arr)?"YES":"NO");
        }
    }
}