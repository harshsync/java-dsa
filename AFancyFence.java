import java.util.*;
public class AFancyFence
{
    public static boolean anglecheck(int a)
    {
         return 360 % (180 - a) == 0;
    }

    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int a = ob.nextInt();
            System.out.println(anglecheck(a)?"YES": "NO");
        }
    }
}