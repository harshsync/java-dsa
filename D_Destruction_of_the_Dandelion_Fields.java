import java.util.*;
public class D_Destruction_of_the_Dandelion_Fields
{
    public static long destruc(int arr[])
    {
        Arrays.sort(arr);
        ArrayList<Integer> odd = new ArrayList<>();
        long sum = 0;
        boolean b = false;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                sum += arr[i];
            }
            else
            {
                odd.add(arr[i]);
            }
        }
        int l = odd.size();
        int take = (l + 1) / 2;
        for(int i = l - 1; i >= l - take; i--)
        {
            sum += odd.get(i);
        }
        return (odd.size() != 0)?sum:0;
    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tests = ob.nextInt();
        while(tests-- > 0)
        {
            int n = ob.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = ob.nextInt();
            }
            System.out.println(destruc(arr));
        }
    }
}
