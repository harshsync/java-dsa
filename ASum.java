import java.util.*;
public class ASum
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int a,b,c;
            a = ob.nextInt();
            b = ob.nextInt();
            c = ob.nextInt();
            boolean be = false;
            if((a+b) == c)
            {
                be = true;
            }
            else if((a+c) == b)
            {
                be = true;
            }
            else if((c+b) == a)
            {
                be  = true;
            }
            System.out.println(be?"YES":"NO");
        }
    }
}