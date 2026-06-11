import java.util.*;
public class DSlavicSExam
{
    public static void stsub(String s, String t)
    {
        
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        ob.nextLine();
        while(tests-- > 0)   
        {
            String s = ob.nextLine();
            String t = ob.nextLine();
            StringBuilder sb = new StringBuilder("");
            int p1 = 0, p2 = 0;
            while(p1 < s.length() && p2 < t.length())
            {
                char ch1 = s.charAt(p1);
                char ch2 = t.charAt(p2);

                if(ch1 == ch2)
                {
                    p1++;
                    p2++;
                    sb.append(ch1);
                }
                else if(ch1 == '?')
                {
                    p2++;
                    p1++;
                    sb.append(ch2);
                }
                else if(ch1 != ch2)
                {
                    p1++;
                    sb.append(ch1);
                }

            }
            for(int i = p1; i < s.length(); i++)
            {
                if(s.charAt(i) == '?')
                {
                    sb.append('a');
                    continue;
                }
                sb.append(s.charAt(i));
            }
            if(p2 == t.length())
            {
                System.out.println("YES");
                System.out.println(sb);
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}