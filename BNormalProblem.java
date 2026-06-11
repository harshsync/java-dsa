import java.util.*;
public class BNormalProblem
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        ob.nextLine();
        while(tests-- > 0)
        {
            String s = ob.nextLine();
            StringBuilder sb = new StringBuilder("");
            for(int i = s.length() - 1; i >= 0; i--)
            {
                char ch = s.charAt(i);
                if(ch == 'q')
                {
                    sb.append('p');
                }
                else if(ch == 'p')
                {
                    sb.append('q');
                }
                else
                {
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }    
    }
}