import java.util.*;
class casino
{
    int l,real,r;
    casino(int l, int r, int real)
    {
        this.l = l;
        this.real = real;
        this.r = r;
    }
}
public class DThisIsTheLastTime
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n,k;
            n = ob.nextInt();
            k = ob.nextInt();
            casino arr[] = new casino[n];
            for(int i = 0; i < n; i++)
            {
               int l = ob.nextInt();
               int real = ob.nextInt();
               int r = ob.nextInt();
               arr[i] = new casino(l,r,real); 
            }
            System.out.println(maxcoins(arr, k));
        }
         
        public static int maxcoins(Casino arr[], int k)
        {
            
        }
    }
}