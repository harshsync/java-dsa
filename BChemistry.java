import java.util.*;
public class BChemistry
{
    public static boolean palinposs(String s, int k)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch) + 1);
                continue;
            }
            map.put(ch, 1);
        }
        int odds = 0;
        for(Character ch : map.keySet())
        {
            if(map.get(ch) % 2 != 0)
            {
                odds++;
            }
        }
        if(k >= (odds - 1))
        {
            return true;
        }
        return false;

    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            ob.nextInt();
            int k = ob.nextInt();
            ob.nextLine();
            String s = ob.nextLine();
            System.out.println(palinposs(s, k)?"YES":"NO");
        }    
    }
}

