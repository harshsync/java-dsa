import java.util.*;

public class CWordGame
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);

        int tests = ob.nextInt();

        while(tests-- > 0)
        {
            int n = ob.nextInt();

            String a[] = new String[n];
            String b[] = new String[n];
            String c[] = new String[n];

            HashMap<String,Integer> freq = new HashMap<>();

            for(int i = 0; i < n; i++)
            {
                a[i] = ob.next();
                freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
            }

            for(int i = 0; i < n; i++)
            {
                b[i] = ob.next();
                freq.put(b[i], freq.getOrDefault(b[i], 0) + 1);
            }

            for(int i = 0; i < n; i++)
            {
                c[i] = ob.next();
                freq.put(c[i], freq.getOrDefault(c[i], 0) + 1);
            }

            int g1 = 0, g2 = 0, g3 = 0;

            for(String s : a)
            {
                if(freq.get(s) == 1) g1 += 3;
                else if(freq.get(s) == 2) g1 += 1;
            }

            for(String s : b)
            {
                if(freq.get(s) == 1) g2 += 3;
                else if(freq.get(s) == 2) g2 += 1;
            }

            for(String s : c)
            {
                if(freq.get(s) == 1) g3 += 3;
                else if(freq.get(s) == 2) g3 += 1;
            }

            System.out.println(g1 + " " + g2 + " " + g3);
        }
    }
}