import java.util.*;
public class BExpensiveNumber
{
    public static int mincost(String n)
    {
        int zeros = 0, nzeros = 0;
        int j = 0;
        for(int i = n.length() - 1; i >= 0; i--)
        {
            char ch = n.charAt(i);
            if(ch == '0')
            {
                zeros++;
            }
            else
            {
                j = i;
                break;
            }
        }
        for(int k = j - 1; k >= 0; k--)
        {
            char ch = n.charAt(k);
            if(ch >= '1' && ch <= '9')
            {
                nzeros++;
            }
        }
        return (zeros + nzeros);
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        ob.nextLine();
        while(tests-- > 0)
        {
            String n = ob.nextLine();
            System.out.println(mincost(n));

        }    
    }
}