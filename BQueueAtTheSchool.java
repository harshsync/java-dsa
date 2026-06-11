import java.util.*;
public class BQueueAtTheSchool
{
    public static String bgarrangement(String s, int t)
    {
        StringBuilder sb = new StringBuilder(s);
        while(t-- > 0)
        {
            for(int i = 0; i < sb.length() - 1; i++)
            {
                char ch = sb.charAt(i);
                char ch2 = sb.charAt(i+1);
                if(ch == 'B' && ch2 == 'G')
                {
                    sb.replace(i, i+2, "GB");

                    i += 1;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        ob.nextInt();
        int t = ob.nextInt();
        ob.nextLine();
        String s = ob.nextLine();
        System.out.println(bgarrangement(s, t));     
    }
}