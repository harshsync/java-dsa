import java.util.*;
public class CTwoBrackets
{
    public static int erasebracket(String s)
    {
        int round = 0, square = 0, count = 0;

        for (char ch : s.toCharArray())
        {
            if (ch == '(')
            {
               round++;
            }
            else if (ch == ')')
            {
                if (round > 0)
                {
                    count++;
                    round--;
                }
            }
            else if (ch == '[')
            {
                square++;
            }
            else if (ch == ']') 
            {
                if (square > 0)
                {
                    count++;
                    square--;
                }
            }
        }
            return count;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        ob.nextLine();
        while(tests-- > 0)
        {
            String s = ob.nextLine();
            System.out.println(erasebracket(s));
        }    
    }
}