import java.util.*;
public class BColourblindness
{
    public static boolean blindcheck(String a, String b)
    {
        for(int i = 0; i < a.length(); i++)
        {
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(i);
            if(ch1 == ch2 || ch1 == 'B' && ch2 == 'G' || ch1 == 'G' && ch2 == 'B')
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            ob.nextInt();
            ob.nextLine();
            String a = ob.nextLine();
            String b = ob.nextLine();
            System.out.println(blindcheck(a, b)?"YES":"NO");
        }    
    }
}