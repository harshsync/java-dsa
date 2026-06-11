import java.util.*;
public class C_Pacer
{
    public static int pace(int a[], int b[], int m)
    {
        int af = 0, bf = 0;
        int diff = 0, posdif = 0, pts = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            diff = a[i] - af;
            posdif = b[i] - bf;
            af = a[i];
            bf = b[i]; 

            if((diff % 2 == 0 && posdif % 2 == 0) || (diff % 2 != 0 && posdif % 2 != 0))
            {
                pts += diff;
            }
            else
            {
                pts = (pts + diff) - 1;
            }
        }
        pts = pts + (m - af);
        return pts;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n,m;
            n = ob.nextInt();
            m = ob.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                a[i] = ob.nextInt();
                b[i] = ob.nextInt();
            } 
            System.out.println(pace(a,b,m)); 
        }  
    }
}