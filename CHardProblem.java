import java.util.*;
public class CHardProblem
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int m = ob.nextInt();
            int a = ob.nextInt();
            int b = ob.nextInt();
            int c = ob.nextInt();
            int mon = 0;
            int rem;
            mon = (m - a)<0?m:a;
            rem = (m - a)<0?0:m-a;
            mon += (m - b)<0?m:b;
            rem += (m - b)<0?0:m-b;
            mon += (rem - c)<0?rem:c;
            System.out.println(mon);

        }    
    }
}