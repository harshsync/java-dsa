import java.util.*;
public  class A_Sublime_Sequence
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int x,n;
            x = ob.nextInt();
            n = ob.nextInt();
            if(n % 2 == 0)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println(x);
            }
        }    
    }
}
