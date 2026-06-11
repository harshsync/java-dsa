import java.util.*;
public class BIncreasing
{
    public static boolean poss(int arr[])
    {
        Set<Integer> set = new HashSet<>();
        for(int x : arr)
        {
            set.add(x);
        }
        return set.size() == arr.length;
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
            System.out.println(poss(arr)?"YES":"NO");
        }    
    }
}