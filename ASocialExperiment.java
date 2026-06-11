import java.util.*;
public class ASocialExperiment
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            if( n <= 3)
            {
                System.out.println(n);
            }
            else if(n % 2 == 0)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(1);
            }
        }    
    }
}