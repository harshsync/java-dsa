import java.util.*;
public class D1DEraser
{
    public static int blacknwhite(String s, int k)
    {
        int ptr = 0;
        int count = 0;
        while(ptr < s.length())
        {
            if(s.charAt(ptr) == 'B')
            {
                count++;
                ptr += k;
                continue;
            }
            ptr++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            int k = ob.nextInt();
            ob.nextLine();
            String s = ob.nextLine();
            System.out.println(blacknwhite(s, k));
        }    
    }
}