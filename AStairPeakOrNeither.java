import java.util.*;

public class AStairPeakOrNeither
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);

        int tests = ob.nextInt();

        while(tests-- > 0)
        {
            int a = ob.nextInt();
            int b = ob.nextInt();
            int c = ob.nextInt();

            if(a < b)
            {
                if(b > c)
                {
                    System.out.println("PEAK");
                }
                else if(b < c)
                {
                    System.out.println("STAIR");
                }
                else
                {
                    System.out.println("NONE");
                }
            }
            else
            {
                System.out.println("NONE");
            }
        }
    }
}