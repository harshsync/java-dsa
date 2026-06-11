import java.util.*;
public class APetyaAndStrings
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        s = s.toLowerCase();   
        String s2 = ob.nextLine();
        s2 = s2.toLowerCase();
        int ans  = s.compareTo(s2);
        if(ans < 0)
        {
            ans = -1;
        }
        else if(ans > 0)
        {
            ans = 1;
        }
        else
        {
            ans = 0;
        }
        System.out.println(ans);
    }

}