import java.util.*;
public class B_Lasers
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n,m,x,y;
            n = ob.nextInt();
            m = ob.nextInt();
            x = ob.nextInt();
            y = ob.nextInt();
            int e = n;
            while(e-- > 0)
            {
                ob.nextInt();
            }
            e = m;
            while(e-- > 0)
            {
                ob.nextInt();
            }
            System.out.println(n+m);

        }    
    }
}