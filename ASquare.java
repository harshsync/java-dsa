import java.util.*;
public class ASquare
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int a1 = ob.nextInt();
            int b1 = ob.nextInt();
            int y = 0, x = 0;
            for(int i = 0; i < 3; i++)
            {
                int a2 = ob.nextInt();
                int b2 = ob.nextInt();
                if(a1 == a2)
                {
                    y = Math.abs((b2 - b1));
                }
                else if(b1 == b2)
                {
                    x = Math.abs((a1 - a2));
                }
                
            }
            System.out.println(x * y);
        }    
    }
}