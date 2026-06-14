import java.util.Scanner;
public class BWhoSOpposite
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int a = ob.nextInt();
            int b = ob.nextInt();
            int c = ob.nextInt();
            int m = Math.max(a,Math.max(b,c));
            boolean f = true;
            int d = Math.abs(a-b)*2;
            int ans = 0;
            if(d < m)f = false;
            else
            {
                int dif = Math.abs(a-b);
                if(c + dif > d)
                {
                    ans = c - dif;
                }
                else
                    ans = c + dif;
            }
            System.out.println(f?ans:-1);
        }
    }
}