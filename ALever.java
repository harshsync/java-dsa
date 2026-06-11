import java.util.*;
public class ALever
{
    public static int maxdif(int a[], int b[])
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > b[i])
            {
                sum += a[i] - b[i];
            }
        }
        return ++sum;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                a[i] = ob.nextInt();
            }
            for(int i = 0; i < n; i++)
            {
                b[i] = ob.nextInt();
            }
            System.out.println(maxdif(a, b) );

        }    
    }
}