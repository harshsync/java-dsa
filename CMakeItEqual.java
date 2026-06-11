import java.util.*;
public class CMakeItEqual
{
    public static boolean sandt(int s[], HashMap<Integer,Integer> t,int k)
    {
        int sum,sub;
        for(int i = 0; i < s.length; i++)
        {
            sum = s[i] + k;
            sub = Math.abs((s[i] - k));
            if(t.containsKey(sum))
            {
                t.put(sum, t.get(sum) - 1);
            }
            else if(t.containsKey(sub))
            {
                t.put(sub, t.get(sub) - 1);
            }
            else if(t.containsKey(s[i]))
            {
                t.put(s[i], t.get(s[i]) - 1);
            }
        }
        for(int x : t.keySet())
        {
            if(t.get(x) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            int k = ob.nextInt();
            int s[] = new int[n];
            for(int i = 0; i < s.length; i++)
            {
                s[i] = ob.nextInt();
            }
            HashMap<Integer,Integer> t = new HashMap<>();
            for(int i = 0; i < n; i++)
            {
                int x = ob.nextInt();
                t.put(x, t.getOrDefault(x, 0) + 1);
            }
            System.out.println(sandt(s,t,k)?"YES":"NO");
        }    
    }
}