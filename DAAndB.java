import java.util.*;
public class DAAndB
{
    public static int borders(String s)
    {
        ArrayList<Integer> apos = new ArrayList<>();
        ArrayList<Integer> bpos = new ArrayList<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a')
            {
                apos.add(i);
            }
            else
            {
                bpos.add(i);
            }
        }
        int ma = apos.size()/2;
        int mb = bpos.size()/2;

        int acost = 0;
        int bcost = 0;

        for(char ch : s.toCharArray())
        {
            if(ch == 'a')
            {
                acost +
            }
        }


    }
    
}