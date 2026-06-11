import java.util.*;
public class BNoCasinoInTheMountains
{
    public static int peaks(int arr[], int k)
    {
        int tempk = k;
        int hikes = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
            {
                tempk--;
                if(tempk == 0)
                {
                    hikes++;
                    tempk = k;
                    i++;
                    continue;
                }
            }
            else if(arr[i] == 1)
            {
                tempk = k;
            }
        }
        return hikes;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n,k;
            n = ob.nextInt();
            k = ob.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = ob.nextInt();
            }
            System.out.println(peaks(arr,k));
        }    
    }
}