import java.util.*;
public class BSwapAndDelete
{
    public static int remains(String s)
    {
       int zeros = 0, ones = 0;
       int j;
       for(int i = 0; i < s.length(); i++)
       {
            char ch = s.charAt(i);
            if(ch == '0')
            {
                zeros++;
            }
            else
            {
                ones++;
            }
       }

       for(j = 0; j < s.length(); j++)
       {
            char ch = s.charAt(j);
            if(ch == '0')
            {
                if(ones > 0)
                {
                    ones--;
                }
                else
                {
                    break;
                }
            }
            else
            {
                if(zeros > 0)
                {
                    zeros--;
                }
                else
                {
                    break;
                }
            }
       }
       return s.length() - j;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        ob.nextLine();
        while(tests-- > 0)
        {
            String s = ob.nextLine();
            System.out.println(remains(s));
        }    
    }
}