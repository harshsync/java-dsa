import java.util.*;
public class AMinimize
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int a = ob.nextInt();
            int b = ob.nextInt();
            System.out.println(b-a);
        }
    }
}