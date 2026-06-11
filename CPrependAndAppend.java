import java.util.*;
public class CPrependAndAppend
{
    public static int shortposs(String s)
    {
        int l = s.length();
        if(l == 1)
        {
            return l;
        }
        int si = 0, ei = l - 1;

        while(si < ei)
        {
            if((s.charAt(si) == '0' && s.charAt(ei) == '1') || (s.charAt(si) == '1' && s.charAt(ei) == '0'))
            {
                l -= 2;
                si++;
                ei--;
            }
            else
            {
                break;
            }
        }
        return l;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int l = ob.nextInt();
            ob.nextLine();
            String s = ob.nextLine();
            System.out.println(shortposs(s));
        }
    }
}