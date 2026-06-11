import java.util.Scanner;
public class CTheLegendOfFreyaTheFrog
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int x = ob.nextInt();
            int y = ob.nextInt();
            int k = ob.nextInt();
            int xm = Math.ceilDiv(x, k);
            int ym = Math.ceilDiv(y, k);
            int m = 0;
            if(xm > ym)
            {
                m = (xm * 2) - 1;
            }
            else
            {
                m = ym * 2;
            }
            System.out.println(m);
        }    
    }
    // public static int calc(int n, int d)
    // {
    //     int q = n/d;
    //     int r = n%d;
    //     r = (r>0)?1:0;
    //     int moves = (q * 2) + (r * 2);
    //     return moves;
    // }
}