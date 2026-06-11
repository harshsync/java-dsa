import java.util.*;
public class ADbmbAndTheArray
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int n,s,x;
            n = ob.nextInt();
            s = ob.nextInt();
            x = ob.nextInt();
            int sum = 0;
            for(int i = 0; i < n; i++)
            {
                int a = ob.nextInt();
                sum += a;
            }
            sum = s - sum;
            if(sum < 0)
            {
                System.out.println("NO");
            }
            else
            {
                if(sum % x == 0)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }

        }    
    }
}