import java.util.*;
public class A_123_sequence
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int arr[] = new int[n];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            arr[i] = ob.nextInt();
            mp.put(arr[i],(mp.getOrDefault(arr[i], 0)+1));
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> ele : mp.entrySet())
        {
            max = Math.max(ele.getValue(), max);
        }
        System.out.println(n - max);
         
    }
}
