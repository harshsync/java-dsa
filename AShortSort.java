import java.util.*;
public class AShortSort
{
    public static boolean swapsoo(String s)
    {
       boolean b = false; 
       if(s.charAt(0) == 'a')
       {
          b = true;
       }
       else if(s.charAt(1) == 'b')
       {
          b = true;
       }
       else if(s.charAt(2) == 'c')
       {
          b = true;
       }
       return b;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        ob.nextLine();
        while(tests-- > 0)
        {
            String s = ob.nextLine();
            System.out.println(swapsoo(s)?"YES":"NO");
        }    
    }
}