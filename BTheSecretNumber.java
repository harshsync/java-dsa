import java.util.*;
public class BTheSecretNumber
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            long n = ob.nextLong();
            ArrayList<Long> arr = new ArrayList<>();
            long p = 1;
            for(int i = 1; i <= 18; i++)
            {
                p = p * 10;
                long f = p + 1;
                if(n % f == 0)
                {
                    arr.add((long)n/f);
                }
            }
            System.out.println(arr.size());
            if(arr.size() > 0)
            {
                for(int i = arr.size() - 1; i >= 0; i--)
                {
                    System.out.print(arr.get(i) + " ");
                }
                System.out.println();
            }
        }    
    }
}