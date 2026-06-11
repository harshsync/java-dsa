import java.util.*;
public class AErasingZeroes
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        ob.nextLine();
        while(t-- > 0)
        {
            String s = ob.nextLine();
            int idx = s.indexOf('1');
            int c = 0;
            int m = 0;
            for(int i = idx + 1; i < s.length(); i++)
            {
                char ch = s.charAt(i);
                if(ch == '0')
                {
                    m++;
                }
                else
                {
                    c += m;
                    m = 0;
                }
            }
            System.out.println(c);
        }   
    }
}