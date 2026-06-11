import java.util.Scanner;
public class AABAgain
{
   public static void main(String[] args)
   {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int n = ob.nextInt();
            int s = 0;
            while(n > 0)
            {
                int d = n % 10;
                s += d;
                n = n/10;
            }
            System.out.println(s);
        } 
   } 
}