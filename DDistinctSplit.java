import java.util.*;
public class DDistinctSplit
{
    public static int breakstring(String s)
    {
        int pref[] = new int[s.length()];
        int suf[] = new int[s.length()];
        
        
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
            System.out.println(breakstring(s));
        }    
    }
}