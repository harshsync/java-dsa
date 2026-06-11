import java.util.Scanner; 
public class ADesorting
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-- > 0)
        {
            int n = ob.nextInt();
            int arr[] = new int[n];
            int idx = 0;
            for(int i = 0; i < n; i++)
            {
                arr[i] = ob.nextInt();
            }
            int d = Integer.MAX_VALUE;
            boolean b = true;
            int i = 1;
            for(i = 1; i < n; i++)
            {
                d = Math.min(d, (arr[i] - arr[i-1])/2 + 1);
                
                if(arr[i] < arr[i-1])b = false;
            }
            d = (d==0)?1:d;
            System.out.println(b?d:0);
        }    
    }
}
