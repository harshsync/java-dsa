import java.util.*;
public class BSkibidusAndOhio
{
    public static int minchars(String s)
    {
        for(int i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                return 1;
            }
        }
        return s.length();
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        ob.nextLine();
        while(tests-- > 0)
        {
            String s = ob.nextLine();
            System.out.println(minchars(s));
        }    
    }
}