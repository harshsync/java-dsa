import java.util.*;
public class CClockConversion
{
    public static String timecon(String s)
    {
        String time = "";
        String phase = "AM";
        int hrs = Integer.parseInt((""+s.charAt(0)+s.charAt(1)));
        if(hrs > 12)
        {
            hrs -= 12;
            phase = "PM";
        }
        else if(hrs == 12)
        {
            phase = "PM";
        }
        else if(hrs == 0)
        {
            hrs = 12;
            phase = "AM";
        }
        time = String.format("%02d", hrs) + ":" + (s.substring(3)) + " " + phase;
        return time;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        ob.nextLine();

        while(tests-- > 0)
        {
            String s = ob.nextLine();
            System.out.println(timecon(s));
        }    
    }
}