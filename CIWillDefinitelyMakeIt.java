import java.util.*;
public class CIWillDefinitelyMakeIt
{
    public static boolean maxtower(int arr[], int k)
    {
        int temp = arr[k - 1];
        Arrays.sort(arr);

        // last occurence of k nikalunga khihkhikhihkhi linealry hehhhh

        for(int i = arr.length - 1; i >= 0; i--)
        {
            if(arr[i] == temp)
            {
                k = i;
                break;
            }
        }

        int time = 0;
        int i;
        for(i = k; i < arr.length - 1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                continue;
            }
            if((arr[i] - time) < (arr[i+1] - arr[i]))
            {
                break;
            }
            time += (arr[i+1] - arr[i]);
        }
        return i == arr.length-1;
    }
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        { 
            int n = ob.nextInt();
            int k = ob.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = ob.nextInt();
            }
            System.out.println(maxtower(arr,k)?"YES":"NO");
        }
    }
}