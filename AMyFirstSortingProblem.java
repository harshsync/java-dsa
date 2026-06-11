import java.util.*;
public class AMyFirstSortingProblem
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int a = ob.nextInt();
            int b = ob.nextInt();
            if(a < b)
            {
                System.out.println(a+" "+b);
            }
            else
            {
                System.out.println(b+" "+a);
            }
        }    
    }
}