import java.util.*;

public class AStonesOnTheTable
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);

        int n = ob.nextInt();
        String s = ob.next();

        int count = 0;

        for(int i = 1; i < n; i++)
        {
            if(s.charAt(i) == s.charAt(i - 1))
            {
                count++;
            }
        }

        System.out.println(count);
    }
}