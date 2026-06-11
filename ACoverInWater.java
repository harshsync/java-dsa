import java.util.*;
public class ACoverInWater
{
    public static int watermin(String s)
    {
        int dots = 0;
        int condots = 0;

        for(char ch : s.toCharArray())
        {
            if(ch == '.')
            {
                dots++;
                condots++;
            }
            else
            {
                condots = 0;
            }
            if(condots >= 3)
            {
                return 2;
            }
        }
        return dots;
    }
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            ob.nextInt();
            ob.nextLine();
            String s = ob.nextLine();
            System.out.println(watermin(s));
        }
    }
}