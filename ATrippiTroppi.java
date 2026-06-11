import java.util.*;
public class ATrippiTroppi
{
    public static String firstalpha(String s)
    {
        StringBuilder sb = new StringBuilder("");
        sb.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == ' ')
            {
               sb.append(s.charAt(i+1));
            }
        }
        String ans = sb.toString();
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        ob.nextLine();
        while(tests-- > 0)
        {
            
            String s = ob.nextLine();
            System.out.println(firstalpha(s));
        }   
    }
}