import java.util.*;
public class CShowering
{
    public static boolean posshower(int time[][], int s, int tot)
    {
        if(time[0][0] >= s)
        {
            return true;
        }

        for(int i = 1; i < time.length; i++)
        {
            if((time[i][0] - time[i-1][1]) >= s)
            {
                return true;
            }
        }
        if((tot - time[time.length - 1][1]) >= s)
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
            int n = ob.nextInt();
            int s = ob.nextInt();
            int tot = ob.nextInt();
            int time[][] = new int[n][2];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < 2; j++)
                {
                    time[i][j] = ob.nextInt();
                }
            }
            System.out.println(posshower(time, s, tot)?"YES":"NO");
        }    
    }
}