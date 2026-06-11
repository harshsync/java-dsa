import java.util.*;
public class BFileName
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        String str = ob.next();
        int count = 0, k = 0;
        for(int i = 0; i < n; i++)
        {
            char ch = str.charAt(i);
            if(ch == 'x')
            {
                count++;
                if(count >= 3)
                {
                    k++;
                }
                
            }
            else
            {
                count = 0;
            }

        }
        System.out.println(k);
    }
}