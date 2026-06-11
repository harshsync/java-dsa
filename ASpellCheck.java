import java.util.*;
public class ASpellCheck
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        
        while(tests-- > 0)
        {
            HashSet<Character> set = new HashSet<>();
        set.add('T');
        set.add('i');
        set.add('m');
        set.add('u');
        set.add('r');
            ob.nextInt();
            ob.nextLine();
            String s = ob.nextLine();
            int i; 
            for(i = 0; i < s.length(); i++)
            {
                char ch = s.charAt(i);
                if(set.contains(ch))
                {
                    set.remove(ch);
                }
            }
            System.out.println(set.size() == 0 && i == 5?"YES":"NO");
        }
    }
}