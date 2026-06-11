import java.util.*;
public class AKoshary
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int x = ob.nextInt();
            int y = ob.nextInt();
            if(x % 2 != 0 && y % 2 != 0)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }    
    }
}