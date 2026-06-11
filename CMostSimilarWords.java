import java.util.*;
public class CMostSimilarWords
{
    public static int minmoves(String arr[])
    {
        int mincost = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - 1; i++)
        {
            String out = arr[i];
            for(int j = i + 1; j < arr.length; j++)
            {
                int cost = 0;
                String in = arr[j];
                for(int k = 0; k < in.length(); k++)
                {
                    cost += Math.abs((in.charAt(k) - out.charAt(k)));
                }
                mincost = Math.min(mincost, cost);
            }
        }
        return mincost;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            int m = ob.nextInt();
            ob.nextLine();
            String arr[] = new String[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = ob.nextLine();
            }
            System.out.println(minmoves(arr));
        }    
    }
}