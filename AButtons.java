import java.util.*;
public class AButtons
{
    public static String annieokate(int a, int b, int c)
    {
        if(a > b)
        {
            return "First";
        }
        else if(a < b)
        {
            return "Second";
        }
        else if(a == b)
        {
            if(c % 2 == 0)
            {
                return "Second";
            }
            else
            {
                return "First";
            }
        }
        return "First";
        
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int a,b,c;
            a = ob.nextInt();
            b = ob.nextInt();
            c = ob.nextInt();
            System.out.println(annieokate(a, b, c));
        }    
    }
}