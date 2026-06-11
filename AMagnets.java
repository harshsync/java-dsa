import java.util.*;

public class AMagnets
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);

        int n = ob.nextInt();

        String prev = ob.next();
        int groups = 1;

        for(int i = 1; i < n; i++)
        {
            String cur = ob.next();

            if(!cur.equals(prev))
            {
                groups++;
            }

            prev = cur;
        }

        System.out.println(groups);
    }
}