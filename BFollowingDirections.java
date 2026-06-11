import java.util.*;
public class BFollowingDirections
{
    public static boolean direction(String s)
    {
        int x = 0, y = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == 'U')
            {
                y++;
            }
            else if(ch == 'R')
            {
                x++;
            }
            else if(ch == 'D')
            {
                y--;
            }
            else
            {
                x--;
            }
            if(x == 1 && y == 1)
            {
                return true;
            }
           
        }
        return false;
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
            System.out.println(direction(s)?"YES":"NO");
        }    
    }
}