import java.util.*;
public class CReplaceAndSum
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        
        int t = ob.nextInt();

        while(t -- > 0)
        {

            int n = ob.nextInt();
            int q = ob.nextInt();
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

            while(q-- > 0)
            {
                int l = ob.nextInt();
                int r = ob.nextInt();
                int sum = 0;
                int i = n - 1;

                for(i = l - 1; i < r - 1; i++)
                {
                    int max = a[i];
                    sum += Math.max(max,(Math.max(a[i+1],b[i])));
                }
                sum += Math.max(a[i],b[i]);
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}