import java.util.*;
public class AIsItACat
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int n = ob.nextInt();
            ob.nextLine();
            String s = ob.nextLine();
            s = s.toLowerCase();
            boolean b = true;
            StringBuilder sb = new StringBuilder("");
            sb.append(s.charAt(0));
            for(int i = 1; i < n; i++)
            {
                char ch = s.charAt(i);
                if(s.charAt(i) != s.charAt(i - 1))
                {
                    sb.append(s.charAt(i));
                }

            }
            if((sb.toString().equals("meow")) && b)
                System.out.println("YES");

            else
                System.out.println("NO");
        }    
    }
}