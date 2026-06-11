import java.net.SocketPermission;
import java.util.*;
public class A_Flip_Flops
{
    public static long ff(long c,long k, int nums[])
    {
        Arrays.sort(nums);
        long damage, incdam;
        for(int i = 0; i < nums.length; i++)
        {
            if(c >= nums[i])
            {
                damage = c - nums[i];
                incdam = Math.min(k,damage);
                k -= incdam;
                c += nums[i] + incdam;
            }
            else
            {
                break;
            }
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while (tests-- > 0)
        {
            int n;
            long c,k;
            n = ob.nextInt(); 
            c = ob.nextLong();
            k = ob.nextLong();
            int nums[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                nums[i] = ob.nextInt();
            } 
            System.out.println(ff(c,k,nums));
        }
    }
}