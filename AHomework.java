import java.util.*;
public class AHomework
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            ob.nextInt();
            ob.nextLine();
            String a = ob.nextLine();
            int m = ob.nextInt();
            ob.nextLine();
            String b = ob.nextLine();
            String c = ob. nextLine();
            StringBuilder sb = new StringBuilder(a);
            for(int i = 0; i < m; i++)
            {
                char ch = c.charAt(i);
                if(ch == 'D')
                {
                    sb.append(b.charAt(i));
                } 
                else
                {
                    sb.insert(0,b.charAt(i));
                }
            }
            System.out.println(sb);
        }    
    }
}