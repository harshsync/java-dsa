import java.util.Scanner;
public class B1PalindromeGameEasyVersion
{
    public static boolean easypalin(String s)
    {
        int zeros = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '0')
            {
                zeros++;
            }
        }
        if(zeros % 2 == 0 || zeros == 1)
        {
            return true;
        }
        return false;
        
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            ob.nextInt();
            ob.nextLine();
            String s = ob.nextLine();
            System.out.println(easypalin(s)?"BOB" : "ALICE");
        }    
    }
}
