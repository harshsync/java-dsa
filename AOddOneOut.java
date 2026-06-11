import java.util.Scanner;
public class AOddOneOut
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int x = 0;
            int a = ob.nextInt();
            x = x ^ a;
            int b = ob.nextInt();
            x = x ^ b;
            int c = ob.nextInt();
            x = x ^ c;
            System.out.println(x);
        }
    }
}