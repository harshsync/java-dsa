import java.util.Scanner;
public class CCanISquare
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int n = ob.nextInt();
            long s = 0;
            for(int i = 0; i < n; i++)
            {
                int a = ob.nextInt();
                s += a;
            }
            double sq = Math.sqrt(s);
            double ch = Math.ceil(sq);
            if(ch - sq == 0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }    
    }
}