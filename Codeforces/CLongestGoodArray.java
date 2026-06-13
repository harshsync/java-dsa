import java.util.Scanner;
public class CLongestGoodArray
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            long l = ob.nextLong();
            long r = ob.nextLong();
            long d = r - l;

            long k = (long)((1 + Math.sqrt(1 + 8.0 * d)) / 2);

            while (k * (k - 1) / 2 > d)
                k--;

            while ((k + 1) * k / 2 <= d)
                k++;

            System.out.println(k);
}
    }
}