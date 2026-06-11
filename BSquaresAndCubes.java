import java.util.Scanner;
public class BSquaresAndCubes
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int n = ob.nextInt();
            int sq = (int)Math.sqrt(n);
            int cu = (int)Math.cbrt(n);
            int six = (int)Math.round(Math.pow(n, 1.0 / 6));

            while((long)Math.pow(six + 1, 6) <= n) six++;
            while((long)Math.pow(six, 6) > n) six--;
            System.out.println(sq+cu-six);
        }    
    }
}