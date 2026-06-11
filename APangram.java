import java.util.*;
public class APangram
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        ob.nextInt();
        ob.nextLine();
        String s = ob.nextLine();
        s = s.toLowerCase();
        int alph[] = new int[26];
        for(char ch : s.toCharArray())
        {
            alph[ch - 'a']++;
        }
        boolean b = true;
        for(int x : alph)
        {
            if(x == 0)
            {
                b = false;
                break;
            }
        }
        System.out.println(b?"YES":"NO");
    }
}