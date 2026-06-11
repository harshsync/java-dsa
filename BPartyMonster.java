import java.util.*;
public class BPartyMonster
{
    public static boolean brackcheck(String s)
    {
        int open = 0,close = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                open++;
            }
            else
            {
                close++;
            }
        }
        return open == close;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            ob.nextInt();
            ob.nextLine();
            String s = ob.nextLine();
            System.out.println(brackcheck(s)?"YES":"NO");
        }    
    }
}